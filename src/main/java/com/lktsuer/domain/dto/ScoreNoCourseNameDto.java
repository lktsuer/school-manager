package com.lktsuer.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: djh
 * @date: 2020/9/3 18:25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScoreNoCourseNameDto {
    private Integer stuId;
    private String stuName;
    private Integer score;
}
