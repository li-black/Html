package com.itheima.web.servlet;
//这是一个实现了Servlet接口的类，能够相应网页请求，请求体在web/WEB-INF/web.xml中

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("HttpServletDemo1请求");
    }
}
