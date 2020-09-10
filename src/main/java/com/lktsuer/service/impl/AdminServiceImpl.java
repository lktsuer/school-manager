package com.lktsuer.service.impl;

import com.lktsuer.domain.Admin;
import com.lktsuer.mapper.AdminMapper;
import com.lktsuer.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * @author: djh
 * @date: 2020/9/2 15:40
 */
@Service
public class AdminServiceImpl implements AdminService {

    AdminMapper adminMapper;

    @Override
    public Admin queryById(String adminId) {
        return adminMapper.queryById(adminId);
    }
}
