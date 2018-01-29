<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/29
  Time: 9:16
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

<frameset rows="15%,*">
    <frame name="topFrame" src="fieldset-top.jsp"/>
    <frameset  cols="20%,*">
        <frame name="leftFrame" src="fieldset-left.jsp" noresize="noresize"/>
        <frame name="rightFrame" src="fieldset-right.jsp" noresize="noresize"/>
        </frameset>
    <noframes>
          <body>
             此浏览器不支持框架
          </body>
    </noframes>

</frameset>
</html>
