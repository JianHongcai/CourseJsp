package zysy.iflytek.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import zysy.iflytek.edu.pojo.Course;
import zysy.iflytek.edu.pojo.CourseStudyhistory;
import zysy.iflytek.edu.service.CourseStudyhistoryService;
import zysy.iflytek.edu.vo.StudentandcourseVo;
import zysy.iflytek.sys.pojo.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/edu/courseStudyhistory")
public class CourseStudyhistoryController {

    @Autowired
    private CourseStudyhistoryService historyService;



    @GetMapping("/list")
    public String list(HttpServletRequest request){
        List<StudentandcourseVo> hisList = historyService.studentandcourselist();
        request.setAttribute("hislist",hisList);
        return "forward:/historylist.jsp";
    }

    @PostMapping("/add")
    public String add(CourseStudyhistory history){
        history.setCreateTime(new Date());
        history.setUpdateTime(new Date());
        historyService.save(history);
        return "redirect:/edu/courseStudyhistory/list";
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        historyService.removeById(id);

        return "redirect:/edu/courseStudyhistory/list";
    }




}
