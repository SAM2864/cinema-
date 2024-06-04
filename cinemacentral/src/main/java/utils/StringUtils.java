package utils;

public class StringUtils {
	// Start: DB Connection
		public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String LOCALHOST_URL = "jdbc:mysql://localhost:3306/cinemacentral";
		public static final String LOCALHOST_USERNAME = "root";
		public static final String LOCALHOST_PASSWORD = "";
		public static final String QUERY_REGISTER_user = "INSERT INTO  user_info (" +
		        " userid,  email, phoneNumber, address, username, password" +
		        ") VALUES (?, ?, ?, ?, ?, ?)";
		public static final String QUERY_LOGIN_USER_CHECK = "SELECT * FROM  user_info  WHERE user_name = ?";
		public static final String QUERY_GET_ALL_STUDENTS = "SELECT * FROM user_accounts";
		public static final String QUERY_DELETE_USER = "DELETE FROM  user_info  WHERE user_name = ?";

		public static final String USERNAME = "username";
		public static final String USERid = "id ";

		public static final String address = "address";
		
		public static final String EMAIL = "email";
		public static final String PHONE_NUMBER = "phoneNumber";

		public static final String PASSWORD = "password";
		public static final String RETYPE_PASSWORD = "retypePassword";
		public static final String MESSAGE_ERROR1= "errorMessage";

		// Start: Validation Messages
		// Register Page Messages
		public static final String MESSAGE_SUCCESS_REGISTER = "Successfully Registered!";
		public static final String MESSAGE_ERROR_REGISTER = "Please correct the form data.";
		public static final String MESSAGE_ERROR_SERVER = "An unexpected server error occurred.";
		public static final String MESSAGE_ERROR_USERNAME = "Username is already registered.";
		public static final String MESSAGE_ERROR_EMAIL = "Email is already registered.";
		public static final String MESSAGE_ERROR_PHONE_NUMBER = "Phone number is already registered.";
		public static final String MESSAGE_ERROR_PASSWORD_UNMATCHED = "Password is not matched.";

		// Login Page Messages
		public static final String MESSAGE_SUCCESS_LOGIN = "Successfully LoggedIn!";
		public static final String MESSAGE_ERROR_LOGIN = "Either username or password is not correct!";

		// Other Messages
		public static final String MESSAGE_SUCCESS_DELETE = "Successfully Deleted!";
		public static final String MESSAGE_ERROR_DELETE = "Cannot delete the user!";
		public static final String MESSAGE_SUCCESS = "successMessage";
		public static final String MESSAGE_ERROR = "errorMessage";
		// End: Validation Messages

		// Start: JSP Route
		public static final String PAGE_URL_LOGIN = "/pages/login.jsp";
		public static final String PAGE_URL_REGISTER = "../pages/register.jsp";
		public static final String PAGE_URL_WELCOME = "/pages/index.jsp";
		public static final String PAGE_URL_HOME = "/pages/home.jsp";
		// End: JSP Route

		// Start: Servlet Route
		public static final String SERVLET_URL_LOGIN = "/login";
		public static final String SERVLET_URL_REGISTER = "/register";
		// End: Servlet Route
}
