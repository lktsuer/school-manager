package com.lktsuer.service;

import com.lktsuer.domain.Admin;

/**
 * @author: djh
 * @date: 2020/9/2 15:38
 */
public interface AdminService {

    /**
     * 查询admin
     * @param adminId admin_id
     * @return admin
     */
    public Admin queryById(String adminId);
}
