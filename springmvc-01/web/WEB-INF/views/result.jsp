<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/17 0017
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
    <style>
        #info{
            text-align: right;
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
<div id="info">
<span>${username}，欢迎您！</span>
<a href="${pageContext.request.contextPath}/Logout">退出</a>
</div>
<h1>你成功了！！！！</h1>
</body>
</html>
