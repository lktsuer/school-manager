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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    private Integer courseId;
    private String courseName;
    private Integer courseHour;
    private Integer courseScore;
    private Integer thId;
}
