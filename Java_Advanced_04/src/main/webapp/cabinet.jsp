<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cabinet</title>
</head>
<body>

<label>Name: <c:out value="${name}"/></label><br>
<label>Email: <c:out value="${email}"/></label><br>
<label>Balance: <c:out value="${money}"/></label><br>

<form method="post" action="/Java_Advanced_04/Cabinet">
	<label>Amount: <input name="money"></label>
	<input type="submit" value="Pay">
</form>

<ul>
Subscribed:
<br>
<c:forEach items="${subscriptions}" var="value">
         <li>
	         	<label>Name: <c:out value="${value.getName()}"/></label>
	         	<br>
	         	<label>Content: <c:out value="${value.getText()}"/></label>
	         	<br>
	         	<label>Price: <c:out value="${value.getPrice()}"/></label>
	         	<br>
         </li>
</c:forEach>
</ul>

<br>

<a href="/Java_Advanced_04/mainPage.jsp">Back to main page</a>

</body>
</html>