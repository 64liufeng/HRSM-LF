<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/25
  Time: 16:16
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

    <script>
        var flag = false;
        function checkName() {
            var nameReg = /^[\w$]{6,10}$/;
            var name = document.getElementById("userName").value;
            if(nameReg.test(name)&&" "!=name&&null!=name){
                document.getElementById("sp1").innerHTML = "√";
                document.getElementById("sp1").style.color = "green";
                document.getElementById("sp1").style.fontWeight = "bold";

            }else {
                document.getElementById("sp1").innerHTML = "×用户名不合法,使用大小写字母数字，在6-10之间";
                document.getElementById("sp1").style.color = "red";
                document.getElementById("sp1").style.fontWeight = "bold";
            }
        }
        function checkPass() {
            var pass = document.getElementById("pass").value;
            var passReg = /[A-Za-z0-9]{6,123}$/;
            if(passReg.test(pass)&&" "!=pass&&null!=pass){
                document.getElementById("sp2").innerHTML = "√";
                document.getElementById("sp2").style.color = "green";
                document.getElementById("sp2").style.fontWeight = "bold";

            }else {
                document.getElementById("sp2").innerHTML = "×密码不合法，使用大小写字母数字，至少6位";
                document.getElementById("sp2").style.color = "red";
                document.getElementById("sp2").style.fontWeight = "bold";
            }
        }
        function confirmPass() {
            var cpass=document.getElementById("cpass").value;
            if(cpass==pass && cpass!=""&& cpass!=null&&pass!=null&&pass!=""){
                document.getElementById("sp3").innerHTML="√ 成功";
                document.getElementById("sp3").style.color="green";
            }else {
                document.getElementById("sp3").innerHTML="× 密码输入不一致,请重新输入";
                document.getElementById("sp3").style.color="red";
            }
        }
    </script>
</head>
<body>

<form action="register" method="post">
    <table  width="933" height="412">
       <div>注册账号</div>
        账号：<input type = "text" name="userName" id="userName" onblur="checkName()"/><span id="sp1"></span><br>
        密码：<input type="password" name="password" id="pass" onblur="checkPass()"/><span id="sp2"></span><br>
       确认密码：<input  type="password"  name="comfirmPass" id="cpass" onblur="confirmPass()"><span id="sp3"></span><br>
       <span id="sp"></span>
       <input type="submit" value="确认"/>
    </table>
</form>
</body>
</html>
