package com.itheima.web.servlet.session;
//设置session

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_Session_Demo1")
public class Servlet_Session_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        获取username的值
        String username = req.getParameter("username");
//        获取session对象
        HttpSession session = req.getSession();
//        设置session共享区域写入username键值
        session.setAttribute("username", username);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
