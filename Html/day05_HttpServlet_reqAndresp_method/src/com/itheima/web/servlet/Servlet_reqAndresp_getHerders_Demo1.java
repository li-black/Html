package com.itheima.web.servlet;
//请求头的中的基本方法

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet("/Servlet_reqAndresp_getHerders_Demo1")
public class Servlet_reqAndresp_getHerders_Demo1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
//        获取请求头中connection键的值
        String connection = req.getHeader("connection");
        System.out.println(connection);
        System.out.println("-----------------------------");
//        获取请求头中accept-encoding键的值其不只有一个值所以要用getHeaders方法返回一个枚举项
        Enumeration<String> headers = req.getHeaders("accept-encoding");
//        遍历枚举并打印
        while (headers.hasMoreElements()) {
            String s = headers.nextElement();
            System.out.println(s);
        }
        System.out.println("-----------------------------");
//        获取所有的头中的键值返回枚举项
        Enumeration<String> headerNames = req.getHeaderNames();
//        遍历枚举打印并根据键来找到对应的值并打印
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
//            将键获取到的枚举项直接转换成String类型并输出
            String value = req.getHeader(name);
            System.out.println(name + ":" + value);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        doPost(req, resp);
    }
}
