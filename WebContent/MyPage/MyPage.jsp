<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="LoginServlet" name="frm">
		<input type="hidden" name="command" value="Mypage">
		사원번호<input type="text" name="empno" value=<%=request.getAttribute("EMPNO") %>><br>
		성명<input type="text" name="name" value=<%=request.getAttribute("NAME") %>><br>
		부서<input type="text" name="emp" value=<%=request.getAttribute("EMP") %>><br>
		직책<input type="text" name="position" value=<%=request.getAttribute("POSITION") %>><br>
		연락처<input type="tel" name="phone1" value=<%=request.getAttribute("PHONE") %>>-<input type="tel" name="phone2" >-<input type="tel" name="phone3" ><br>
		입사일<input type="date" name="entrydate" value=<%=request.getAttribute("ENTRYDATE") %>><br>
		
		<input type="submit" value="완료">
	</form>
</body>
</html>