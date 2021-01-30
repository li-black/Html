package com.itheima.web.servlet;
//请求的重定向发送端

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_redirect_Demo1")
public class Servlet_reqAndresp_redirect_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        设置共享数据重定向中无法实现数据共享
        req.setAttribute("username", "zhangsan");
//        方法一
//        1.设置响应状态码
//        req.setStatus(302);
//        2.定向到哪里去: 其实就是设置响应消息头，Location
//        resp.setHeader("Location",req.getContextPath()+"/Servlet_reqAndresp_redirect_Demo2" );
//        方法二
//        方法二与方法一执行方式一样只是封装到方法中了,更简便
        resp.sendRedirect(req.getContextPath() + "/Servlet_reqAndresp_redirect_Demo2");
//        页面响应
        resp.getWriter().write("Servlet_reqAndresp_redirect_Demo1");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
