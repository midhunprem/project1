<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
View pge

	<table>
	<tr>
		<th>id</th>
		<th>Name</th>
		<th>Password</th>
	</tr>
	<c:forEach items="${list}" var="stu">
		<tr>
			<td>${stu.id}</td>
			<td>${stu.name}</td>
			<td>${stu.pass}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>