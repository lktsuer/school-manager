package com.lktsuer.controller;

import com.lktsuer.domain.Course;
import com.lktsuer.domain.Teacher;
import com.lktsuer.domain.dto.ScoreNoCourseNameDto;
import com.lktsuer.mapper.CourseMapper;
import com.lktsuer.mapper.ScoreMapper;
import com.lktsuer.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: djh
 * @date: 2020/8/28 20:13
 */
@Controller
public class ThController {


    TeacherService teacherService;

    public ThController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Autowired
    ScoreMapper scoreMapper;

    @Autowired
    CourseMapper courseMapper;

    @PostMapping("/teacher/login")
    public ModelAndView login(
            @RequestParam("loginUsername") String inputId,
            @RequestParam("loginPassword") String inputPwd,
            ModelAndView mv,
            HttpSession session) {
        try {
            Teacher teacher = teacherService.queryById(Integer.parseInt(inputId));
            if (inputPwd.equals(teacher.getThPwd())) {
                Map<String,List<ScoreNoCourseNameDto>> scoreMap = new HashMap<>();
                System.out.println(teacher);
                List<Course> courses = courseMapper.queryByThId(teacher.getThId());
                for (Course course : courses) {
                    List<ScoreNoCourseNameDto> scoreNoCourseNameDtoList =
                            scoreMapper.queryByThIdAndCourseId(teacher.getThId(), course.getCourseId());
                    scoreMap.put(course.getCourseName(), scoreNoCourseNameDtoList);
                }
                session.setAttribute("scoreMap",scoreMap);
                session.setAttribute("teacher",teacher);
                mv.addObject("scoreMap",scoreMap);
                mv.setViewName("manager");
            } else {
                mv.addObject("msg", "用户名或密码错误!");
                mv.setViewName("login");
            }
            return mv;
        } catch (NumberFormatException e) {
            mv.addObject("msg", "用户名或密码错误!");
            mv.setViewName("login");
            return mv;
        }
    }
}
