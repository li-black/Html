package com.itheima.web.servlet.cookie;
//案例能够写出访问网站的历史时间，由于只设置了15s存活时间，要想更多可以自行调整cookie.setMaxAge();

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/Servlet_Cookie_Demo3")
public class Servlet_Cookie_Demo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        设置编码格式
        resp.setContentType("text/html;charset=UTF-8");
//        获取输出流
        PrintWriter pw = resp.getWriter();
//        获取cookie对象数组
        Cookie[] cookies = req.getCookies();
//        设置标记是否第一次访问本网站
        boolean isFirst = true;
//        判断获取的数组是否为空
        if (cookies != null && cookies.length > 0) {
//            便利数组
            for (Cookie cookie : cookies) {
//                查找lastTime
                if ("lastTime".equalsIgnoreCase(cookie.getName())) {
//                    找到后获取值
                    String value = cookie.getValue();
//                    创建SimpleDateFormat格式化时间对象
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    格式化时间
                    String format = sdf.format(new Date(Long.parseLong(value)));
//                    打印信息
                    pw.write("欢迎访问本网站,您的最后访问时间为：<br/>");
                    pw.write(format);
//                    将标记修改已经访问过本网站
                    isFirst = false;
                }
            }
        }
//        如果是第一次访问的输出
        if (isFirst) {
            pw.write("欢迎您首次访问本网站");
        }
//        设置现在时间存入cookie
        Cookie cookie = new Cookie("lastTime", System.currentTimeMillis() + "");
//        设置最大存活时间
        cookie.setMaxAge(120);
//        添加cookie
        resp.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }
}
