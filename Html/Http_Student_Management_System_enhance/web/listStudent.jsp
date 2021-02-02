<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>查看学生</title>
</head>
<body>
<%--查看学生页面--%>
<%--创造表格--%>
<table width="600px" border="1px">
    <tr>
        <th>学生姓名</th>
        <th>学生年龄</th>
        <th>学生成绩</th>
    </tr>
    <%--    获取session共享区域的Student集合--%>
    <c:forEach items="${students}" var="s">
        <%--    输出对应的值--%>
        <tr align="center">
            <td>${s.username}</td>
            <td>${s.age}</td>
            <td>${s.score}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
