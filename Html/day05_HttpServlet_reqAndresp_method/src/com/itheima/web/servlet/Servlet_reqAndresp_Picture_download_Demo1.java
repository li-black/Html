package com.itheima.web.servlet;
//设置响应对象文件下载演示下载图片

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/Servlet_reqAndresp_Picture_download_Demo1")
public class Servlet_reqAndresp_Picture_download_Demo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        获取Context对象
        ServletContext context = getServletContext();
//        获取图片的绝对路径
        String realPath = context.getRealPath("/img/12.png");
//        获取字节缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));
//        设置响应消息头MIME类型
        resp.setHeader("Content-Type", "application/octet-stream");
//        告知浏览器以下载的方式打开
        resp.setHeader("Content-Disposition", "attachment;filename=12.png");
//        获取字节输出流
        ServletOutputStream os = resp.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
//        输出数据
        while ((len = bis.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
//        释放资源
        bis.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
