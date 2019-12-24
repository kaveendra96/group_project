package lk.cmb.ucsc.drivingschool.controller;

import lk.cmb.ucsc.drivingschool.model.User;
import lk.cmb.ucsc.drivingschool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignInController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,value = "signin")
    public void signin(@RequestBody User user){
        System.out.println(user);
        userService.createUser(user);
    }
    @GetMapping("/signin")
    public String getSignin(){
        return "signin";
    }

}
