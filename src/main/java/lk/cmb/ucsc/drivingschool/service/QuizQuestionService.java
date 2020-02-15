package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import lk.cmb.ucsc.drivingschool.repo.QuizQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<QuizQuestion> listAll() {
        List<QuizQuestion> quizquestions = new ArrayList<>();
        quizquestionRepo.findAll().forEach(quizquestions::add);
        return quizquestions;
    }

    //delete question
    public void delete(String id){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestionRepo.delete(quizquestion);
    }

    public QuizQuestion saveOrUpdate(QuizQuestion quizquestion) {
        quizquestionRepo.save(quizquestion);
        return quizquestion;
    }
    /*
    //update question
    public QuizQuestion updateQuestion(String id, String question){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setCorrect(question);
        return quizquestionRepo.save(quizquestion);
    }

    public QuizQuestion updateCorrect(String id, String correct){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setCorrect(correct);
        return quizquestionRepo.save(quizquestion);
    }


    public QuizQuestion updateIncorrect1(String id, String incorrect1){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setIncorrect1(incorrect1);
        return quizquestionRepo.save(quizquestion);
    }

    public QuizQuestion updateIncorrect2(String id, String incorrect2){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setIncorrect2(incorrect2);
        return quizquestionRepo.save(quizquestion);
    }

    public QuizQuestion updateIncorrect3(String id, String incorrect3){
        QuizQuestion quizquestion=quizquestionRepo.findById(id);
        quizquestion.setIncorrect3(incorrect3);
        return quizquestionRepo.save(quizquestion);
    }


*/
}
