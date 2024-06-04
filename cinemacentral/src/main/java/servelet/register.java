package servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.DBController;
import Model.registrationmodel;
import util.ValidationUtil;

public class register extends HttpServlet {
   
    
 /**
  * @see HttpServlet#HttpServlet()
  */
 public register() {
     super();
     // TODO Auto-generated constructor stub
 }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     
     String address = request.getParameter("address");
  
     String email = request.getParameter("email");
     String phoneNumber = request.getParameter("phoneNumber");
     String username = request.getParameter("username");
     String password = request.getParameter("password");
     String userid = request.getParameter("userid");

     
     registrationmodel student = new registrationmodel();
     
     student.setUserid(userid);
     student.setAddress(address);
     
     student.setEmail(email);
     student.setPhoneNumber(phoneNumber);
     student.setUsername(username);
     student.setPassword(password);

  // Assuming student is an instance of the Student class
     DBController dbController = new DBController();
     int result = dbController.registerStudent(student);
     if (result > 0) {
         System.out.println("Student registered successfully!");
     } else {
         System.out.println("Failed to register student.");
     }


     if (result == 1) {
         // Registration successful
         request.setAttribute("successMessage", "Registration successful!");
         response.sendRedirect(request.getContextPath() + "/loginform.jsp?success=true");
     } else {
         // Registration failed
         request.setAttribute("errorMessage", "Registration failed. Please try again.");
         request.getRequestDispatcher("/loginform.jsp").forward(request, response);
     }
 }
}
