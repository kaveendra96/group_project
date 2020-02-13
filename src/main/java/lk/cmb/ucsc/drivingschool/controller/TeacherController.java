package lk.cmb.ucsc.drivingschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {
    @RequestMapping("/api/teacher")
    public String teacher(){
        return "teacher/index";
    }

    @RequestMapping("/api/teacherform.html")
    public String teacherform(){
        return "teacher/teacherform.html";
    }

    @RequestMapping("/api/profile.html")
    public String profile(){
        return "teacher/profile.html";
    }

    @RequestMapping("/api/lession.html")
    public String lession(){
        return "teacher/lession.html";
    }

    @RequestMapping("/api/vehicle.html")
    public String vehicle(){
        return "teacher/vehicle.html";
    }

    @RequestMapping("/api/mystudent.html")
    public String mystudent(){ return "teacher/mystudent.html"; }

    @RequestMapping("/api/rating.html")
    public String rating(){ return "teacher/rating.html"; }
}
