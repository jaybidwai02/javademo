<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registration" method="POST">
id: <input type="text" name="id"><br />
name: <input type="text" name="name"><br />
email: <input type="text" name="email"><br />
<input type="submit" value="Submit">
</form>
<br>
${result}
</body>
</html>