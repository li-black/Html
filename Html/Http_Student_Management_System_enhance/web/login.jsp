<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>学生登录</title>
</head>
<body>
<%--登录页面--%>
<%--跳转到loginStudentServlet--%>
<form action="${pageContext.request.contextPath}/loginStudentServlet" method="get"
      autocomplete="off">
    姓名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    <button type="submit">登录</button>
</form>
</body>
</html>
