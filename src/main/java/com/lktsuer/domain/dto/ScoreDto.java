package com.lktsuer.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: djh
 * @date: 2020/9/2 16:11
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ScoreDto {
    private String courseName;
    private Integer stuId;
    private String stuName;
    private Integer score;
}
