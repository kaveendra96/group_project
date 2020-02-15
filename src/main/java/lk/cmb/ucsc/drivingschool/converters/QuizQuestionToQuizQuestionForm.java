package lk.cmb.ucsc.drivingschool.converters;

import lk.cmb.ucsc.drivingschool.commands.QuizQuestionForm;
import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class QuizQuestionToQuizQuestionForm {

    @Override
    public QuizQuestionForm convert(QuizQuestion quizquestion) {
        QuizQuestionForm quizquestionForm = new QuizQuestionForm();
        quizquestionForm.setId(quizquestion.getId().toHexString());
        quizquestionForm.setQuestion(quizquestion.getQuestion());
        quizquestionForm.setCorrect(quizquestion.getCorrect());
        quizquestionForm.setIncorrect1(quizquestion.getIncorrect1());
        quizquestionForm.setIncorrect2(quizquestion.getIncorrect2());
        quizquestionForm.setIncorrect3(quizquestion.getIncorrect3());

        return quizquestionForm;
    }
}
