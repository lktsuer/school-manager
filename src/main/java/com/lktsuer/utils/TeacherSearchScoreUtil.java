package com.lktsuer.utils;

import com.lktsuer.domain.Score;
import com.lktsuer.domain.dto.ScoreDto;
import com.lktsuer.domain.dto.ScoreNoCourseNameDto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: djh
 * @date: 2020/9/3 18:26
 */
public class TeacherSearchScoreUtil {

    private Map<String, ScoreNoCourseNameDto> spilitByCourse(List<ScoreDto> scoreList) {
        Map<String, ScoreNoCourseNameDto> map = new HashMap<>();
        for (ScoreDto s : scoreList) {
            String course = s.getCourseName();
        }
        return null;
    }
}
