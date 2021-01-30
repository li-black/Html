package com.itheima.web.servlet;
//获取提交表单中的信息

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/Servlet_reqAndresp_getParameter_Demo1")
public class Servlet_reqAndresp_getParameter_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        根据键来获取值
        String username = req.getParameter("username");
        System.out.println(username);
        String password = req.getParameter("password");
        System.out.println(password);
        System.out.println("-------------------------------");
//        hobby中有多个值所以要用数组的方法来接收
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-------------------------------");
//        获取所有的键返回枚举项并打印
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.println(name);
        }
        System.out.println("-------------------------------");
//        获取所有键值对的Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
//        获取集合对象entry并且遍历
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
//            根据entry获取key
            String key = entry.getKey();
            System.out.print(key + ":");
//            根据entry获取value由于value可能会是数组所以用数组来接收之后遍历打印
            String[] values = entry.getValue();
            for (String value : values) {
                System.out.print(value + ",");
            }
//            换行
            System.out.println();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
