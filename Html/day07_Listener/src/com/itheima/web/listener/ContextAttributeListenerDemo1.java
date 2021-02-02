package com.itheima.web.listener;
//ServletContextAttributeListener监听器
//监听ServletContext的共享值的变化
//移除之后获取的应该为null

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextAttributeListenerDemo1 implements ServletContextAttributeListener {
    //    监听添加
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("属性添加");
//        获取值
        Object username = scae.getServletContext().getAttribute("username");
//        打印
        System.out.println(username);
    }

    //    监听替换
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("属性替换");
//        获取值
        Object username = scae.getServletContext().getAttribute("username");
//        打印
        System.out.println(username);
    }

    //    监听移除
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("属性移除");
//        获取值
        Object username = scae.getServletContext().getAttribute("username");
//        打印
        System.out.println(username);
    }
}
