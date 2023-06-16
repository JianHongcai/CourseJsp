package zysy.iflytek.edu.service;

import zysy.iflytek.edu.pojo.CourseStudyhistory;
import com.baomidou.mybatisplus.extension.service.IService;
import zysy.iflytek.edu.vo.StudentandcourseVo;

import java.util.List;

/**
* @author 简宏才
* @description 针对表【edu_course_studyhistory】的数据库操作Service
* @createDate 2023-06-16 09:56:12
*/
public interface CourseStudyhistoryService extends IService<CourseStudyhistory> {

    List<StudentandcourseVo> studentandcourselist();
}
