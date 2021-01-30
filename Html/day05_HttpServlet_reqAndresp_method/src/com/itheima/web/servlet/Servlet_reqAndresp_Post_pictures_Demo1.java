package com.itheima.web.servlet;
//设置浏览器页面显示图片

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_Post_pictures_Demo1")
public class Servlet_reqAndresp_Post_pictures_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        获取Context对象并获取图片的真实路径
        String realPath = getServletContext().getRealPath("img/12.png");
//        获取字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));
//        获取字节输出流
        ServletOutputStream sos = resp.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
//        输出字节
        while ((len = bis.read(bytes)) != -1) {
            sos.write(bytes, 0, len);
        }
        bis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
