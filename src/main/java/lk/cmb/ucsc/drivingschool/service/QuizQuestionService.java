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
    public QuizQuestion create(QuizQuestion quizquestion){
        return quizquestionRepo.save(quizquestion);
    }
    public QuizQuestion getById(String id){
        return quizquestionRepo.findById(id);
    }

    //delete question
    public void delete(String id){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestionRepo.delete(quizquestion);
    }

    //update question
    public QuizQuestion updateQuestion(String id, String question){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setCorrect(question);
        return quizquestionRepo.save(quizquestion);
    }

    public QuizQuestion updateAnswer(String id, String correct){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setCorrect(correct);
        return quizquestionRepo.save(quizquestion);
    }


}
