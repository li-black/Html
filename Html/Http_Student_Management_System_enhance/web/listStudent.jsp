<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itheima.bean.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <%
        ArrayList<Student> students = (ArrayList<Student>) session.getAttribute("students");
//        增强for遍历集合
        for (Student student : students) {
    %>
    <%--    输出对应的值--%>
    <tr align="center">
        <td><%=student.getUsername()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getScore()%>
        </td>
    </tr>
    <% }%>
</table>
</body>
</html>
