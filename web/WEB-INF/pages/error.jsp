<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 10:03
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
    <title>error page</title>
</head>
<body>
<h2> ${error } </h2>

</body>
</html>
