package zysy.iflytek.edu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zysy.iflytek.edu.pojo.Course;
import zysy.iflytek.edu.service.CourseService;
import zysy.iflytek.edu.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
* @author 简宏才
* @description 针对表【edu_course】的数据库操作Service实现
* @createDate 2023-06-12 11:48:48
*/
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course>
    implements CourseService{

    @Override
    public Course selectById(Integer id) {
        return baseMapper.selectById(id);
    }

    @Override
    public int update(Course course, Integer id) {
        return baseMapper.updateById(course);
    }

}




