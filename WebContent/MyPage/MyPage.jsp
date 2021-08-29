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
		사원번호<input type="text" name="empno" value=
		<%
			String empno = (String)request.getAttribute("EMPNO");
			if(empno == null) out.print("");
			else out.print(empno);
		%>><br>
		성명<input type="text" name="name" value=
		<%
			String name = (String)request.getAttribute("NAME");
			if(name == null) out.print("");
			else out.print(name);
		%>><br>
		부서<input type="text" name="emp" value=
		<%
			String emp = (String)request.getAttribute("EMP");
			if(emp == null) out.print("");
			else out.print(emp);
		%>><br>
		직책<input type="text" name="position" value=
		<%
			String position = (String)request.getAttribute("POSITION");
			if(position == null) out.print("");
			else out.print(position);
		%>><br>
		<%
			String phone = (String)request.getAttribute("PHONE");
			String phone1 = "", phone2 = "", phone3 = "";
			if(phone != null)
			{
				phone1 = phone.substring(0, 3);
				phone2 = phone.substring(3, 7);
				phone3 = phone.substring(7);
			}
		%>
		연락처<input type="tel" name="phone1" value=<%=phone1%>>-<input type="tel" name="phone2" value=<%=phone2%>>-<input type="tel" name="phone3" value=<%=phone3%>><br>
		입사일<input type="date" name="entrydate" value=
		<%
			Object entrydate = request.getAttribute("ENTRYDATE");
			if(entrydate == null) out.print("");
			else out.print(entrydate);
		%>><br>
		
		<input type="submit" value="완료">
	</form>
</body>
</html>