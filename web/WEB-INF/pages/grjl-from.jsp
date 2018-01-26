<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/26
  Time: 16:52
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
        <div align="centre">个人简历</div><br>

        姓名：<input name="name"/><br>
        性别：<input  name="sex" /><br>
        出身日期：<input name="date"/><br>
        籍贯：<input /><br>
        身份证号：<input name="ID_number"/><br>
        手机号：<input name="phone"/><br>
        e-mail：<input name="e-mail"/><br>
        家庭地址：<input name="address"/><br>
        现居住地：<input name="newAddress"/><br>
        专业：
        学历：
        毕业学院：
        主修课程：
        专业技能：
        <div>求职意向</div><br>
        到岗时间：
        工作性质：
        希望行业：
        工作地点：
        期望薪水：
        目标职能：
        <div>自我评价</div><br>
        <from></from>
        <div>工作经验</div><br>
        <from></from>
    </table>

    <input type="submit" value="保存">
    <input type="submit" value="修改">
</form>
</body>
</html>

