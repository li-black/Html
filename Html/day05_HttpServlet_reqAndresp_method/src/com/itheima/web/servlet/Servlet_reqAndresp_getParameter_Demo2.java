package com.itheima.web.servlet;
//获取提交表单中的信息之后封装成学生对象

import com.itheima.beans.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_reqAndresp_getParameter_Demo2")
public class Servlet_reqAndresp_getParameter_Demo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        获取表单中的信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
//        封装成学生对象
        Student stu = new Student(username, password, hobbies);
//        打印学生对象
        System.out.println(stu);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
