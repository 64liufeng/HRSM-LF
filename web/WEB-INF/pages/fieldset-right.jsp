<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/29
  Time: 11:00
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
    <title>Title</title>
</head>
<body>
<h3><a href="grxx-from.jsp" target="rightFrane"></a></h3>
</body>
</html>
