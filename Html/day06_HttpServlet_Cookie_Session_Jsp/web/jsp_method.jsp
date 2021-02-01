<%--JSP基本使用--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--JSP注释--%>
<!--HTML注释-->
<%
    out.println("java代码块<br/>");
    System.out.println("java控制台输出");
%>
<%="JSP表达式"%>
<hr>
<%--定义全局变量--%>
<%!
    String name = "张三";
    static int num = 20;

    public static void getNum() {
    }
%>
<%--定义局部变量--%>
<%name = "李四";%>
<%--输出根据就近原则会输出李四--%>
<%=name%>
<%=num%>
</body>
</html>
