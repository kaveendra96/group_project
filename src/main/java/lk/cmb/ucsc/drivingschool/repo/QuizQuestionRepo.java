package lk.cmb.ucsc.drivingschool.repo;

import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizQuestionRepo extends MongoRepository<QuizQuestion,Long> {
    public QuizQuestion findById(String id);
    public QuizQuestion findTopByOrderByIdDesc();
}
