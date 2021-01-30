package com.itheima.web.servlet;
//设置字节流响应的编码格式
//设置字符流响应的编码格式

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet_reqAndresp_setContentType_Demo1")
public class Servlet_reqAndresp_setContentType_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        设置响应的所有流的编码格式
        resp.setCharacterEncoding("UTF-8");
//        设置响应输出的浏览器的编码格式
        resp.setContentType("text/html;charset=UTF-8");
        String str = "你好";
//        获取输出字节流
        ServletOutputStream os = resp.getOutputStream();
//        根据设置的编码格式输出字符
        os.write(str.getBytes("UTF-8"));
//        获取输出字符流
        PrintWriter writer = resp.getWriter();
//        直接输出str,由于设置了浏览器的编码格式,如果存放文件为UTF-8编码直接输出不会乱码,不然要设置响应的所有流的编码格式
        writer.write(str);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
