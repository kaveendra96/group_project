package lk.cmb.ucsc.drivingschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
    @RequestMapping("/api/student")
    public String teacher(){
        return "student/index";
    }
}
