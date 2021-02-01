package com.itheima.web.servlet;
//查看addStudentServlet存入的学生对象文件

import com.itheima.bean.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/listStudentServlet")
public class listStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        创建字符输入流对象，关联读取的文件
        BufferedReader br = new BufferedReader(new FileReader("d:\\stu.txt"));
//        创建集合对象，用于保存Student对象
        ArrayList<Student> list = new ArrayList<>();
        String line;
//        遍历用,切割然后存入Student对象在将对象存入数组
        while ((line = br.readLine()) != null) {
            Student stu = new Student();
            String[] split = line.split(",");
            stu.setUsername(split[0]);
            stu.setAge(Integer.parseInt(split[1]));
            stu.setScore(Integer.parseInt(split[2]));
            list.add(stu);
        }
//        将集合保存到会话域
        req.getSession().setAttribute("students", list);
//        重定向
        resp.sendRedirect(req.getContextPath() + "/listStudent.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
