package com.itheima.web.servlet;
//用HttpServlet的getRequestURI方法来识别uri中的内容并根据不同内容来返回不同的价格信息

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        int money = 1000;
        String uri = req.getRequestURI();
//        先获取最后的/的索引之后用substring获取这个索引和其之后的所有字符串
        uri = uri.substring(uri.lastIndexOf("/"));
        if ("/vip".equals(uri)) {
            System.out.println("vip打折之后为" + money * 0.8);
        } else if ("/vvip".equals(uri)) {
            System.out.println("vvip打折之后为" + money * 0.5);
        } else {
            System.out.println("商品价格为" + money);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        doGet(req, resp);
    }
}
