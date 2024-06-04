package Controller;
import utils.StringUtils;

import java.lang.ModuleLayer.Controller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.loginmodel;
import Model.registrationmodel;
import model.loginmodel;
public class DBController {  
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(StringUtils.DRIVER_NAME);
		return DriverManager.getConnection(StringUtils.LOCALHOST_URL, StringUtils.LOCALHOST_USERNAME,
				StringUtils.LOCALHOST_PASSWORD);
	}

	public int registerStudent(registrationmodel student) {
		 try {
		        Connection con = getConnection();
		        PreparedStatement stmt = con.prepareStatement(StringUtils.QUERY_GET_ALL_STUDENTS);
		        stmt.setString(1, student.getUsername());
		        stmt.setString(5, student.getEmail());
		        stmt.setString(6, student.getPhoneNumber());
		        stmt.setString(8, student.getAddress()); // Updated to include address
		        stmt.setString(9, student.getUsername());
		        stmt.setString(10, student.getPassword());
		        int result = stmt.executeUpdate();

		    
		     // Check if the update was successful (i.e., at least one row affected)
		     			if (result > 0) {
		     				return 1; // Registration successful
		     			} else {
		     				return 0; // Registration failed (no rows affected)
		     			}

		     		} catch (ClassNotFoundException | SQLException ex) {
		     			// Print the stack trace for debugging purposes
		     			ex.printStackTrace();
		     			return -1; // Internal error
		     		}
		     	}
		public int getStudentLoginInfo(loginmodel loginModel) {
			// Try-catch block to handle potential SQL or ClassNotFound exceptions
			
			try {
				
				PreparedStatement st = getConnection().prepareStatement(StringUtils.QUERY_LOGIN_USER_CHECK);

				st.setString(1, loginModel.getUsername());

				// Execute the query and store the result set
				ResultSet result = st.executeQuery();
				if (result.next()) {
					// Get the username from the database
					String userDb = result.getString(StringUtils. USERNAME);

					// Get the password from the database
					String  password= result.getString(StringUtils.PASSWORD);

					if (userDb.equals(loginModel.getUsername()) && password.equals(loginModel.getPassword())) {
						// Login successful, return 1
						return 1;
					} else {
						// Username or password mismatch, return 0
						return 0;
					}
				} else {
					// Username not found in the database, return -1
					return -1;
				}

				// Catch SQLException and ClassNotFoundException if they occur
			} catch (SQLException | ClassNotFoundException ex) {
				// Print the stack trace for debugging purposes
				ex.printStackTrace();
				// Return -2 to indicate an internal error
				return -2;
			}
		}
		public Boolean checkEmailIfExists(String email) {
			// TODO: Implement logic to check if the provided email address exists in the
			// database
			// This method should likely query the database using DBController and return
			// true if the email exists, false otherwise.
			return false;
		}

		public Boolean checkNumberIfExists(String number) {
			// TODO: Implement logic to check if the provided phone number exists in the
			// database
			// This method should likely query the database using DBController and return
			// true if the phone number exists, false otherwise.
			return false;
		}
		public ArrayList<loginmodel> getAllStudentsInfo() {
		    try {
		        PreparedStatement stmt = getConnection().prepareStatement(StringUtils.QUERY_GET_ALL_STUDENTS);
		        ResultSet result = stmt.executeQuery();

		        ArrayList<loginmodel> students = new ArrayList<loginmodel>();

		        while (result.next()) {
		           registrationmodel student = new registrationmodel();
		            
		            student.setUsername(result.getString(StringUtils.USERNAME));
		            student.setEmail(result.getString(StringUtils.EMAIL));
		            student.setPhoneNumber(result.getString(StringUtils.PHONE_NUMBER));
		            student.setAddress(result.getString("Address"));
		            student.setPassword(result.getString("password"));
		            student.setUserid(result.getString("id"));
		            
		            
		        }

		        return students;
		    } catch (SQLException | ClassNotFoundException ex) {
		        ex.printStackTrace();
		        return null;
		    }
		}
		public int deleteStudentInfo(String username) {
			try (Connection con = getConnection()) {
				PreparedStatement st = con.prepareStatement(StringUtils.QUERY_DELETE_USER);
				st.setString(1, username);
				return st.executeUpdate();
			} catch (SQLException | ClassNotFoundException ex) {
				ex.printStackTrace(); 
				return -1;
			}
		}

}

	
