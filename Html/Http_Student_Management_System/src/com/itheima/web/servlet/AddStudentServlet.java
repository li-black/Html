package com.itheima.web.servlet;
//获取get方法传递的数据，并且返回回应

import com.itheima.bean.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@WebServlet("/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取表单中的数据
        String username = req.getParameter("username");
        String age = req.getParameter("age");
        String score = req.getParameter("score");
        //创建学生对象并赋值
        Student stu = new Student();
        stu.setUsername(username);
        stu.setAge(Integer.parseInt(age));
        stu.setScore(Integer.parseInt(score));
        //将数据保存到stu.txt文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\stu.txt", true));
        bw.write(stu.getUsername() + "," + stu.getAge() + "," + stu.getScore());
        bw.newLine();
        bw.close();
//        设置浏览器的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        //输出文字并设置定时刷新响应给浏览器
        resp.getWriter().write("添加成功。2秒后自动跳转到首页...");
        resp.setHeader("Refresh", "2;URL=/Stu/index.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
