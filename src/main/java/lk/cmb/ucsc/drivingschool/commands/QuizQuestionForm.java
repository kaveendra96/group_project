package lk.cmb.ucsc.drivingschool.commands;

public class QuizQuestionForm {

    private String id;
    private String question;
    private String correct;
    private String incorrect1;
    private String incorrect2;
    private String incorrect3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public String getIncorrect1() {
        return incorrect1;
    }

    public void setIncorrect1(String incorrect1) { this.incorrect1 = incorrect1; }

    public String getIncorrect2() {
        return incorrect2;
    }

    public void setIncorrect2(String incorrect2) { this.incorrect2 = incorrect2; }

    public String getIncorrect3() {
        return incorrect3;
    }

    public void setIncorrect3(String incorrect3) { this.incorrect3 = incorrect3; }


}
