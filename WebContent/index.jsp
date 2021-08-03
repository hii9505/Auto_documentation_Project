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
//response.sendRedirect("http://localhost:8181/Web-study-02/LoginServlet?command=Login");
response.sendRedirect("http://localhost:8181/Web-study-02/SignUpServlet?command=SignUp");
%>
</body>
</html>