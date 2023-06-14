package zysy.iflytek.edu.controller;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zysy.iflytek.edu.pojo.Course;
import zysy.iflytek.edu.service.CourseService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/edu/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String add(Course course){
        courseService.save(course);
        return "redirect:/edu/course/list";
    }



    @GetMapping("/list")
    public String list(HttpServletRequest request){
        List<Course> list = courseService.list();
        request.setAttribute("courselist",list);

        return "forward:/courselist.jsp";
    }

}
