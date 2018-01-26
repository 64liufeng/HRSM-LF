<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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
           <div align="centre">个人信息</div><br>

           真实姓名：<input name="name"/><br>
           性别：<input type="radio" name="sex" value="男" onchange="changeSex(this.value)" checked = "checked"/>男
           <input type="radio" name="sex" value="女" onchange="changeSex(this.value)"/>女<br>
           出身日期：<input name="date"/><br>
           身份证号：<input name="ID_number"/><br>
           手机号：<input name="phone"/><br>
           e-mail：<input name="e-mail"/><br>
           家庭地址：<input name="address"/><br>
           现居住地：<input name="newAddress"/><br>
           <input type="submit" value="保存">
           <input type="submit" value="修改">
       </table>
   </form>
</body>
</html>
