package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import lk.cmb.ucsc.drivingschool.repo.QuizQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizQuestionService {
    @Autowired
    private QuizQuestionRepo quizquestionRepo;

    //create new question
    public QuizQuestion createQuizQuestion(QuizQuestion quizquestion){
        return quizquestionRepo.save(quizquestion);
    }
    public QuizQuestion getByID(String id){
        return quizquestionRepo.findById(id);
    }

    //delete question
    public void delete(String id){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestionRepo.delete(quizquestion);
    }


}
