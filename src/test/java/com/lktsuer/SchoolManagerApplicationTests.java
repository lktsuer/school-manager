package com.lktsuer;

import com.lktsuer.domain.Course;
import com.lktsuer.domain.Score;
import com.lktsuer.domain.Teacher;
import com.lktsuer.domain.dto.ScoreNoCourseNameDto;
import com.lktsuer.mapper.CourseMapper;
import com.lktsuer.mapper.ScoreMapper;
import com.lktsuer.service.StudentService;
import com.lktsuer.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SchoolManagerApplicationTests {
    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @Autowired
    ScoreMapper scoreMapper;

    @Autowired
    CourseMapper courseMapper;

    @Test
    public void test1() {

    }

    @Test
    void contextLoads() {
        Teacher teacher = teacherService.queryById(903);
        if ("js1234".equals(teacher.getThPwd())) {
            Map<String, List<ScoreNoCourseNameDto>> scoreMap = new HashMap<>();
            System.out.println(teacher);
            List<Course> courses = courseMapper.queryByThId(teacher.getThId());
            for (Course course : courses) {
                List<ScoreNoCourseNameDto> scoreNoCourseNameDtoList =
                        scoreMapper.queryByThIdAndCourseId(teacher.getThId(), course.getCourseId());
                scoreMap.put(course.getCourseName(), scoreNoCourseNameDtoList);
            }
            for (String s:scoreMap.keySet()) {
                List<ScoreNoCourseNameDto> scoreNoCourseNameDtoList = scoreMap.get(s);
                System.out.println(scoreNoCourseNameDtoList+"\n");
            }
        }

    }
}





