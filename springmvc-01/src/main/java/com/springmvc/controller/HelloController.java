package com.springmvc.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: 小强
 * @date: 2021/8/17 0017
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
@Controller
public class HelloController {
    @RequestMapping("/main")
    public String hello()
    {
        System.out.println("hello world");
        return "result";
    }



    //@ResponseBody
    //@RequestMapping(value = "/{content}")
    //public String todo2(@PathVariable String content) {
    //    return "Hello Spring " + content;
    //}

    @RequestMapping("/hello/{name}")
    public String sayhello(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/Login")
    public String Login(String name, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("name",name);
        return "redirect:/main";
    }

    @RequestMapping("/Logout")
    public String Logout(HttpServletRequest request){
        request.getSession().removeAttribute("name");
        return "redirect:/index.jsp";
    }

}
