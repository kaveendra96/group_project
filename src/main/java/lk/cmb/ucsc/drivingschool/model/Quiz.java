package lk.cmb.ucsc.drivingschool.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Arrays;



@Document  // demo document is there in the database
public class Quiz {
    @Id
    private String id;
    private String question;
    private String correct;
    private String incorrect1;
    private String incorrect2;
    private String incorrect3;

    public Quiz() {
        this.id = id;
        this.question = question;
        this.correct = correct;
        this.incorrect1 = incorrect1;
        this.incorrect2 = incorrect2;
        this.incorrect3 = incorrect3;
    }

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

    public void setIncorrect1(String incorrect1) {
        this.incorrect1 = incorrect1;
    }

    public String getIncorrect2() {
        return incorrect2;
    }

    public void setIncorrect2(String incorrect2) {
        this.incorrect2 = incorrect2;
    }

    public String getIncorrect3() { return incorrect3; }

    public void setIncorrect3(String incorrect3) {
        this.incorrect3 = incorrect3;
    }

    public String[] QuizQuestion(String id){
        String[] QuizQuestionArr={id,question,correct,incorrect1,incorrect2,incorrect3};
        return QuizQuestionArr;
    }

    /* -----might need later------

    public void displayQuizQuestionType1(int id) {
        //correct answer is a)
        System.out.println("id"+question + "\n"+"a)"+correct+"\n"+"b)"+incorrect1+"\n"+"c)"+incorrect2+"\n"+"d)"+incorrect3+"\n");
    }

    public void displayQuizQuestionType2(int id) {
        //correct answer is b)
        System.out.println("id"+question + "\n"+"a)"+incorrect1+"\n"+"b)"+correct+"\n"+"c)"+incorrect2+"\n"+"d)"+incorrect3+"\n");
    }

    public void displayQuizQuestionType3(int id) {
        //correct answer is c)
        System.out.println("id"+question + "\n"+"a)"+incorrect1+"\n"+"b)"+incorrect2+"\n"+"c)"+correct+"\n"+"d)"+incorrect3+"\n");
    }

    public void displayQuizQuestionType4(int id) {
        //correct answer is d)
        System.out.println("id"+question + "\n"+"a)"+incorrect1+"\n"+"b)"+incorrect2+"\n"+"c)"+incorrect3+"\n"+"d)"+correct+"\n");
    }
    */




}
