<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<%--MVC模型:
用Student类来封装数据
用Servlet来处理请求和响应
用JSP来展示数据--%>
<%--进入首页先用session.getAttribute("username")判断是否登陆过--%>
<%--如果没有就显示请登录跳转到登录页面--%>
<%--如果是登录之后就显示添加学生和查看学生--%>
<%
    Object username = session.getAttribute("username");
    if (username == null) {
%>
<a href="<%=request.getContextPath()%>/login.jsp">请登录</a>
<%} else {%>
<a href="<%=pageContext.getServletContext().getContextPath()%>/addStudent.jsp">添加学生</a>
<a href="<%=pageContext.getServletContext().getContextPath()%>/listStudentServlet">查看学生</a>
<%}%>
</body>
</html>
