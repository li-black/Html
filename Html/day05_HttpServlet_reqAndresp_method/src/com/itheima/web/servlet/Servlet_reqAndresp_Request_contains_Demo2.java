package com.itheima.web.servlet;
//请求包含接收端

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_Request_contains_Demo2")
public class Servlet_reqAndresp_Request_contains_Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        向浏览器响应输出
        resp.getWriter().write("Servlet_reqAndresp_Request_contains_Demo2");
//        输出Servlet_reqAndresp_Request_contains_Demo2执行了
        System.out.println("Servlet_reqAndresp_Request_contains_Demo2执行了");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
