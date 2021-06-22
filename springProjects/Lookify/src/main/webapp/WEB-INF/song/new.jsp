<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/css/show.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="container">
		<header>
			<a href="/dashboard">Dashboard</a>
		</header>

		<form:form action="/songs/new" method="POST" modelAttribute="song">
			<p>
				<form:label path="title">Title</form:label>
				<form:input path="title" />
				<form:errors path="title" />
			</p>
			<p>
				<form:label path="artist">Artist</form:label>
				<form:input path="artist" />
				<form:errors path="artist" />
			</p>

			<p>
				<form:label path="rate">Rating</form:label>
				<form:input type="number" path="rate" />
				<form:errors path="rate" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>