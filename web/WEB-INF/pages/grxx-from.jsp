<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 15:00
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
        function checkdate() {
            var dateReg= /^(19|20)\d{2}-(1[0-2]|0?[1-9])-(0?[1-9]|[1-2][0-9]|3[0-1])$/;
            var date=document.getElementById("date").value;
            if(dateReg.test(date)){
                document.getElementById("sp1").innerHTML="√ 成功";
                document.getElementById("sp1").style.color="green";
            }else {
                document.getElementById("sp1").innerHTML="日期不符合规定,请重新输入";
                document.getElementById("sp1").style.color="red";
                document.getElementById("sp1").style.color="red";
            }

        }

        function checkID_number() {
            var ID_numberReg=/^[0-9]{18}$/;
            var ID_number=document.getElementById("mail").value;
            if(ID_numberReg.test(ID_number)){
                document.getElementById("sp2").innerHTML="√ 成功";
                document.getElementById("sp2").style.color="green";
            }else {
                document.getElementById("sp2").innerHTML="身份证号码不符合规定,请重新输入";
                document.getElementById("sp2").style.color="red";
                document.getElementById("sp2").style.color="red";
            }

        }

        function checkphone() {
            var phoneReg=/^[0-9]$/;
            var phone=document.getElementById("mail").value;
            if(phoneReg.test(phone)){
                document.getElementById("sp3").innerHTML="√ 成功";
                document.getElementById("sp3").style.color="green";
            }else {
                document.getElementById("sp3").innerHTML="邮箱不符合规定,请重新输入";
                document.getElementById("sp3").style.color="red";
                document.getElementById("sp3").style.color="red";
            }

        }

        function checkmail() {
            var mailReg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
            var mail=document.getElementById("mail").value;
            if(mailReg.test(mail)){
                document.getElementById("sp4").innerHTML="√ 成功";
                document.getElementById("sp4").style.color="green";
            }else {
                document.getElementById("sp4").innerHTML="邮箱不符合规定,请重新输入";
                document.getElementById("sp4").style.color="red";
                document.getElementById("sp4").style.color="red";
            }

        }

    </script>
</head>
<body>
   <form>
       <table>
           <div align="centre">个人信息</div><br>

           真实姓名：<input type="text" name="name"/><br>
           性别：<input type="radio" name="sex" value="男" onchange="changeSex(this.value)" checked = "checked"/>男
           <input type="radio" name="sex" value="女" onchange="changeSex(this.value)"/>女<br>
           婚姻：<input type="radio" name="marriage" value="已婚" onchange="changeSex(this.value)" checked = "checked"/>已婚
           <input type="radio" name="marriage" value="未婚" onchange="changeSex(this.value)"/>未婚<br>
           出身日期：<input type="text" name="date" id="date" onblur="checkdate()"><span id="sp1"></span><br>
           身份证号：<input type="text" name="ID_number" id="ID_number" onblur="checkID_number()"><span id="sp2"></span><br>
           手机号：<input type="text" name="phone" id="phone" onblur="checkphone()"><span id="sp3"></span><br>
           e-mail：<input  type="text" name="mail" id="mail" onblur="checkmail()"><span id="sp4"></span><br>
           家庭地址：<input type="text" name="address" id="address"></span><br>
           现居住地：<input type="text" name="newAddress" id="newAddress" ><br>
           <input type="submit" value="保存">
           <input type="submit" value="修改">
       </table>
   </form>
</body>
</html>
