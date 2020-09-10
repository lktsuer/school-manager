package com.lktsuer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: djh
 * @date: 2020/8/26 22:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private Integer thId;
    private String thName;
    private String thPwd;
    private String thEmail;
}
