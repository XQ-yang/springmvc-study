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

        // 登录页放行
        if (request.getRequestURI().contains("Login"))
            return true;
        // 存入的session不为空放行
        if (session.getAttribute("username") != null)
            return true;

        // 其他请求均转发到登录页，登录之后才能访问
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response); //请求转发，路径不变
        //response.sendRedirect(request.getContextPath()+"/toLogin"); //重定向， 路径变为**/toLogin
        return false;
    }
}
