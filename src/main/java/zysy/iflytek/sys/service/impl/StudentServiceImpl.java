package zysy.iflytek.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.util.DigestUtils;
import zysy.iflytek.sys.pojo.Student;
import zysy.iflytek.sys.service.StudentService;
import zysy.iflytek.sys.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
* @author 简宏才
* @description 针对表【sys_student】的数据库操作Service实现
* @createDate 2023-06-12 11:49:32
*/
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
    implements StudentService{

    @Override
    public void register(Student student) {


        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();

        queryWrapper.lambda().eq(Student::getMobile,student.getMobile());

        boolean exists = baseMapper.exists(queryWrapper);



        if (exists){
            throw new RuntimeException("该用户已经注册");
        }

        String pwdSecret = DigestUtils.md5DigestAsHex(student.getPassword().getBytes(StandardCharsets.UTF_8));
        student.setPassword(pwdSecret);

        baseMapper.insert(student);


    }

    @Override
    public void login(String userName, String password) {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Student::getUserName,userName);
        boolean exists = baseMapper.exists(queryWrapper);
        if (!exists){
            throw new RuntimeException("用户名输入错误");
        }



//        LambdaQueryWrapper<Student> eq = queryWrapper.lambda().eq(Student::getPassword, password);
        String pwdSecret = DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8));
        queryWrapper.lambda().eq(Student::getUserName,userName).eq(Student::getPassword,pwdSecret);
        boolean exists1 = baseMapper.exists(queryWrapper);
       if(!exists1) throw new RuntimeException("密码输入错误");

    }
}




