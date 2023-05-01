package com.example.springbootdemo07.controller;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/**
 * ClassName: ConsumerTimerFilter
 * Package: com.example.springbootdemo07.controller
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@Component
public class ConsumerTimerFilter implements Filter {
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("timer Filter begin");
        long start=new Date().getTime();
        chain.doFilter(request, response);
        long end=new Date().getTime();
        System.out.println("timer Filter end,cost time:"+(end-start));
    }
}