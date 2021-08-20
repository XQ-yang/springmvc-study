package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * @author: 小强
 * @date: 2021/8/17 0017
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
@Controller
public class HelloController {
    @RequestMapping("/main")
    public String hello(HttpServletRequest request) {
        System.out.println("getRequestURI==>"+request.getRequestURI()); // getRequestURI==>/springmvc/main
        System.out.println("getRequestURL==>"+request.getRequestURL()); // getRequestURL==>http://localhost:8080/springmvc/main
        System.out.println("getContextPath==>"+request.getContextPath());   // getContextPath==>/springmvc
        System.out.println("getServletPath==>"+request.getServletPath());   // getServletPath==>/main
        return "result";
    }



    /*
    * 带参数
    * */

    //@ResponseBody
    //@RequestMapping(value = "/{content}")
    //public String todo2(@PathVariable String content) {
    //    return "Hello Spring " + content;
    //}

    //@RequestMapping("/hello/{name}")
    //public String sayhello(@PathVariable("name") String name, Model model){
    //    model.addAttribute("name", name);
    //    return "hello";
    //}

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/Login")
    public String Login(String name, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("username",name);
        return "redirect:/main";
    }

    @RequestMapping("/Logout")
    public String Logout(HttpServletRequest request){
        // 销毁session
        request.getSession().invalidate();
        return "redirect:/index.jsp";
    }

    @RequestMapping("/url")
    public void url(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("getRequestURI==>"+request.getRequestURI());
        writer.println("getRequestURL==>"+request.getRequestURL());
        writer.println("getContextPath==>"+request.getContextPath());
        writer.println("getServletPath==>"+request.getServletPath());
    }

}
