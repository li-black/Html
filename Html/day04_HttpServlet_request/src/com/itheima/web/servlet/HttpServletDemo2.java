package com.itheima.web.servlet;
//Servlet的生命周期，只创建一次对象，只有在停止Tomcat服务器的时候才销毁

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo2 extends HttpServlet {
    @Override
    public void init() {
        System.out.println("创建对象");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("HttpServletDemo2请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("销毁对象");
    }
}
