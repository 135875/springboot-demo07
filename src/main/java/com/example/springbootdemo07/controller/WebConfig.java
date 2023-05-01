package com.example.springbootdemo07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: WebConfig
 * Package: com.example.springbootdemo07.controller
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@Configuration
public class WebConfig {
    @Autowired
    private ConsumerTimerFilter consumerTimerFilter;
    @Bean
    public FilterRegistrationBean consumerLoginFilterRegistration() {
        FilterRegistrationBean<ConsumerTimerFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(ConsumerTimerFilter());
        registration.addUrlPatterns("/*");
        registration.setName("consumerLoginFilter");
        registration.setOrder(2);
        return registration;
    }
    private ConsumerTimerFilter ConsumerTimerFilter(){
        return consumerTimerFilter;
    }

}