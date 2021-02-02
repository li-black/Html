<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl判断</title>
</head>
<body>
${pageContext.setAttribute("score","B")}
${pageContext.setAttribute("age","20")}
<%--if判断--%>
<c:if test="${score eq 'A'}">
    优秀
</c:if>
<c if test="${age>=20}">
    年龄合法
</c>
<%--多层判断--%>
<c:choose>
    <c:when test="${score eq 'A'}">优秀</c:when>
    <c:when test="${score eq 'B'}">良好</c:when>
    <c:when test="${score eq 'C'}">及格</c:when>
    <c:when test="${score eq 'D'}">较差</c:when>
    <c:otherwise>成绩非法</c:otherwise>
</c:choose>
</body>
</html>
