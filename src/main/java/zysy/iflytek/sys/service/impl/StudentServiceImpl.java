package zysy.iflytek.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zysy.iflytek.sys.pojo.Student;
import zysy.iflytek.sys.service.StudentService;
import zysy.iflytek.sys.mapper.StudentMapper;
import org.springframework.stereotype.Service;

/**
* @author 简宏才
* @description 针对表【sys_student】的数据库操作Service实现
* @createDate 2023-06-12 11:49:32
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

}




