<%--
  Created by IntelliJ IDEA.
  User: 小强
  Date: 2021/8/17 0017
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
    <style>
      body{
        text-align: center;
      }
      a{
        text-decoration: none;
        background-color: aquamarine;
        border-radius: 5px;
        font-size: 50px;
      }
    </style>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/main">进入首页！！！</a>
  <a href="${pageContext.request.contextPath}/toLogin">登录</a>
  </body>
</html>
