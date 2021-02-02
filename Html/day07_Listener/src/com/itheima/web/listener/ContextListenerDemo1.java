package com.itheima.web.listener;
//ServletContextListener监听器
//监听ServletContext对象的创建与销毁

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListenerDemo1 implements ServletContextListener {
    //    监听创建
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听到了对象的创建");
//        获取servletContext
        ServletContext servletContext = sce.getServletContext();
//        打印
        System.out.println(servletContext);
//        添加值
        servletContext.setAttribute("username", "zhangsan");
//        替换值
        servletContext.setAttribute("username", "lisi");
//        移除值
        servletContext.removeAttribute("username");
    }

    //    监听销毁
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听到了对象的销毁");
    }
}
