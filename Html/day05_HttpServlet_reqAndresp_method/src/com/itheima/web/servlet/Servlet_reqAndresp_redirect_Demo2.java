package com.itheima.web.servlet;
//请求的重定向接收端

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_redirect_Demo2")
public class Servlet_reqAndresp_redirect_Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        获取共享数据但是在重定向中无法实现数据共享,所以只能获取到null
        Object username = req.getAttribute("username");
        System.out.println(username);
//        页面响应
        resp.getWriter().write("Servlet_reqAndresp_redirect_Demo2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
