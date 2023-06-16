package zysy.iflytek.edu.mapper;

import zysy.iflytek.edu.pojo.CourseStudyhistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import zysy.iflytek.edu.vo.StudentandcourseVo;

import java.util.List;

/**
* @author 简宏才
* @description 针对表【edu_course_studyhistory】的数据库操作Mapper
* @createDate 2023-06-16 09:56:12
* @Entity zysy.iflytek.edu.pojo.CourseStudyhistory
*/
public interface CourseStudyhistoryMapper extends BaseMapper<CourseStudyhistory> {

    List<StudentandcourseVo> studentandcourselist();

}




