<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">

		<form action="/code" method="POST">
			<h5 class="error"><c:out value="${error}"></c:out></h5>
			<h5>
				<label for="code">What is the code?</label>
			</h5>
			<input type="password" id="code" name="code"> 
			<br>
			<input type="submit" value="Try Code">
			
		</form>
	</div>

</body>
</html>