<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>show name</title>
</head>
<body>
<h1>Welcome</h1> ${name }<h1>访问此页面</h1>
<fieldset></fieldset>
</body>
</html>
