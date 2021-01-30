package com.itheima.web.servlet;
//利用工具包BeanUtils提供的方法实现表单的自动封装对象

import com.itheima.beans.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/Servlet_reqAndresp_getParameter_Demo3")
public class Servlet_reqAndresp_getParameter_Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        得到请求参数和请求参数值的映射Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
//        创建学生对象
        Student stu = new Student();
        try {
//            调用方法传入学生对象和Map集合,方法底部会自动将值封装为学生对象集合
            BeanUtils.populate(stu, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        输出学生对象
        System.out.println(stu);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
