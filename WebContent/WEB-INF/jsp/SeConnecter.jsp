<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Se connecter</title>
</head>
<body>

<p><%= request.getAttribute("failedConnection") %></p>

<form method="POST" action="ConnexionServlet">
	<input type="text" name="pseudo">
	<input type="text" name="password">
	<input type="submit">
</form>

</body>
</html>