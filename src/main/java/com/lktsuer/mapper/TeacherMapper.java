package com.lktsuer.mapper;

import com.lktsuer.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author: djh
 * @date: 2020/8/26 22:46
 */
@Mapper
@Repository
public interface TeacherMapper {

    @Select("select * from teacher where th_id=#{thId}")
    Teacher queryById(Integer thId);

    @Update("update teacher set th_pwd=#{thPwd} where th_id=#{thId}")
    int changePassword(Integer thId,String thPwd);
}
