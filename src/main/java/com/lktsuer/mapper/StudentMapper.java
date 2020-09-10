package com.lktsuer.mapper;

import com.lktsuer.domain.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/8/26 17:32
 */
@Mapper
@Repository
public interface StudentMapper {

    /**
     * 查全部
     *
     * @return student list
     */
    @Select("select * from student")
    List<Student> queryForAll();

    /**
     * 查学生 by id
     *
     * @param stuId id
     * @return student
     */
    @Select("select * from student where stu_id=#{stuId}")
    Student queryById(Integer stuId);

    /**
     * 查学生 by name
     *
     * @param stuName name
     * @return student
     */
    @Select("select * from student where stu_id=#{stuId}")
    Student queryByName(String stuName);

    /**
     * 插入学生数据
     *
     * @param student student
     * @return int
     */
    @Insert("insert into " +
            "student(stu_name,stu_pwd,stu_sex,stu_email,stu_birth) " +
            "values(#{stuName},#{stuPwd},#{stuSex},#{stuEmail},#{stuBirth})")
    int insert(Student student);



    /**
     * 更新数据
     *
     * @param student student
     * @return int
     */
    @Update("update student set " +
            "stu_name=#{stuName},stu_pwd=#{stuPwd},stu_sex=#{stuSex},stu_email=#{stuEmail},stu_birth=#{stuBirth} " +
            "where stu_id=#{stuId}")
    int updateAll(Student student);
    /**
     * 更新数据
     *
     * @param stuId id
     * @return int
     */
    @Update("update student set " +
            "stu_pwd=#{stuPwd}" +
            "where stu_id=#{stuId}")
    int updatePassword(Integer stuId,String stuPwd);

    /**
     * 删除学生
     *
     * @param stuId id
     * @return int
     */
    @Delete("delete from student where stu_id=#{stuId}")
    int delete(Integer stuId);


}
