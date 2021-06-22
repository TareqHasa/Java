<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<div class="main">
			<table>
				<tbody>
					<tr>
						<td>Title</td>
						<td><c:out value="${song.title }"></c:out></td>
					</tr>
					<tr>
						<td>Artist</td>
						<td><c:out value="${song.artist }"></c:out></td>
					</tr>
					<tr>
						<td>Rating (1-10)</td>
						<td><c:out value="${song.rate }"></c:out></td>
					</tr>
				</tbody>
			</table>

			<h4>
				<a href="/delete/${song.id}">delete</a>
			</h4>
		</div>
	</div>
</body>
</html>