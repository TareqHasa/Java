<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>time display</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<h1 class="time">
			<c:out value="${time}"></c:out>
		</h1>
	</div>
</body>
</html>