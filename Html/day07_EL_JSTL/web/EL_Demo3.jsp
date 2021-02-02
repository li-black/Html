<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL判断</title>
</head>
<body>
<%--设置数据并且添加到共享区域--%>
<%
    String str1 = null;
    String str2 = "";
    ArrayList list = new ArrayList();
    pageContext.setAttribute("str1", str1);
    pageContext.setAttribute("str2", str2);
    pageContext.setAttribute("list", list);
%>
<%--判断数据是否为空如果是返回true--%>
${empty str1}<br>
${empty str2}<br>
${empty list}<br>
${str2.length()>0}<br>
<%pageContext.setAttribute("gender", "man");%>
<%--根据共享数据来运用三元运算符判断哪一个单选框被默认选中--%>
<input type="radio" name="gender" value="男" ${gender.equals("man") ? "checked":""}>男
<input type="radio" name="gender" value="女" ${gender.equals("woman") ? "checked":""}>女
</body>
</html>
