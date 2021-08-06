<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MainPage</title>
</head>
<body>
	<!--<input type="hidden" name="empno" value="<%=request.getAttribute("EMPNO")%>">-->
	<input type="button" value="로그인" onclick="location.href='LoginServlet?command=LoginForm'">
	<br>
	<input type="button" value="My Page" onclick="location.href='MainPageServlet?command=MypageView'">
	<br>
	<input type="button" value="My document" onclick="location.href='MainPageServlet?command=MydocumentForm'">
	<br>
	<input type="button" value="출퇴근" onclick="location.href='MainPageServlet?command=MyCommuteForm'">
	<br>
</body>
</html>
