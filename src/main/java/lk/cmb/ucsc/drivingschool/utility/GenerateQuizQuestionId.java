package lk.cmb.ucsc.drivingschool.utility;


import lk.cmb.ucsc.drivingschool.repo.QuizQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateQuizQuestionId {
    @Autowired
    private QuizQuestionRepo quizquestionRepo;

    public String generateQuizquestionID(){
        String id=quizquestionRepo.findTopByOrderByIdDesc().getId();
        int idInt=Integer.parseInt(id);
        idInt=idInt+1;
        return idInt+"";
    }
}
