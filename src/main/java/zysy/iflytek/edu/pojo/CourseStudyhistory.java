package zysy.iflytek.edu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName edu_course_studyhistory
 */
@TableName(value ="edu_course_studyhistory")
@Data
public class CourseStudyhistory implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程id
     */
    private Integer courseId;

    /**
     * 学生id
     */
    private Integer studentId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 课程状态（0-可申请，1-待审核，2-已审核）
     */
    private Integer courseStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 是否已删除 0-未删除 1-已删除
     */
    private Integer isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}