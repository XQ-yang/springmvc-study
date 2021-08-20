package com.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: 小强
 * @date: 2021/8/20 0020
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        if (request.getRequestURI().contains("Login"))
            return true;

        if (session.getAttribute("name") != null)
            return true;


        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        return false;
    }
}
