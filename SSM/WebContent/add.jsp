<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.do" method="post">
		<h1>添加</h1>
		姓名：<input type="text" name="name" id="name"> 年龄：<input
			type="number" name="age" id="age"> 性别：<input type="radio"
			name="sex" value="男">男<input type="radio" name="sex"
			value="女">女 密码：<input type="text" name="password"
			id="password">
			<input type="submit" value="提交">
	</form>
</body>
</html>