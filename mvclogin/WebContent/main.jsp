<%@ page import="kr.or.openjava.signin.dto.UserInfo" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 성공<br />
	<%
		UserInfo user = (UserInfo) request.getAttribute("user");
		List<UserInfo> userList = (List<UserInfo>) request.getAttribute("userList");
	%>
	이름 : <%= user.getUserName() %><br />
	주소 : <%= user.getAddress() %><br />
	아이디 : <%= user.getId() %><br />
	패스워드 : <%= user.getPw() %><br />
	
	<hr />
	<table border='1'>
		<tr>
			<td>이름</td><td>주소</td>
			<td>아이디</td><td>패스워드</td>
		</tr>
		<% for(UserInfo data : userList){%>
		<tr>
			<td><%= data.getUserName() %></td>
			<td><%= data.getAddress()  %></td>
			<td><%= data.getId() %></td>
			<td><%= data.getPw() %></td>
		</tr>		
		<% } %>
	</table>
	
</body>
</html>