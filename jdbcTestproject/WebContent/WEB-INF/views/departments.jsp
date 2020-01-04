<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>departments</title>
</head>
<body>
	<div align="center">
		<table>
			<tr>
				<th>id</th>
				<th>name</th>
			</tr>
			<c:forEach var="dep" items="${deps}">
				<tr>
					<td><c:out value ="${dep.id}"></c:out></td>
					<td><c:out value = "${dep.name}"></c:out></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>