<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<h1>Enter your details</h1>
	<form action="IndexServ" method="post">
		<p>
			<label for="id">id: </label> <input type="number" name="id" id="id">
		</p>
		<p>
			<label for="name">Name: </label> <input type="text" name="name"
				id="name">
		</p>
		<p>
			<label for="address">address: </label> <input type="text"
				name="address" id="address">
		</p>
		<p>
			<label for="city">city: </label> <input type="text" name="city"
				id="city">
		</p>
		<button><a href="ViewServlet">View all records</a></button>
		<button type="submit">Submit</button>
	</form>
	<hr>
	<form action="https://www.google.com/search">
	<input type="text" name="q">
	<button>Search Google</button>
	</form>
	
</body>
</html>

