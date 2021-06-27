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
	<div>
		<h1>
			<c:out value="${person.firstName} ${person.lastName}"></c:out>
		</h1>
		<h4>
			License Number :
			<c:out value="${person.license.number} "></c:out>
		</h4>
		<h4>
			State:
			<c:out value="${person.license.state} "></c:out>
		</h4>
		<h4>
			Expiration Date:
			<c:out value="${person.license.expirationDate} "></c:out>
		</h4>

	</div>
</body>
</html>