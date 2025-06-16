<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Login - CCT</title>
    <link rel = "stylesheet" type = "text/css" href = "CSS/Login.css"/>
    <style type="text/css">
    	body {
		    margin: 0;
		    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
		    background: url('images/LoginPage.png') no-repeat center center fixed;
		    background-size: cover;
		    color: #fff;
		}
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-box">
            <h2>Customer Login</h2>
            <form action="CustLoginAthenification" method="POST" modelAttribute = "CustLoginModel">
                <div class="form-group">
                    <label for="mobile">Mobile Number</label>
                    <input type="text" id="mobile" name="mobile" required>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required>
                </div>
                <button type="submit" class="btn">Login</button>
            </form>
        </div>
    </div>
</body>
</html>
