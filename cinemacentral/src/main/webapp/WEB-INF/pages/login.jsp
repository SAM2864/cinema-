
<%@page import="utils.StringUtils"%>
<%
String contextPath = request.getContextPath();
String errMsg = (String) request.getAttribute(StringUtils.MESSAGE_ERROR);
String successMsg = (String) request.getAttribute(StringUtils.MESSAGE_SUCCESS);
String username = (String) request.getAttribute(StringUtils.USERNAME);

%>  


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    	
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="../stylesheets/login.css" />
</head>
<body>
    <div class="login-wrap">
        <h2>Login</h2>
        
        <div class="form">
          <input type="text" placeholder="Username" name="un" />
          <input type="password" placeholder="Password" name="pw" />
          <button> Sign in </button>
          <a href="<%= contextPath + StringUtils.PAGE_URL_REGISTER %>"> <p> Don't have an account? Register </p></a>
             
        </div>
      </div>
</body>
</html>