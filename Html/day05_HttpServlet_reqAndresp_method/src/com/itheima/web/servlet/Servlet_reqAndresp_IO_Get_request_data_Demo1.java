package com.itheima.web.servlet;
//根据IO流来获取请求数据
//注意IO流这种方法只支持post方式不支持get方法所以要修改html文件表单中的方法
//注意字符流不怎么常用但是字节流应用比较广泛因为上传文件之类的可以用字节流

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_IO_Get_request_data_Demo1")
public class Servlet_reqAndresp_IO_Get_request_data_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        一、字符流
//        获取流
        BufferedReader br = req.getReader();
        String line;
//        读取并打印
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
//        二、字节流
//        获取流
        ServletInputStream is = req.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
//        读取并打印
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
