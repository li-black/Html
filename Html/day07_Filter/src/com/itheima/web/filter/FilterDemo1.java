package com.itheima.web.filter;
//filter过滤器拦截配置

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterDemo1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
//        先执行过滤器
        System.out.println("FilterDemo1执行了");
//        设置编码格式
        servletResponse.setContentType("text/html;charset=UTF-8");
//        放行
        filterChain.doFilter(servletRequest, servletResponse);
//        servlet执行完之后回到filter执行其余代码
        System.out.println("FilterDemo1响应完成");
    }
}
