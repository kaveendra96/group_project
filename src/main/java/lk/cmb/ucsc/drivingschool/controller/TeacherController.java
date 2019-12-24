package lk.cmb.ucsc.drivingschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TeacherController {
    @RequestMapping("/api/teacher")
    public String teacher(){
        return "teacher/index";
    }
}
