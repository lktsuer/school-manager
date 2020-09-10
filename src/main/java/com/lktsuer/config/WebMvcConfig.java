package com.lktsuer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: djh
 * @date: 2020/8/27 23:16
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register.html").setViewName("register");
        registry.addViewController("/manager.html").setViewName("manager");
        registry.addViewController("/forms.html").setViewName("forms");
        registry.addViewController("/charts.html").setViewName("charts");
        registry.addViewController("/tables.html").setViewName("tables");
        registry.addViewController("/commons/common-element.html").setViewName("/commons/common-element");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns(
                        "/",
                        "/index.html",
                        "/login.html",
                        "/register.html",
                        "/login",
                        "/register",
                        "/teacher/login",
                        "/teacher/register",
                        "/css/**",
                        "/fonts/**",
                        "/icon-reference/**",
                        "/img/**",
                        "/js/**",
                        "/vendor/**");
    }
}
