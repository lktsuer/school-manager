package com.lktsuer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: djh
 * @date: 2020/8/30 22:35
 */
@Controller
public class ForwardController {

    @GetMapping("/forward/student")
    public ModelAndView forwardToStu(ModelAndView mv){
        mv.addObject("role","student");
        mv.setViewName("login");
        return mv;
    }
}
