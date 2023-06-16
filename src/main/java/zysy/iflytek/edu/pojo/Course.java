package zysy.iflytek.edu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @TableName edu_course
 */
@TableName(value ="edu_course")
@Data
public class Course implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 课程号
     */
    private String courseCno;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 父课程id
     */
    private Integer parentId;

    /**
     * 教师id
     */
    private Integer teacherId;

    /**
     * 计划招收数
     */
    private Integer recruitsPlan;

    /**
     * 实际招收数
     */
    private Integer recruitsActual;

    /**
     * 已申请数
     */
    private Integer recruitsRequest;

    /**
     * 课程有效性（1-上架，2-下架）
     */
    private Integer isValid;

    /**
     * 是否已删除 0-未删除 1-已删除
     */
    private Integer isDeleted;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}