package com.lktsuer.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: djh
 * @date: 2020/8/28 20:05
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object teacher = request.getSession().getAttribute("teacher");
        if (teacher != null){
            return true;
        }else {
            System.out.println();
            request.setAttribute("msg","未登录，请先登录！");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }
    }
}
