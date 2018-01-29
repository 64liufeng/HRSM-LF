<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/29
  Time: 11:27
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
    <style>
        div{
            text-align:center;
            background:#009FCC;
            font-size:24px;
            padding:5px;
            color:white;
        }
        form{
            background: #F8F8FF ;
            border:#357FC4 solid 1px;
            color:#575454;
            width:400px;
            heigth:600px;
            margin:20px auto;
            font-size:15px;
        }

    </style>
</head>
<body>
<form>
    <table>
        <div>标题</div>
    </table>

</form>
</body>
</html>
