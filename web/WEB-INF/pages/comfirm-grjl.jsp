<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/30
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="comfirm-grjl" method="post">
    <table >
        <div align="centre">个人简历</div><br>

        姓名：<input name="name"/><br>
        性别：<input  name="sex" /><br>
        出身日期：<input name="date"/><br>
        籍贯：<input name="place"/><br>
        身份证号：<input name="ID_number"/><br>
        手机号：<input name="phone"/><br>
        e-mail：<input name="e-mail"/><br>
        家庭地址：<input name="address"/><br>
        现居住地：<input name="newAddress"/><br>
        专业：<input name="prof" /><br>
        学历：<inpt name="education" /><br>
        毕业学院：<input name="university"/><br>
        主修课程：<textarea name="majorCourse" id="majorCourse" cols="130" rows="10"></textarea><br>
        专业技能：<textarea name="Professional-skills" id="Professional-skills" cols="130" rows="10"></textarea><br>
        <div>求职意向</div><br>
        到岗时间：<input name="to-date"/><br>
        工作性质：<input name="work"><br>
        希望行业：<textarea name="industry" id="industry" cols="130" rows="10"></textarea><br>
        工作地点：<input name="workAddress"/><br>
        期望薪水：<input name="salary"/><br>
        目标职能：<textarea name="function" id="function" cols="130" rows="10"></textarea><br>
        <div>工作经验</div><br>
        <textarea name="experience" id="experience" cols="130" rows="10"></textarea><br>

        <div>自我评价</div><br>
        <textarea name="evaluation" id="evaluation" cols="130" rows="10"></textarea><br>

    </table>
    <input type="submit" value="确定">
</form>
</body>
</html>
