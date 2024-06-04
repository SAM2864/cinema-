package servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import com.mysql.cj.util.StringUtils;

import Controller.DBController;
import Model.loginmodel;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;

import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final DBController DBController;

    public LoginServlet() {
        this.DBController = new DBController();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Extract username and password from the request parameters
    	String userName = request.getParameter("email");
    	String password = request.getParameter("password ");

        // Validate the input
        if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
            // Display an error message and return
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Username and password are required.");
      
            return;
        }

        // Create a LoginModel object to hold the user credentials
        loginmodel loginModel = new loginmodel(userName, password);

        // Call the database layer to validate the login credentials
        int loginResult = DBController.getStudentLoginInfo(loginModel);

        // Handle the login result
        if (loginResult == 1) {
            // Login successful
            HttpSession userSession = request.getSession();
            userSession.setAttribute("username ", userName);
            userSession.setMaxInactiveInterval(30 * 60);

            Cookie userCookie = new Cookie("password", userName);
            userCookie.setMaxAge(30 * 60);
            response.addCookie(userCookie);

            request.setAttribute("MESSAGE_SUCCESS","MESSAGE_SUCCESS_LOGIN");
            response.sendRedirect(request.getContextPath() + "PAGE_URL_WELCOME");
        } else {
            if (loginResult == 0) {
                // Username or password mismatch
                request.setAttribute("MESSAGE_ERROR", "MESSAGE_ERROR_LOGIN");
                request.setAttribute("USERNAME", userName);
                request.getRequestDispatcher("PAGE_URL_LOGIN").forward(request, response);
            } else if (loginResult == -1) {
                // Username not found
                request.setAttribute("MESSAGE_ERROR","MESSAGE_ERROR_CREATE_ACCOUNT");
                request.setAttribute("USERNAME", userName);
                request.getRequestDispatcher("PAGE_URL_LOGIN").forward(request, response);
            } else {
                // Internal server error
                request.setAttribute("MESSAGE_ERROR", "MESSAGE_ERROR_SERVER");
                request.setAttribute("USERNAME", userName);
                request.getRequestDispatcher("PAGE_URL_LOGIN").forward(request, response);
            }
        }
    }
}
