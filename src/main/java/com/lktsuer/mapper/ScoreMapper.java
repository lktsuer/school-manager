package com.lktsuer.mapper;

import com.lktsuer.domain.Course;
import com.lktsuer.domain.Score;
import com.lktsuer.domain.Student;
import com.lktsuer.domain.dto.ScoreDto;
import com.lktsuer.domain.dto.ScoreNoCourseNameDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/9/2 16:08
 */
@Mapper
@Repository
public interface ScoreMapper {

    @Insert("insert into " +
            "score(course_id,stu_id,score) " +
            "values(#{courseId},#{stuId},#{score})")
    int insert(Score score);

    /**
     * 更新数据
     *
     * @param score score
     * @return int
     */
    @Update("update score set " +
            "score=#{score}" +
            "where stu_id=#{stuId} and course_id=#{courseId}")
    int update(Score score);


    @Select("SELECT course.course_name,score.stu_id,student.stu_name,score.score " +
            "FROM student,score,course,teacher " +
            "WHERE score.course_id = course.course_id " +
            "AND course.th_id = teacher.th_id " +
            "AND student.stu_id=score.stu_id " +
            "AND course.th_id=#{thId}")
    List<ScoreDto> queryByThId(Integer thId);


    @Select("SELECT score.stu_id, student.stu_name, score.score " +
            "FROM student, score, course " +
            "WHERE score.course_id = course.course_id " +
            "AND student.stu_id = score.stu_id " +
            "AND course.th_id = #{thId} " +
            "AND course.course_id = #{courseId}")
    List<ScoreNoCourseNameDto> queryByThIdAndCourseId(Integer thId, Integer courseId);


}
