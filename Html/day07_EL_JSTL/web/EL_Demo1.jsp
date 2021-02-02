<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL入门</title>
</head>
<body>
<%--设置四种共享区域--%>
<%pageContext.setAttribute("username", "张三");%>
<%request.setAttribute("username", "李四");%>
<%session.setAttribute("username", "王五");%>
<%application.setAttribute("username", "赵六");%>
java代码获取:
<%out.print(session.getAttribute("username"));%><br>
jsp表达式获取:
<%=request.getAttribute("username")%><br>
EL表达式获取:
<%--EL表达式总是从域对象最小开始获取,如果没有就一步步往上获取--%>
${username}
</body>
</html>
