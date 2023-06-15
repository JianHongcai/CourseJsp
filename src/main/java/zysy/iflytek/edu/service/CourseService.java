package zysy.iflytek.edu.service;

import zysy.iflytek.edu.pojo.Course;
import com.baomidou.mybatisplus.extension.service.IService;
import zysy.iflytek.sys.pojo.Teacher;

/**
* @author 简宏才
* @description 针对表【edu_course】的数据库操作Service
* @createDate 2023-06-12 11:48:48
*/
public interface CourseService extends IService<Course> {


    Course selectById(Integer id);

    int update(Course course, Integer id);
}
