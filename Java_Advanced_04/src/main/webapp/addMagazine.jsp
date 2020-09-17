<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/Java_Advanced_04/AddMagazine" method="post">
	<label>Name<input type="text" name="name"></label>
	<br>
	<label>Text<textarea rows="8" cols="100" name="text"></textarea></label>
	<br>
	<label>Price<input type="text" name="price"></label>
	<br>
	<input type="submit" value="submit">
</form>

<a href="/Java_Advanced_04/mainPage.jsp">Back to main page</a>

</body>
</html>