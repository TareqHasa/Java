<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${dojo.name }"></c:out>
			Location Ninjas
		</h1>
		<table>
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dojo.ninjas }" var="i">
					<tr>
						<td>${i.firstName}</td>
						<td>${i.lastName}</td>
						<td>${i.age }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>