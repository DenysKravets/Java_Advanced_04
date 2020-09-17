<%@page import="ua.lviv.lgs.Magazines"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to the main page!!!</h1>

<!--go to cabinet-->
<a href="/Java_Advanced_04/Cabinet">Cabinet</a>
<br>

<!--add magazine-->
<a href="/Java_Advanced_04/AddMagazine">Add magazine (only for administrators)</a>


<!--
view magazines
	with the ability to subscribe
-->


<ul>
<c:forEach items="${Magazines.getMagazines().getAllMagazines()}" var="value">
         <li>
         	<form method="post" action="/Java_Advanced_04/Subscription">
	         	<label>Name: <c:out value="${value.getName()}"/></label>
	         	<br>
	         	<label>Content: <c:out value="${value.getText()}"/></label>
	         	<br>
	         	<label>Price: <c:out value="${value.getPrice()}"/></label>
	         	<br>
	         	<input type="hidden" value="${value.getName()}" name="name">
	         	<input type="submit" value="subscribe" name="type">
	         	<input type="submit" value="unsubscribe" name="type">
         	</form>
         </li>
</c:forEach>
</ul>



</body>
</html>