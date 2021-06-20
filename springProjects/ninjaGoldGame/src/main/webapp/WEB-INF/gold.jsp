<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>gold page</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="cntaine">
		<form action="/process_money" method="GET">
			<label for="gold">Your gold</label> <input type="text"
				value="<c:out value='${gold }'></c:out>" readonly>
		</form>
		<div class="bulding">
			<form action="/process_money" method="POST">
				<h2>Farm</h2>
				<p>(earns 10-20 golds)</p>
				<input type="hidden" name="gold" value="farm">
				<button type="submit">Find Gold</button>
			</form>
			<form action="/process_money" method="POST">
				<h2>Cave</h2>
				<p>(earns 5-10 golds)</p>
				<input type="hidden" name="gold" value="cave">
				<button type="submit">Find Gold</button>
			</form>
			<form action="/process_money" method="POST">
				<h2>House</h2>
				<p>(earns 2-5 golds)</p>
				<input type="hidden" name="gold" value="house">
				<button type="submit">Find Gold</button>
			</form>
			<form action="/process_money" method="POST">
				<h2>Casino!</h2>
				<p>(earns/takes 0-50 golds)</p>
				<input type="hidden" name="gold" value="casino">
				<button type="submit">Find Gold</button>
			</form>
		</div>
		<form action="/reset" method="POST">
			<input type="hidden" name="reset" value="reset">
			<button type="submit">reset</button>
		</form>

	</div>
	<div>
		<textarea rows="10" cols="60" readonly>
<c:forEach items="${act }" var="i">
${i } 

</c:forEach>
</textarea>

	</div>

</body>
</html>