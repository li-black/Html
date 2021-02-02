<%@ page import="com.itheima.bean.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL获取数据类型</title>
</head>
<body>
<%pageContext.setAttribute("num", 10);%>
基本数据类型:${num}<br>
<hr>
<%--创建一个Student对象--%>
<%
    Student student = new Student("zhangsan", 23);
    pageContext.setAttribute("stu", student);
%>
自定义对象:${stu}<br>
<%--这里是调用了stu的getname和getage方法--%>
学生姓名:${stu.name}<br>
学生年龄:${stu.age}<br>
<hr>
<%
    String[] arr = {"hello", "world"};
    pageContext.setAttribute("arr", arr);
%>
数组:${arr}<br>
0索引元素:${arr[0]}<br>
1索引元素:${arr[1]}<br>
<hr>
<%
    ArrayList<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    pageContext.setAttribute("list", list);
%>
list集合:${list}<br>
<%--获取list元素的两种写法--%>
0索引元素:${list.get(0)}<br>
1索引元素:${list[1]}<br>
<hr>
<%
    HashMap<String, Student> map = new HashMap<>();
    map.put("hm01", new Student("张三", 23));
    map.put("hm02", new Student("李四", 24));
    pageContext.setAttribute("map", map);
%>
map集合:${map}<br>
第一个学生对象:${map.get("hm01")}<br>
第一个学生对象姓名:${map.hm01.name}<br>
第一个学生对象年龄:${map.get("hm01").age}<br>
<%--获取key的第二种写法--%>
第二个学生对象姓名:${map["hm02"].name}<br>
</body>
</html>
