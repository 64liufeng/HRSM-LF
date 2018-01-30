<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/1/30
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload = function () {
            var addButton = document.getElementById('add');
            addButton.onclick = function () {
                var oDiv = document.createElement('div');
                oDiv.innerHTML = '<input type="text" placeholder="请输入内容"/>';
                document.body.appendChild(oDiv);
            }
        };
    </script>
</head>
<body>
<input type="button" value="添加" id="add" /><br/>
</body>
</html>
