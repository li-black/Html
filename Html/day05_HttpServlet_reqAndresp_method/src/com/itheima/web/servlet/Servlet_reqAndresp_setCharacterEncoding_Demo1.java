package com.itheima.web.servlet;
//设置请求正文中编码
//get方法已被自动处理
//只关心post方法
//关联页面为Servlet_reqAndresp_getParameter_Demo2.html

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_setCharacterEncoding_Demo1")
public class Servlet_reqAndresp_setCharacterEncoding_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        设置请求的所有编码格式,注意这个要和html文件中设置的编码格式一致
        req.setCharacterEncoding("UTF-8");
//        获取username的值
        String username = req.getParameter("username");
//        打印
        System.out.println(username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
