package com.lktsuer.service.impl;

import com.lktsuer.domain.Student;
import com.lktsuer.mapper.StudentMapper;
import com.lktsuer.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/8/26 17:33
 */
@Service
public class StudentServiceImpl implements StudentService {

    StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Student> queryForAll() {
        return studentMapper.queryForAll();
    }

    @Override
    public Student queryById(Integer stuId) {
        return studentMapper.queryById(stuId);
    }

    @Override
    public Student queryByName(String stuName) {
        return studentMapper.queryByName(stuName);
    }

    @Override
    public int changePassword(Integer stuId, String stuPwd) {
        return studentMapper.updatePassword(stuId, stuPwd);
    }

    @Override
    public int delete(Integer stuId) {
        return studentMapper.delete(stuId);
    }

    @Override
    public int updateAll(Student student) {
        return studentMapper.updateAll(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }
}
