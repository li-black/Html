package com.itheima.web.servlet;
//请求转发接收端

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_request_Dispatcher_Demo2")
public class Servlet_reqAndresp_request_Dispatcher_Demo2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        向浏览器响应输出
        resp.getWriter().write("Servlet_reqAndresp_request_Dispatcher_Demo2");
//        获取共享资源
        Object encoding = req.getAttribute("encoding");
//        打印共享资源
        System.out.println(encoding);
//        输出Servlet_reqAndresp_request_Dispatcher_Demo2执行了
        System.out.println("Servlet_reqAndresp_request_Dispatcher_Demo2执行了");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }
}
