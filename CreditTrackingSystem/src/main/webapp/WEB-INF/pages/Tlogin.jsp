<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trader Login - CCT</title>
    <link rel = "stylesheet" type = "text/css" href = "CSS/Login.css"/>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: url('images/LoginPage.png') no-repeat center center fixed;
            background-size: inherit;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-box">
            <h2>Trader Login</h2>
            <form:form action="TraderLoginAthenification" method="POST" modelAttribute="TraderLoginModel">
                <div class="form-group">
                    <label for="mobile">Mobile Number</label>
                    <form:input id="mobile" path = "mobile"/>
                </div>
                <div class="form-group">
                    <label for="shopId">Shop ID</label>
                    <form:input id="shopId" path = "shopId"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <form:input type="password" id="password" path = "password"/>
                </div>
                <button type="submit" class="btn">Login</button>
                
                <c:if test="${! empty resultMsg}">
                	<div style = "color:red;text-align:center">
                		${resultMsg}
                	</div>
                	<a href = "./RegesterTradeLoginPage">SignUp</a> &nbsp
                	<a href = "./CustLogin">Login As Customer</a>
				</c:if>
            </form:form>
        </div>
    </div>
</body>
</html>
