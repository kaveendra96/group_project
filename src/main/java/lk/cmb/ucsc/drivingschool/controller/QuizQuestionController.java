package lk.cmb.ucsc.drivingschool.controller;

import lk.cmb.ucsc.drivingschool.commands.QuizQuestionForm;
import lk.cmb.ucsc.drivingschool.converters.QuizQuestionToQuizQuestionForm;
import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import lk.cmb.ucsc.drivingschool.service.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class QuizQuestionController {

    @RequestMapping("/api/admin/quiz") //quiz.html to be created
    public String quizquestion(){
        return "quiz/createQuestion";
    }

    private QuizQuestionService quizquestionService;

    private QuizQuestionToQuizQuestionForm quizquestionToquizquestionForm;

    @Autowired
    public void setQuizQuestionToQuizQuestionForm(QuizQuestionToQuizQuestionForm quizquestionToQuizQuestionForm) {
        this.quizquestionToQuizQuestionForm = quizquestionToQuizQuestionForm;
    }

    @Autowired
    public void setQuizQuestionService(QuizQuestionService quizquestionService) {
        this.quizquestionService = quizquestionService;
    }

    @RequestMapping({"/quiz/list", "/quiz"})
    public String listQuizQuestions(Model model){
        model.addAttribute("quizquestions", quizquestionService.listAll());
        return "quiz/list";
    }

    @RequestMapping("/createQuestion")
    public String newQuizQuestion(Model model){
        model.addAttribute("quizquestionForm", new QuizQuestionForm());
        return "createQuestion/quizquestionform";
    }

    @RequestMapping("quiz/list/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        QuizQuestion quizquestion = quizquestionService.getById(id);
        QuizQuestionForm quizquestionForm = quizquestionToQuizQuestionForm.convert(quizquestion);

        model.addAttribute("quizquestionForm", quizquestionForm);
        return "redirect:/quiz/list";
    }

    @RequestMapping("/quiz/list/delete/{id}")
    public String delete(@PathVariable String id){
        quizquestionService.delete(id);
        return "redirect:/quiz/list";
    }




}
