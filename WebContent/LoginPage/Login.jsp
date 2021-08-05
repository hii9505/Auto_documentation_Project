<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<body>
	<input type="hidden" name="error_no" value="<%=request.getAttribute("ERROR")%>">
	<form method="get" action="LoginServlet" name="frm">
		<input type="hidden" name="command" value="Login">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="pwd"><br>
		아이디저장 : <input type="checkbox" name="store"><br>
		
		<input type="submit" value="로그인"> <!-- onclick="return check()"> -->
		<input type="button" value="회원가입" onclick="location.href='LoginServlet?command=SignUpForm'"> <!-- onclick="return reset()">		-->
	</form>	
</body>
</body>
</html>