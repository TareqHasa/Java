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
			<c:out value="${category.name }"></c:out>
		</h1>
		<h2>Products:</h2>
		<c:forEach items="${category.products }" var="product">
			<li>${product.name }</li>
		</c:forEach>

		<form action="/addProduct/${category.id}" method="POST">
			<select name="product">
				<c:forEach items="${unlist}" var="product">
					<option value="${product.id}">${product.name}</option>
				</c:forEach>
			</select>
			<input type="submit" value="Add">
		</form>
	</div>
</body>
</html>