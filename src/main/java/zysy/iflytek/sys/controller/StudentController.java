package zysy.iflytek.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zysy.iflytek.common.utils.VerifyCodeUtils;
import zysy.iflytek.sys.pojo.Student;
import zysy.iflytek.sys.service.StudentService;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

//@RestController
@Controller
@RequestMapping("sys/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("login")
    public String login(Student student, String username, String password, HttpSession session) throws UnsupportedEncodingException {
        try {
            Student stu = studentService.login(student, username, password);

            session.setAttribute("student", stu);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login.jsp?msg=" + URLEncoder.encode(e.getMessage(), "UTF-8");
        }
        return "redirect:/edu/course/list";
    }


    @PostMapping("/register")
    public String register(Student student,String code,HttpSession session) throws UnsupportedEncodingException {
        try {
            //验证码校验
            String codeTmp = session.getAttribute("code").toString();
            if(!codeTmp.equals(code)){
                System.out.println("code-codeTmp"+ code + "-" + codeTmp);
               throw new RuntimeException("验证码错误！");
            }
            studentService.register(student);
        } catch (RuntimeException e) {
            e.printStackTrace();
            return "redirect:/regist.jsp?msg=" + URLEncoder.encode(e.getMessage(),"UTF-8");
        }


        return "redirect:/login.jsp";
    }



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
