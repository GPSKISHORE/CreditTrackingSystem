<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Credit Tracker (CCT)</title>
     <link rel = "stylesheet" type = "text/css" href = "CSS/home.css"/>
</head>
<body>
    <header>
        <h1>CCT System</h1>
        <nav>
            <a href="#">Home</a>
            <a href="#">About</a>
            <a href="#">Support</a>
        </nav>
    </header>

    <section class="hero">
        <h2>Welcome to Customer Credit Tracker (CCT)</h2>
        <p>Track customer credits, repayments, and outstanding balances in real time. Designed for small businesses and grocery stores to manage credit easily and professionally.</p>
        <div class="cta-buttons">
            <button class="btn" onclick="location.href='./CustLogin'">Customer Login</button>
            <button class="btn" onclick="location.href='./TraderLogin'">Trader Login</button>
        </div>
    </section>

    <section class="features">
        <h3>Why Choose CCT?</h3>
        <div class="feature-list">
            <div class="feature">
                <h4>Track Credits</h4>
                <p>Maintain clear records of customer credit transactions, outstanding dues, and repayment dates.</p>
            </div>
            <div class="feature">
                <h4>Instant Reports</h4>
                <p>Generate customer-wise and date-wise reports just like a bank statement — easily downloadable.</p>
            </div>
            <div class="feature">
                <h4>Telugu Name Support</h4>
                <p>Customer names and details can be entered and viewed in Telugu for local convenience.</p>
            </div>
            <div class="feature">
                <h4>Mobile Friendly</h4>
                <p>Optimized for mobile/tablet screens. Access data on the go from your Chrome browser.</p>
            </div>
            <div class="feature">
                <h4>Safe & Secure</h4>
                <p>All your customer data is securely stored and only accessible by authorized users.</p>
            </div>
        </div>
    </section>

    <footer>
        © 2025 Customer Credit Tracker (CCT) | Designed for Local Businesses
    </footer>
</body>
</html>
