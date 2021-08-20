<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/20 0020
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Login" method="post">
    用户名：<input type="text" name="name" required><br/>
    密码：<input type="password" name="password" required><br/>
    <input type="submit" value="登录">
</form>
</body>
</html>
