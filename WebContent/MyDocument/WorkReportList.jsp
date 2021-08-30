<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Work Report List</title>
</head>
<body>
	<table>
		<th>이름</th><th>사원번호</th><th>출근시간</th><th>퇴근시간</th><th>업무일지</th>
		<c:forEach items="${eList}" var="employee">
		<tr>
			<td><c:out value="${employee.eid}"/></td>
			<td><c:out value="${employee.eid}"/></td>
			<td><c:out value="${employee.eid}"/></td>
			<td><c:out value="${employee.eid}"/></td>
			<td><c:out value="${employee.eid}"/></td>
		</tr>
		</c:forEach>	
	</table>
</body>
</html>