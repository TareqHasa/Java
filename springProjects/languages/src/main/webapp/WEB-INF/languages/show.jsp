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
	<a href="/">Dashboard</a>
	<div class="container">
		<h3>
			<c:out value="${language.name }"></c:out>
		</h3>
		<h3>
			<c:out value="${language.creator }"></c:out>
		</h3>
		<h3>
			<c:out value="${language.version }"></c:out>
		</h3>
		<h3>
			<a href="/languages/${language.id}/edit">Edit</a>
		</h3>
	<form action="/languages/${language.id}" method="post">
								<input type="hidden" name="_method" value="delete"> <input
									type="submit" value="Delete">
							</form>
	</div>
</body>
</html>