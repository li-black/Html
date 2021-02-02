<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<!--表单-->
<%--添加学生页面--%>
<%--跳转到addStudentServlet--%>
<form action="${pageContext.request.contextPath}/addStudentServlet" method="get" autocomplete="off">
    学生姓名：<input type="text" name="username"> <br/>
    学生年龄：<input type="number" name="age"> <br/>
    学生成绩：<input type="number" name="score"> <br/>
    <button type="submit">保存</button>
</form>
</body>
</html>