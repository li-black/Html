package com.itheima.web.servlet;
//req请求体的一些基本方法

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_reqAndresp_method_Demo1")
public class Servlet_reqAndresp_method_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        获取页面是以何种方法来提交数据的
        String method = req.getMethod();
        System.out.println(method);
//        获取虚拟主路径
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
//        获取Servlet对象路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
//        获取IP地址
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
//        获取路径?之后的值一般是获取提交方法中返回的值
        String queryString = req.getQueryString();
        System.out.println(queryString);
//        获取虚拟路径加Servlet路径不包括http:localhost:8080
        String uri = req.getRequestURI();
        System.out.println(uri);
//        获取所有的路径包括http:localhost:8080
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
