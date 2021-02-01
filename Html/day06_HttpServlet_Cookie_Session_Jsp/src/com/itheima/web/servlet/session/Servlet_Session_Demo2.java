package com.itheima.web.servlet.session;
//读取session共享数据

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Servlet_Session_Demo2")
public class Servlet_Session_Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        获取session对象
        HttpSession session = req.getSession();
//        获取共享数据
        Object username = session.getAttribute("username");
//        打印到浏览器
        resp.getWriter().write("username" + ":" + username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
