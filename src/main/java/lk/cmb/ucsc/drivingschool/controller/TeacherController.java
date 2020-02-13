package lk.cmb.ucsc.drivingschool.controller;

import lk.cmb.ucsc.drivingschool.commands.TeacherForm;
import lk.cmb.ucsc.drivingschool.converters.TeacherToTeacherForm;
import lk.cmb.ucsc.drivingschool.model.Teacher;
import lk.cmb.ucsc.drivingschool.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
public class TeacherController {



    @RequestMapping("/api/teacher")
    public String teacher(){
        return "teacher/index";
    }

    @RequestMapping("/teacher/list.html")
    public String list(){
        return "teacher/list";
    }

    @RequestMapping("/teacher/profile.html")
    public String profile(){
        return "teacher/profile";
    }

    @RequestMapping("/teacher/lession.html")
    public String lession(){
        return "teacher/lession";
    }

    @RequestMapping("/teacher/vehicle.html")
    public String vehicle(){
        return "teacher/vehicle";
    }

    @RequestMapping("/teacher/mystudent.html")
    public String mystudent(){ return "teacher/mystudent"; }

    @RequestMapping("/teacher/rating.html")
    public String rating(){ return "teacher/rating"; }

    @RequestMapping("/teacher/login.html")
    public String logout(){ return "login"; }

    private TeacherService teacherService;

    private TeacherToTeacherForm teacherToTeacherForm;

    @Autowired
    public void setTeacherToTeacherForm(TeacherToTeacherForm teacherToTeacherForm) {
        this.teacherToTeacherForm = teacherToTeacherForm;
    }

    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/teacher/list";
    }

    @RequestMapping({"/teacher/list", "/teacher"})
    public String listTeachers(Model model){
        model.addAttribute("teachers", teacherService.listAll());
        return "teacher/list";
    }

    @RequestMapping("/teacher/show/{id}")
    public String getTeacher(@PathVariable String id, Model model){
        model.addAttribute("teacher", teacherService.getById(id));
        return "teacher/show";
    }

    @RequestMapping("teacher/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Teacher teacher = teacherService.getById(id);
        TeacherForm teacherForm = teacherToTeacherForm.convert(teacher);

        model.addAttribute("teacherForm", teacherForm);
        return "teacher/teacherform";
    }

    @RequestMapping("/teacher/new")
    public String newTeacher(Model model){
        model.addAttribute("teacherForm", new TeacherForm());
        return "teacher/teacherform";
    }

    @RequestMapping("/teacher/next")
    public String nextTeachers(Model model){
        model.addAttribute("teachers", teacherService.listAll());
        return "teacher/list";
    }

    @RequestMapping(value = "/teacher", method = RequestMethod.POST)
    public String saveOrUpdateTeacher(@Valid TeacherForm teacherForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "teacher/teacherform";
        }

        Teacher savedTeacher = teacherService.saveOrUpdateTeacherForm(teacherForm);

        return "redirect:/teacher/show/" + savedTeacher.getId();
    }

    @RequestMapping("/teacher/delete/{id}")
    public String delete(@PathVariable String id){
        teacherService.delete(id);
        return "redirect:/teacher/list";
    }
}
