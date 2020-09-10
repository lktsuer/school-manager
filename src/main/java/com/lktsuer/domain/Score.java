package com.lktsuer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: djh
 * @date: 2020/9/2 15:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Score {
    private Integer scoreId;
    private Integer courseId;
    private Integer stuId;
    private Integer score;
}
