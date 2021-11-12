package com.mvc.controller;

import com.mvc.pojo.Banji;
import com.mvc.pojo.Student;
import com.mvc.pojo.User;
import com.mvc.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: 小强
 * @date: 2021/11/11 0011
 * @tool: IntelliJ IDEA
 * @words: Be more professional every day!
 */
@Controller

public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg", "第一个springmvc程序");
        return "welcome";

    }


    /**
     * 跳转至学生页面
     * @return
     */
    @RequestMapping("/toStudent")
    public String toStudent(){
        return "student";
    }

    /**
     * 输入学生信息
     * @param student
     * @return
     */
    @RequestMapping("/findStudent")
    public String findStudent(Student student){
        int stu_id = student.getStu_id();
        Banji banji = student.getBanji();
        String banji_name = banji.getBanji_name();
        System.out.println("stu_id: "+stu_id);
        System.out.println("banji_name: "+banji_name);

        return "success";

    }


    @RequestMapping("/toCourse")
    public String toCourse(){
        return "course";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(int[] ids) {
        if (ids != null) {
            for (int id : ids) {
                System.out.println("成功删除了id为"+id+"的书");
            }
        }else {
            System.out.println("ids==null");
        }

        return "success";
    }

    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }

    @RequestMapping("/editUsers")
    public String editUsers(UserVo userList) {
        List<User> users = userList.getUsers();
        for (User user : users) {
            System.out.println("删除了id为"+user.getId()+"的用户名为"+user.getName());
        }

        return "success";
    }
}
