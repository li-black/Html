package com.itheima.web.servlet.cookie;
//Cookie创造端

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_Cookie_Demo1")
public class Servlet_Cookie_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        创建cookie对象
        Cookie cookie = new Cookie("username", "fengyu");
        Cookie cookie1 = new Cookie("car", "jd");
//        添加cookie
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
