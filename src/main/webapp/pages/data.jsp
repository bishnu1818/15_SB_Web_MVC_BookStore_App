<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="book" >+Add New Book</a>
	<table>
	<thead>
		<tr>
			<th>BookId</th>
			<th>BookName</th>
			<th>BookPrice</th>
			<th>BookAuthor</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${books}" var="book">
		<tr>
		  <td> </td>
		  <td> </td>
		  <td> </td>
		 <td> </td>
		</tr>
		</c:forEach>
		</tbody>
	</table>

</body>
</html>