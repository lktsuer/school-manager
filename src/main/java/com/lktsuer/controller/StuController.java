package com.lktsuer.controller;

import com.lktsuer.domain.Student;
import com.lktsuer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author: djh
 * @date: 2020/8/28 20:13
 */
@Controller
public class StuController {


    StudentService studentService;

    @Autowired
    public StuController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/login")
    public ModelAndView login(
            @RequestParam("loginUsername") String inputId,
            @RequestParam("loginPassword") String inputPwd,
            ModelAndView mv,
            HttpSession session) {
        try {
            Student student = studentService.queryById(Integer.parseInt(inputId));
            if (inputPwd.equals(student.getStuPwd())) {
                System.out.println(student);
                session.setAttribute("student", student);
                mv.addObject("student", student);
                mv.setViewName("manager");
            } else {
                mv.addObject("msg", "用户名或密码错误!");
                mv.setViewName("login");
            }
            return mv;
        } catch (NumberFormatException e){
            mv.addObject("msg", "用户名或密码错误!");
            mv.setViewName("login");
            return mv;
        }
    }
}
