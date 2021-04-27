<%@page import="com.blood.helper.Factory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<!-- //--bootstrap--/// -->

<%@ include file="components/boot.jsp" %>
<link href="css/logincss.css" rel="stylesheet" type="text/css">
</head>
<body>

<%@ include file="components/navbar.jsp" %>



	<%@ include file="components/message.jsp" %>

<!-- LOGIN FORM -->
	<div class="main_div">
		<div class="box">
			<div class="container text-center">
				<img src="pics/login.png" style="width:100px;height:100px">
			</div>
			<h1>Login </h1>
			<form method="POST" action="LoginServlet">
				<div class="inputBox">
					<input  type="email" name="E-mail" autocomplete="off" required>
					<label>Email</label>
				</div>

				<div class="inputBox">
					<input type="password" name="Password" autocomplete="off" required>
					<label>Password</label>
				</div>

				<div class="container text-center">
					<input type="submit" name="Login " value="Login"> 
					<a href="register.jsp"><input type="button" name="Sigup"value="Signup"></a>
				</div>


			</form>
		</div>
	</div>
	
	

</body>
</html>