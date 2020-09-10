package com.lktsuer.mapper;

import com.lktsuer.domain.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author: djh
 * @date: 2020/9/2 15:35
 */
@Mapper
@Repository
public interface AdminMapper {

    /**
     * 获得管理员账户
     * @param adminId admin_id
     * @return admin
     */
    @Select("select * from admin where admin_id=#{adminId}")
    Admin queryById(String adminId);
}
