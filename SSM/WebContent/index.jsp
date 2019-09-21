<%@page import="java.util.*" %>
<%@page import="com.model.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body>
<%
List<User> users=(List)(request.getSession().getAttribute("users"));
System.out.println(users.get(0).getUsername());
%>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>年龄</th>
			<th>密码</th>
			<th colspan="2">操作</th>
		</tr>
		<%
		for(User user:users){
			%>
		
			<tr>
				<td><%=user.getId() %></td>
				<td><%=user.getUsername() %></td>
				<td><%=user.getSex() %></td>
				<td><%=user.getAge() %></td>
				<td><%=user.getPassword() %></td>
				<td><a href="editgo?id=<%=user.getId()%>">修改</a></td>
				<td><a href="delete.do?id=<%=user.getId()%>">删除</a></td>
			</tr>
		
		<%} %>
		<tr>
			<td colspan="9"><a href="add.jsp">添加</a></td>
		</tr>
	</table>


</body>
</html>