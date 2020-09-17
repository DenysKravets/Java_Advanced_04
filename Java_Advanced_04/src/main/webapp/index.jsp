<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="/Java_Advanced_04/Login" method="post">
	Login
	<br>
	<br>
	<label>Email<input type="text" name="email"></label>
	<br>
	<label>Password<input type="text" name="password"></label>
	<br>
	<input type="submit" value="login">
	<br>
</form>
<br>
<a href="/Java_Advanced_04/registration.jsp">registration</a>
<br>
<a href="/Java_Advanced_04/MainPage">Enter without login</a>

</body>
</html>