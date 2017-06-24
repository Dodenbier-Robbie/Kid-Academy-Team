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
        private Integer answerCorrect;
        private String answerPotential1;
        private String answerPotential2;
        private String answerPotential3;
        private String answerPotential4;
        private String subject;
        private Double score;
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getAnswerCorrect() {
        return answerCorrect;
    }

    public void setAnswerCorrect(Integer answerCorrect) {
        this.answerCorrect = answerCorrect;
    }

    public String getAnswerPotential1() {
        return answerPotential1;
    }

    public void setAnswerPotential1(String answerPotential1) {
        this.answerPotential1 = answerPotential1;
    }

    public String getAnswerPotential2() {
        return answerPotential2;
    }
    
    public void setAnswerPotential2(String answerPotential2) {
        this.answerPotential2 = answerPotential2;
    }
    
    public String getAnswerPotential3() {
        return answerPotential3;
    }
    
    public void setAnswerPotential3(String answerPotential3) {
        this.answerPotential3 = answerPotential3;
    }
      
    public String getAnswerPotential4() {
        return answerPotential4;
    }
    
    public void setAnswerPotential4(String answerPotential4) {
        this.answerPotential4 = answerPotential4;
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
        int hash = 8;
        hash = 89 * hash + Objects.hashCode(this.question);
        hash = 89 * hash + Objects.hashCode(this.answerCorrect);
        hash = 89 * hash + Objects.hashCode(this.answerPotential1);
        hash = 89 * hash + Objects.hashCode(this.answerPotential2);
        hash = 89 * hash + Objects.hashCode(this.answerPotential3);
        hash = 89 * hash + Objects.hashCode(this.answerPotential4);
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
        if (!Objects.equals(this.answerPotential1, other.answerPotential1)) {
            return false;
        }
        if (!Objects.equals(this.answerPotential1, other.answerPotential2)) {
            return false;
        }
        if (!Objects.equals(this.answerPotential1, other.answerPotential3)) {
            return false;
        }
        if (!Objects.equals(this.answerPotential1, other.answerPotential4)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        return Objects.equals(this.score, other.score);
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answerCorrect=" + answerCorrect + ", answerPotential1=" + answerPotential1 + ", answerPotential2=" + answerPotential2 + ", answerPotential3=" + answerPotential3 + ", answerPotential4=" + answerPotential4 + ", subject=" + subject + ", score=" + score + '}';
    }

    public void setquestion(String this_is_a_math_question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setScore(String this_is_your_score) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
