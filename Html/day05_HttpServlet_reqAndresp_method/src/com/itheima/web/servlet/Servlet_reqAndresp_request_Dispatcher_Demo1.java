package com.itheima.web.servlet;
//请求转发发送端
//与请求包含的区别是不会响应发送端的响应

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_request_Dispatcher_Demo1")
public class Servlet_reqAndresp_request_Dispatcher_Demo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        向浏览器响应输出但是请求转发中发送端的响应不被执行
        resp.getWriter().write("Servlet_reqAndresp_request_Dispatcher_Demo1");
//        输出Servlet_reqAndresp_request_Dispatcher_Demo1执行了
        System.out.println("Servlet_reqAndresp_request_Dispatcher_Demo1执行了");
//        设置共享资源
        req.setAttribute("encoding", "GBK");
//        创建请求转发对象
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Servlet_reqAndresp_request_Dispatcher_Demo2");
//        请求转发forward
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
