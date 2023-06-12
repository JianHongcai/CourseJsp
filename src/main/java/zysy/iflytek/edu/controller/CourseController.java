package zysy.iflytek.edu.controller;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zysy.iflytek.edu.pojo.Course;
import zysy.iflytek.edu.service.CourseService;

import javax.validation.Valid;

@RestController
@RequestMapping("/edu/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @ApiModelProperty
    @PostMapping("/add")
    @ApiOperation(value = "新增",notes = "传入course")
    public boolean add(@Valid @RequestBody Course course) {
        return courseService.save(course);

    }


}
