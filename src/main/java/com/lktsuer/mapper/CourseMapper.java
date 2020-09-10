package com.lktsuer.mapper;

import com.lktsuer.domain.Course;
import com.lktsuer.domain.Score;
import com.lktsuer.domain.dto.CourseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/2 15:58
 */
@Mapper
@Repository
public interface CourseMapper {

    @Select("select * from course where course_id=#{courseId}")
    Score queryById(Integer courseId);

    @Select("select * from course")
    List<Course> queryForAll();

    @Select("select * from course where th_id=#{thId}")
    List<Course> queryByThId(Integer thId);
}
