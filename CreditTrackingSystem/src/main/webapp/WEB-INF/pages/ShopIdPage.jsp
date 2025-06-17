<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shop ID Generated</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            text-align: center;
            padding: 50px;
            color: #333;
        }

        .container {
            background: #fff;
            border-radius: 12px;
            padding: 40px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            display: inline-block;
        }

        .highlight {
            color: #2c3e50;
            font-size: 24px;
            font-weight: bold;
            margin-top: 20px;
            display: inline-block;
            background-color: #e6f7ff;
            padding: 10px 20px;
            border: 2px dashed #3498db;
            border-radius: 10px;
        }

        .message {
            font-size: 18px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="message">
            🎉 <strong>Registration Successful!</strong><br>
            Please make sure to <strong>note down your Shop ID</strong> for future reference and login.
        </div>
        <div class="highlight">
            ${resultMsg}
        </div>
        <h3><a href = "./">Home/Login</a></h3>
    </div>
</body>
</html>
