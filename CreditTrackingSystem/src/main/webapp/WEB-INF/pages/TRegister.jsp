<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trader Registration</title>
    <link rel="stylesheet" type="text/css" href="CSS/TRegister.css"/>	
</head>
<body>
<div class="login-container">
    <div class="login-box">
        <h2>Trader Registration</h2>
        <form:form action="RegesterTradeLogin" method="POST" modelAttribute="TradeRegModel" enctype="multipart/form-data">
            <div class="form-grid">
                <form:input id="shopId" path="shopId" type="hidden" />
                <form:input id="licence" path="licence" type="hidden" />

                <div class="form-group">
                    <label for="mobile">Mobile Number</label>
                    <form:input id="mobile" path="mobile" />
                </div>

                <div class="form-group">
                    <label for="password">Password</label>
                    <form:input type="password" id="password" path="password" />
                </div>

                <div class="form-group">
                    <label for="tradername">Trader Name</label>
                    <form:input id="tradername" path="tradername" />
                </div>

                <div class="form-group">
                    <label for="catogery">Category</label>
                    <form:input id="catogery" path="catogery" />
                </div>

                <div class="form-group">
                    <label for="shoplocation">Shop Location</label>
                    <form:input id="shoplocation" path="shoplocation" />
                </div>

                <div class="form-group">
                    <label for="pincode">Pincode</label>
                    <form:input id="pincode" path="pincode" />
                </div>

                <div class="form-group">
                    <label for="addressline1">Address Line 1</label>
                    <form:input id="addressline1" path="addressline1" />
                </div>

                <div class="form-group">
                    <label for="addressline2">Address Line 2</label>
                    <form:input id="addressline2" path="addressline2" />
                </div>

                <div class="form-group">
                    <label for="addressline3">Address Line 3</label>
                    <form:input id="addressline3" path="addressline3" />
                </div>

                <div class="form-group">
                    <label for="state">State</label>
                    <form:input id="state" path="state" />
                </div>

                <div class="form-group">
                    <label for="country">Country</label>
                    <form:input id="country" path="country" />
                </div>

                <div class="form-group">
                    <label for="photo">Shop Photo</label>
                    <form:input id="photo" path="photo" type="file"/>
                </div>

                <div class="form-group">
                    <label for="licencetype">Licence Type</label>
                    <form:input id="licencetype" path="licencetype" />
                </div>

                <div class="form-group">
                    <label for="file">Licence Document</label>
                    <form:input id="file" path="file" type ="file"/>
                </div>

                <button type="submit" class="btn">Register</button>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
