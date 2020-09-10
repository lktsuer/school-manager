package com.lktsuer.service;

import com.lktsuer.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: djh
 * @date: 2020/8/26 17:32
 */
@Service
public interface StudentService {

    public List<Student> queryForAll();

    public Student queryById(Integer stuId);

    public Student queryByName(String stuName);

    public int changePassword(Integer stuId,String stuPwd);

    public int delete(Integer stuId);

    public int updateAll(Student student);

    public int insert(Student student);

}
