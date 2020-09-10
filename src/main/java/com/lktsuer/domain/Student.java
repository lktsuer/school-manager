package com.lktsuer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author: djh
 * @date: 2020/8/26 17:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private Integer stuId;
    private String stuName;
    private String stuPwd;
    private String stuSex;
    private String stuEmail;
    private Date stuBirth;
}
