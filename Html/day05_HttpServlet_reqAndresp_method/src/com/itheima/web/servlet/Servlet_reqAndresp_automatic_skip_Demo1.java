package com.itheima.web.servlet;
//设置页面的自动刷新

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_automatic_skip_Demo1")
public class Servlet_reqAndresp_automatic_skip_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String str = "您的用户名和密码有误,3秒钟后自动跳转到登录页面";
//        设置浏览器的编码格式
        resp.setContentType("text/html;charset=UTF-8");
//        在页面输出str
        resp.getWriter().write(str);
//        设置页面自动刷新并设置时间和刷新的跳转地址
        resp.setHeader("Refresh", "3;URL=" + req.getContextPath() + "/Servlet_reqAndresp_getParameter_Demo1.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
