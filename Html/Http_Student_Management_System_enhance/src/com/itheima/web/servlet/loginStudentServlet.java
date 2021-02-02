package com.itheima.web.servlet;
//登录页面的Servlet

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginStudentServlet")
public class loginStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        获取用户名和密码
        String username = req.getParameter("username");
//        判断用户名输入是否正确不正确返回登录页面
        if (username == null || "".equals(username)) {
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }
//        设置共享区域存放username
        req.getSession().setAttribute("username", username);
//        重定向
        resp.sendRedirect(req.getContextPath() + "/index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
