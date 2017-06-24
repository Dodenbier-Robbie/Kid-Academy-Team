/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import java.util.Random;
import kidacademy.model.Question;

/**
 *
 * @author Mann
 */
public class QuestionControl {

    public static Question getQuestion(String type) {
        Question question;
        
        Question[] questions = createQuestionList();
        Question[] validQuestions = new Question[2];
        int nextArrayIndex = 0;
        
        // Loop through and get questions for this subject
        for (int i = 0; i < questions.length; i++){
        
            if (questions[i].getSubject() == type) {
                validQuestions[nextArrayIndex] = questions[i];
                nextArrayIndex++;
            }
        
        }
        
        // Loop through validQuestions and choose one randomly
        Random r = new Random();
        int result = r.nextInt(nextArrayIndex);
        question = validQuestions[result];
        
        return question;
    }
    
    
    public static Question[] createQuestionList(){
    
        Question[] questions = new Question[4];
        
        Question calc1 = new Question();
        calc1.setQuestion("Assuming a right triangle, what does c equal if a = 3 and b = 4?");
        calc1.setAnswerCorrect(4);
        calc1.setAnswerPotential1("1");
        calc1.setAnswerPotential2("2");
        calc1.setAnswerPotential3("4");
        calc1.setAnswerPotential4("5");
        calc1.setSubject("calculus");
        questions[0] = calc1;

        Question calc2 = new Question();
        calc2.setQuestion("2");
        calc2.setAnswerCorrect(2);
        calc2.setAnswerPotential1("2");
        calc2.setAnswerPotential2("2");
        calc2.setAnswerPotential3("2");
        calc2.setAnswerPotential4("2");
        calc2.setSubject("calculus");
        questions[1] = calc2;
        
        Question calc3 = new Question();
        calc3.setQuestion("");
        calc3.setAnswerCorrect(0);
        calc3.setAnswerPotential1("");
        calc3.setAnswerPotential2("");
        calc3.setAnswerPotential3("");
        calc3.setAnswerPotential4("");
        calc3.setSubject("");
        questions[2] = calc3;
        
        Question calc4 = new Question();
        calc4.setQuestion("");
        calc4.setAnswerCorrect(0);
        calc4.setAnswerPotential1("");
        calc4.setAnswerPotential2("");
        calc4.setAnswerPotential3("");
        calc4.setAnswerPotential4("");
        calc4.setSubject("");
        questions[3] = calc4;

        return questions;
    }
  
}
