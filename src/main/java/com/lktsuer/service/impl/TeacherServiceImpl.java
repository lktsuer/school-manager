package com.lktsuer.service.impl;

import com.lktsuer.domain.Teacher;
import com.lktsuer.mapper.TeacherMapper;
import com.lktsuer.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author: djh
 * @date: 2020/8/26 23:10
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    TeacherMapper teacherMapper;

    @Autowired
    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public Teacher queryById(Integer thId) {
        return teacherMapper.queryById(thId);
    }

    @Override
    public int changePassword(Integer thId, String thPwd) {
        return teacherMapper.changePassword(thId, thPwd);
    }
}
