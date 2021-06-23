<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>test test</h1>
<c:forEach items="${books }" var="book">
<h1><a href="/books/${book.id}"><c:out value="${book.title }"></c:out></a></h1>

</c:forEach>
</body>
</html>