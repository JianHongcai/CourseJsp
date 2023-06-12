package zysy.iflytek.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zysy.iflytek.common.utils.VerifyCodeUtils;
import zysy.iflytek.sys.pojo.Student;
import zysy.iflytek.sys.service.StudentService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
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

    @GetMapping("/generateImgCode")
    public void generateImgCode(HttpSession session, HttpServletResponse response) throws IOException {
        String code = VerifyCodeUtils.generateVerifyCode(6);
        System.out.println(code);

        session.setAttribute("code",code);
        response.setContentType("image/png");

        ServletOutputStream outputStream = response.getOutputStream();
        VerifyCodeUtils.outputImage(220,60,outputStream,code);

    }


}
