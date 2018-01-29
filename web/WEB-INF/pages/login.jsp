<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 9:20
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
            margin:20px auto;
            font-size:15px;
        }

    </style>

    <script>
        function show() {
            var value = document.getElementsByTagName("input")[2].value;
            alert(value);
            if(value.length<6){
                /* alert('密码不得少于6位')*/
                document.getElementById("sp").innerHTML = "密码不的少于6位";
                document.getElementById("sp").style.color = "red";
            }
        }
        function checkName(value) {
            if(value==null||value==" "){
                alert("false");
                return;
            }
            alert("true");
        }
    </script>
</head>
<body>
<table width="300px" heigth="500px"/>

</table>
<form action="register" method="post">
    <div>登陆账号</div>
    用户    ：<input type="text" onblur="checkName(this.value)"/><br>
    密码    ：<input type="password" onblur="show()"/><br>
    <input type="submit" value="登陆"/>
    <a href="register.jsp">注册</a>
</form>
</body>
</html>
