package zysy.iflytek.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zysy.iflytek.sys.pojo.Student;
import zysy.iflytek.sys.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("sys/student")
public class Controller {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> list(){
        return studentService.list();
    }


}
