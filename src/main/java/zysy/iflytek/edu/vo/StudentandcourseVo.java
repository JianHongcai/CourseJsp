package zysy.iflytek.edu.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import zysy.iflytek.edu.pojo.CourseStudyhistory;

@Data
@EqualsAndHashCode(callSuper = true)
public class StudentandcourseVo extends CourseStudyhistory {
    private static final long serialVersionUID = 1L;

    /**
     * 课程号
     */
    private String courseCno;

    /**
     * 课程名称
     */
    private String courseName;


    /**
     * 教师姓名
     */
    private String name;


}
