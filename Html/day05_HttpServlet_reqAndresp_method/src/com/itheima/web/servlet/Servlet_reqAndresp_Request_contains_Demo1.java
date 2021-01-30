package com.itheima.web.servlet;
//请求包含发送端
//请求包含将两个Servlet的响应内容合并输出
//会响应发送端的响应

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_Request_contains_Demo1")
public class Servlet_reqAndresp_Request_contains_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        向浏览器响应输出
        resp.getWriter().write("Servlet_reqAndresp_Request_contains_Demo1");
//        输出Servlet_reqAndresp_Request_contains_Demo1执行了
        System.out.println("Servlet_reqAndresp_Request_contains_Demo1执行了");
//        拿到请求调度对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Servlet_reqAndresp_Request_contains_Demo2");
//        实现包含的操作include
        requestDispatcher.include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
