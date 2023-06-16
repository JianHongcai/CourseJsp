package zysy.iflytek.edu.controller;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import zysy.iflytek.edu.pojo.Course;
import zysy.iflytek.edu.service.CourseService;
import zysy.iflytek.sys.pojo.Teacher;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/edu/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public String add(Course course){
        course.setCreateTime(new Date());
        course.setUpdateTime(new Date());
        courseService.save(course);
        return "redirect:/edu/course/list";
    }


    @RequestMapping("/detail")
    public String detailcourse(Integer id, HttpServletRequest request) {

        Course course = courseService.selectById(id);
        request.setAttribute("course", course);
        return "forward:/updatecourse.jsp";//跳转到页面
    }

    @RequestMapping("/update")
    public String updateCourse(Course course, Integer id) {
        courseService.update(course, id);
        return "redirect:/edu/course/list";
    }






        @RequestMapping("/delete")
        public String delete(Integer id){
            courseService.removeById(id);

            return "redirect:/edu/course/list";
        }



    @GetMapping("/list")
    public String list(HttpServletRequest request){
        List<Course> list = courseService.list();
        request.setAttribute("courselist",list);

        return "forward:/courselist.jsp";
    }

}
