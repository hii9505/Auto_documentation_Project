<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<p> This is Main Page </p>
	<%response.sendRedirect("http://localhost:8181/Auto_Documentation/SignUpServlet?command=SignUp"); %>
</body>
</html>