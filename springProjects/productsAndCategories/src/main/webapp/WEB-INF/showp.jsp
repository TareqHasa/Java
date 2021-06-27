<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
</head>
<body>
	<div class="container">
		<h1>
			<c:out value="${product.name }"></c:out>
		</h1>
		<h2>Categories:</h2>
		<c:forEach items="${product.categories }" var="cat">
			<li>${cat.name }</li>
		</c:forEach>

		<form action="/addCategory/${product.id}" method="POST">
			<select name="category">
				<c:forEach items="${unlist}" var="cate">
					<option value="${cate.id}">${cate.name}</option>
				</c:forEach>
			</select>
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>