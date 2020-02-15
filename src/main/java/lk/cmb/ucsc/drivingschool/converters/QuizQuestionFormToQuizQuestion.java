package lk.cmb.ucsc.drivingschool.converters;

import lk.cmb.ucsc.drivingschool.commands.QuizQuestionForm;
import lk.cmb.ucsc.drivingschool.model.QuizQuestion;
import org.bson.types.ObjectId;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class QuizQuestionFormToQuizQuestion implements Converter<QuizQuestionForm, QuizQuestion> {

    @Override
    public QuizQuestion convert(QuizQuestionForm quizquestionForm) {
        QuizQuestion quizquestion = new QuizQuestion();
        if (quizquestionForm.getId() != null  && !StringUtils.isEmpty(quizquestionForm.getId())) {
            quizquestion.setId(new ObjectId(quizquestionForm.getId()));
        }
        quizquestion.setQuestion(quizquestionForm.getQuestion());
        quizquestion.setCorrect(quizquestionForm.getCorrect());
        quizquestion.setIncorrect1(quizquestionForm.getIncorrect1());
        quizquestion.setIncorrect2(quizquestionForm.getIncorrect2());
        quizquestion.setIncorrect3(quizquestionForm.getIncorrect3());
        return quizquestion;
    }
}
