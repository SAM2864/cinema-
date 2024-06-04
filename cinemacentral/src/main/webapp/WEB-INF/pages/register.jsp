<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
<link rel="stylesheet" type="text/css"
href="../stylesheets/register.css" />
</head>
<body>
    <div class="signupSection">
        <div class="info">
          <h2>Mission to Deep Space</h2>
          <i class="icon ion-ios-ionic-outline" aria-hidden="true"></i>
          <p>The Future Is Here</p>
        </div>
       
        <form action=" <%=request.getContextPath()%>/registerstudent" method="POST" class="signupForm" name="signupform">
          <h2>Sign Up</h2>
          <ul class="noBullet">
            <li>
              <label for="username">Username</label>
              <input type="text" class="inputFields" id="username" name="username" placeholder="Username" value="" oninput="return userNameValidation(this.value)" required/>
            </li>
            
            <li>
              <label for="email">Email</label>
              <input type="email" class="inputFields" id="email" name="email" placeholder="Email" value="" required/>
            </li>
            <li>
              <label for="address">Address</label>
              <input type="text" class="inputFields" id="address" name="address" placeholder="Address" value="" required/>
            </li>
            <li>
              <label for="phone">Phone Number</label>
              <input type="tel" class="inputFields" id="phone" name="phone" placeholder="Phone Number" value="" required/>
            </li>
            <li>
                <label for="password">Password</label>
                <input type="password" class="inputFields" id="password" name="password" placeholder="Password" value="" oninput="return passwordValidation(this.value)" required/>
              </li>
            <li id="center-btn">
              <input type="submit" id="join-btn" name="join" alt="Join" value="Join">
            </li>

          </ul>
        </form>
      </div>
      
</body>
</html>
    