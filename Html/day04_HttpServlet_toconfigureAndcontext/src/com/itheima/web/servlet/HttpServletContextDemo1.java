package com.itheima.web.servlet;
//对ServletContext的一些基本操作
//对ServletContext设置和删除共享数据

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        获取ServletContext对象
        ServletContext context = getServletContext();
//        根据key来获取value
        String globalEncoding = context.getInitParameter("globalEncoding");
        System.out.println(globalEncoding);
//        获取当前应用访问的虚拟路径
        String contextPath = context.getContextPath();
        System.out.println(contextPath);
//        获取应用部署之后的在磁盘上的绝对路径
//        只用于获取不负责查找
        String realPath = context.getRealPath("/");
        System.out.println(realPath);
//        获取a.txt的绝对路径
        String a = context.getRealPath("/a.txt");
        System.out.println(a);
//        获取b.txt的绝对路径
        String b = context.getRealPath("/WEB-INF/b.txt");
        System.out.println(b);
//        获取c.txt的绝对路径
        String c = context.getRealPath("/WEB-INF/classes/c.txt");
        System.out.println(c);
//        设置共享数据
        context.setAttribute("username", "zhangsan");
//        删除共享数据
//        context.removeAttribute("username");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}

