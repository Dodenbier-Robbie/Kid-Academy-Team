/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Rudy_The_GEEK
 */
public class Question implements Serializable{
    
    // Class instance variables
    private String question;
    private String answerCorrect;
    private String answerPotential;
    private String subject;
    private Double score;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(String answerCorrect) {
        this.answerCorrect = answerCorrect;
    }

    public String getAnswerPotential() {
        return answerPotential;
    }

    public void setAnswerPotential(String answerPotential) {
        this.answerPotential = answerPotential;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Question() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.question);
        hash = 89 * hash + Objects.hashCode(this.answerCorrect);
        hash = 89 * hash + Objects.hashCode(this.answerPotential);
        hash = 89 * hash + Objects.hashCode(this.subject);
        hash = 89 * hash + Objects.hashCode(this.score);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answerCorrect, other.answerCorrect)) {
            return false;
        }
        if (!Objects.equals(this.answerPotential, other.answerPotential)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return Objects.equals(this.score, other.score);
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answerCorrect=" + answerCorrect + ", answerPotential=" + answerPotential + ", subject=" + subject + ", score=" + score + '}';
    }

    public void setquestion(String this_is_a_math_question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setScore(String this_is_your_score) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
}
