package com.itheima.filter;
//用过滤器解决登陆验证

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(value = {"/addStudent.jsp", "/listStudentServlet"})
public class CheckLoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
//        将servletRequest和servletResponse转换成与Http协议有关的
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
//        获取会话域对象中数据
        Object username = request.getSession().getAttribute("username");
//        判断用户名
        if (username == null || "".equals(username)) {
//            如果没有登录就重定向到登录页面
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }
//        放行
        filterChain.doFilter(request, response);
    }
}
