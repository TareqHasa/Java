<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/dash.css" />
</head>
<body>
	<div class="container">
		<header>
			<h4>
				<a href="/songs/new">Add New</a>
			</h4>
			<form action="/search" method="get">
				<input type="text" name="search" placeholder="search"> <input
					type="submit" value="New Searsh">
			</form>
		</header>

		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/songs/${song.id }"><c:out
									value="${song.title}" /></a></td>
						<td><c:out value="${song.rate}" /></td>
						<td><a href="/delete/${song.id}">delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>