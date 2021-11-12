<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>课程列表</title>
	</head>
	<body>
		<form action="${pageContext.request.contextPath}/deleteCourse" method="post">
			<table>
				<tr>
					<td>选择</td>
					<td>课程名</td>
				</tr>
				<tr>
					<td><input name="ids" value="1" type="checkbox"></td>
					<td>JAVA程序设计</td>
				</tr>
				<tr>
					<td><input name="ids" value="2" type="checkbox"></td>
					<td>MySQL数据库</td>
				</tr>
				<tr>
					<td><input name="ids" value="3" type="checkbox"></td>
					<td>JavaEE应用开发</td>
				</tr>
			</table>
			<input type="submit" value="删除"/>
		</form>
	</body>
</html>