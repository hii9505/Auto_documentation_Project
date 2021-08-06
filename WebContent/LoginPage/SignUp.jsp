<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up Page</title>
</head>
<body>
	<form method="get" action="LoginServlet" name="frm">
		<input type="hidden" name="command" value="SignUp">
		ID* : <input type="text" name="id"> <input type="button" name="overlapCheck" value="중복 확인"><br>
		Password* : <input type="password" name="pwd"><br>
		Confirm Password : <input type="password" name="pwd_chk"><br>
		Name : <input type="text" name="user_name"><br>
		E-mail : <input type="text" name="email"><br>
		
		<input type="submit" value="완료"> -->
	</form>
</body>
</html>