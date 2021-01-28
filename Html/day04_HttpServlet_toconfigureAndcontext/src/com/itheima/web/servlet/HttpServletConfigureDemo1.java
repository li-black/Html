package com.itheima.web.servlet;
//对ServletConfigure的一些基本操作

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class HttpServletConfigureDemo1 extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//        根据key来获取value
        String encoding = config.getInitParameter("encoding");
        System.out.println(encoding);
        System.out.println("---------------------------");
//        获取所有key的集合再根据key来获取所有value
        Enumeration<String> keys = config.getInitParameterNames();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = config.getInitParameter(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("---------------------------");
//        获取Servlet名称
        String servletName = config.getServletName();
        System.out.println(servletName);
        System.out.println("---------------------------");
//        获取servletContext对象
        ServletContext servletContext = config.getServletContext();
        System.out.println(servletContext);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
