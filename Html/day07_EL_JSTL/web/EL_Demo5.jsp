<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl循环</title>
</head>
<body>
<%--设置共享数据--%>
<%
    ArrayList<String> list = new ArrayList<>();
    list.add("aa");
    list.add("bb");
    list.add("cc");
    list.add("dd");
    pageContext.setAttribute("list", list);
    int[] arr = {11, 22, 33, 44, 55};
    pageContext.setAttribute("arr", arr);
%>
<%--循环遍历--%>
<%--str相当于取出的元素--%>
<c:forEach items="${list}" var="str">
    ${str}<br>
</c:forEach>
<%--s.index为索引--%>
<%--s.count为计数器--%>
<c:forEach items="${arr}" var="str" varStatus="s">
    ${str}&nbsp;&nbsp;${s.index}&nbsp;&nbsp;${s.count}<br>
</c:forEach>
</body>
</html>
