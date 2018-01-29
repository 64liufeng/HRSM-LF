<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/29
  Time: 9:56
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
    <title>公司简历</title>
</head>
<body>
     <a>公司介绍</a>
     <a>招聘信息</a>
     <a href="grjl-from.jsp" >简历申请</a>
     <a></a>
     <a></a>
</body>
</html>
