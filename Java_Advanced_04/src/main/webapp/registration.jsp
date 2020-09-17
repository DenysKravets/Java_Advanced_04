<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form action="/Java_Advanced_04/Registration" method="post">
	Registration
	<br>
	<br>
	<label>Email<input type="text" name="email"></label>
	<br>
	<label>Name<input type="text" name="name"></label>
	<br>
	<label>Password<input type="text" name="password"></label>
	<br>
	<label>I am admin<input type="checkbox" name="isAdmin"></label>
	<br>
	<input type="submit" value="register">
	<br>
</form>

</body>
</html>