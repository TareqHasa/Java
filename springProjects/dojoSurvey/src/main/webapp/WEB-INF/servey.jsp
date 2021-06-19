<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dogo servey</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<form action="/result" method="POST">
			<div class="feild">
				<label for="name">Your Name</label> <input type="text" id="name" name="name" required>
			</div>
			<div class="feild">
				<label for="location">Dojo Location</label> <select id="location"
					name="location">
					<option value="san jose">San Jose</option>
					<option value="nablus">Nablus</option>
					<option value="jinen">Jinen</option>
					<option value="tulkurm">Tulkurm</option>
				</select>
			</div>
			<div class="feild">
				<label for="language">Favorite Language</label> <select
					id="language" name="language">
					<option value="python">Python</option>
					<option value="java">Java</option>
					<option value="c++">C++</option>
				</select>
			</div>


			<label for="comment">Comment (optional)</label>
			<textarea rows="5" cols="40" name="comment"></textarea>
			
			<input type="submit" value="Button" class="button">


		</form>
	</div>
</body>
</html>