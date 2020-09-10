package com.lktsuer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: djh
 * @date: 2020/9/2 15:34
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private String adminId;
    private String adminPwd;
}
