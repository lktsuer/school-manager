package com.lktsuer.service;

import com.lktsuer.domain.Teacher;

/**
 * @author: djh
 * @date: 2020/8/26 22:48
 */
public interface TeacherService {

    Teacher queryById(Integer thId);

    int changePassword(Integer thId, String thPwd);
}
