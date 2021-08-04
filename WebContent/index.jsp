<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//response.sendRedirect("http://localhost:8181/Auto_Documentation/SignUpServlet?command=SignUp");
response.sendRedirect("http://localhost:8181/Auto_Documentation/LoginServlet?command=SignUpForm");
%>
</body>
</html>