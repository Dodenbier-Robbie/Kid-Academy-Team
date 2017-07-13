/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import kidacademy.exceptions.QuestionControlException;
import kidacademy.model.Question;

/**
 *
 * @author Mann
 */
public class QuestionControl {

    public static Question getQuestion(String type) {
        try {
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

            //error handling
            if (question == null){
                throw new QuestionControlException("Question not found.");
            }

            return question;
            
        } catch(QuestionControlException qce){
            return null;
        }
    } 
   
    public static void saveStudyList(String filePath) throws QuestionControlException {
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            Question[] questionList = createQuestionList();
            
            output.writeObject(questionList); //write the game object out to file
        }
        catch(Exception e) {
            throw new QuestionControlException(e.getMessage());
        }
        
    }
    
    public static Question[] createQuestionList(){
    
        Question[] questions = new Question[40];

        //Math Questions
        
        Question question1 = new Question();
        question1.setQuestion("Assuming a right triangle, what does c equal if a = 3 and b = 4?");
        question1.setAnswerCorrect(4);
        question1.setAnswerPotential1("1");
        question1.setAnswerPotential2("2");
        question1.setAnswerPotential3("4");
        question1.setAnswerPotential4("5");
        question1.setSubject("Calculus");
        questions[0] = question1;

        Question question2 = new Question();
        question2.setQuestion("2");
        question2.setAnswerCorrect(2);
        question2.setAnswerPotential1("2");
        question2.setAnswerPotential2("2");
        question2.setAnswerPotential3("2");
        question2.setAnswerPotential4("2");
        question2.setSubject("Calculus");
        questions[1] = question2;
        
        Question question3 = new Question();
        question3.setQuestion("What is 1+1?");
        question3.setAnswerCorrect(3);
        question3.setAnswerPotential1("1");
        question3.setAnswerPotential2("12");
        question3.setAnswerPotential3("2");
        question3.setAnswerPotential4("4785309");
        question3.setSubject("Arithmetic");
        questions[2] = question3;
        
        Question question4 = new Question();
        question4.setQuestion("What is 5 x 10?");
        question4.setAnswerCorrect(4);
        question4.setAnswerPotential1("34");
        question4.setAnswerPotential2("68");
        question4.setAnswerPotential3("75");
        question4.setAnswerPotential4("50");
        question4.setSubject("Arithmetic");
        questions[3] = question4;

        Question question5 = new Question();
        question5.setQuestion("geo1");
        question5.setAnswerCorrect(1);
        question5.setAnswerPotential1("1");
        question5.setAnswerPotential2("1");
        question5.setAnswerPotential3("1");
        question5.setAnswerPotential4("1");
        question5.setSubject("Geometry");
        questions[4] = question5;
        
        Question question6 = new Question();
        question6.setQuestion("geo2");
        question6.setAnswerCorrect(1);
        question6.setAnswerPotential1("2");
        question6.setAnswerPotential2("2");
        question6.setAnswerPotential3("2");
        question6.setAnswerPotential4("2");
        question6.setSubject("Geometry");
        questions[5] = question6;

        Question question7 = new Question();
        question7.setQuestion("alg1");
        question7.setAnswerCorrect(1);
        question7.setAnswerPotential1("1");
        question7.setAnswerPotential2("1");
        question7.setAnswerPotential3("1");
        question7.setAnswerPotential4("1");
        question7.setSubject("Algebra");
        questions[6] = question7;
        
        Question question8 = new Question();
        question8.setQuestion("alg2");
        question8.setAnswerCorrect(1);
        question8.setAnswerPotential1("2");
        question8.setAnswerPotential2("2");
        question8.setAnswerPotential3("2");
        question8.setAnswerPotential4("2");
        question8.setSubject("Algebra");
        questions[7] = question8;
        
        Question question9 = new Question();
        question9.setQuestion("tri1");
        question9.setAnswerCorrect(1);
        question9.setAnswerPotential1("1");
        question9.setAnswerPotential2("1");
        question9.setAnswerPotential3("1");
        question9.setAnswerPotential4("1");
        question9.setSubject("Trigonometry");
        questions[8] = question9;
        
        Question question10 = new Question();
        question10.setQuestion("tri2");
        question10.setAnswerCorrect(1);
        question10.setAnswerPotential1("2");
        question10.setAnswerPotential2("2");
        question10.setAnswerPotential3("2");
        question10.setAnswerPotential4("2");
        question10.setSubject("Trigonometry");
        questions[9] = question10;
        
        //English questions
        
        Question question11 = new Question();
        question11.setQuestion("comp1");
        question11.setAnswerCorrect(1);
        question11.setAnswerPotential1("1");
        question11.setAnswerPotential2("1");
        question11.setAnswerPotential3("1");
        question11.setAnswerPotential4("1");
        question11.setSubject("Comparatives");
        questions[10] = question11;

        Question question12 = new Question();
        question12.setQuestion("comp2");
        question12.setAnswerCorrect(1);
        question12.setAnswerPotential1("2");
        question12.setAnswerPotential2("2");
        question12.setAnswerPotential3("2");
        question12.setAnswerPotential4("2");
        question12.setSubject("Comparatives");
        questions[11] = question12;
        
        Question question13 = new Question();
        question13.setQuestion("sup1");
        question13.setAnswerCorrect(1);
        question13.setAnswerPotential1("1");
        question13.setAnswerPotential2("1");
        question13.setAnswerPotential3("1");
        question13.setAnswerPotential4("1");
        question13.setSubject("Superlatives");
        questions[12] = question13;
        
        Question question14 = new Question();
        question14.setQuestion("sup2");
        question14.setAnswerCorrect(1);
        question14.setAnswerPotential1("2");
        question14.setAnswerPotential2("2");
        question14.setAnswerPotential3("2");
        question14.setAnswerPotential4("2");
        question14.setSubject("Superlatives");
        questions[13] = question14;

        Question question15 = new Question();
        question15.setQuestion("adv1");
        question15.setAnswerCorrect(1);
        question15.setAnswerPotential1("1");
        question15.setAnswerPotential2("1");
        question15.setAnswerPotential3("1");
        question15.setAnswerPotential4("1");
        question15.setSubject("Adverbs");
        questions[14] = question15;
        
        Question question16 = new Question();
        question16.setQuestion("adv2");
        question16.setAnswerCorrect(1);
        question16.setAnswerPotential1("2");
        question16.setAnswerPotential2("2");
        question16.setAnswerPotential3("2");
        question16.setAnswerPotential4("2");
        question16.setSubject("Adverbs");
        questions[15] = question16;

        Question question17 = new Question();
        question17.setQuestion("con1");
        question17.setAnswerCorrect(1);
        question17.setAnswerPotential1("1");
        question17.setAnswerPotential2("1");
        question17.setAnswerPotential3("1");
        question17.setAnswerPotential4("1");
        question17.setSubject("Conjuctions");
        questions[16] = question17;
        
        Question question18 = new Question();
        question18.setQuestion("con2");
        question18.setAnswerCorrect(1);
        question18.setAnswerPotential1("2");
        question18.setAnswerPotential2("2");
        question18.setAnswerPotential3("2");
        question18.setAnswerPotential4("2");
        question18.setSubject("Conjuctions");
        questions[17] = question18;
        
        Question question19 = new Question();
        question19.setQuestion("pun1");
        question19.setAnswerCorrect(1);
        question19.setAnswerPotential1("1");
        question19.setAnswerPotential2("1");
        question19.setAnswerPotential3("1");
        question19.setAnswerPotential4("1");
        question19.setSubject("Punctuation");
        questions[18] = question19;
        
        Question question20 = new Question();
        question20.setQuestion("pun2");
        question20.setAnswerCorrect(1);
        question20.setAnswerPotential1("2");
        question20.setAnswerPotential2("2");
        question20.setAnswerPotential3("2");
        question20.setAnswerPotential4("2");
        question20.setSubject("Punctuation");
        questions[19] = question20;
        
        //History questions
        
        Question question21 = new Question();
        question21.setQuestion("amh1");
        question21.setAnswerCorrect(1);
        question21.setAnswerPotential1("1");
        question21.setAnswerPotential2("1");
        question21.setAnswerPotential3("1");
        question21.setAnswerPotential4("1");
        question21.setSubject("American History");
        questions[20] = question21;

        Question question22 = new Question();
        question22.setQuestion("amh2");
        question22.setAnswerCorrect(1);
        question22.setAnswerPotential1("2");
        question22.setAnswerPotential2("2");
        question22.setAnswerPotential3("2");
        question22.setAnswerPotential4("2");
        question22.setSubject("American History");
        questions[21] = question22;
        
        Question question23 = new Question();
        question23.setQuestion("grp1");
        question23.setAnswerCorrect(1);
        question23.setAnswerPotential1("1");
        question23.setAnswerPotential2("1");
        question23.setAnswerPotential3("1");
        question23.setAnswerPotential4("1");
        question23.setSubject("Groups & Culture");
        questions[22] = question23;
        
        Question question24 = new Question();
        question24.setQuestion("grp2");
        question24.setAnswerCorrect(1);
        question24.setAnswerPotential1("2");
        question24.setAnswerPotential2("2");
        question24.setAnswerPotential3("2");
        question24.setAnswerPotential4("2");
        question24.setSubject("Groups & Culture");
        questions[23] = question24;

        Question question25 = new Question();
        question25.setQuestion("pre1");
        question25.setAnswerCorrect(1);
        question25.setAnswerPotential1("1");
        question25.setAnswerPotential2("1");
        question25.setAnswerPotential3("1");
        question25.setAnswerPotential4("1");
        question25.setSubject("Presidents");
        questions[24] = question25;
        
        Question question26 = new Question();
        question26.setQuestion("pre2");
        question26.setAnswerCorrect(1);
        question26.setAnswerPotential1("2");
        question26.setAnswerPotential2("2");
        question26.setAnswerPotential3("2");
        question26.setAnswerPotential4("2");
        question26.setSubject("Presidents");
        questions[25] = question26;

        Question question27 = new Question();
        question27.setQuestion("era1");
        question27.setAnswerCorrect(1);
        question27.setAnswerPotential1("1");
        question27.setAnswerPotential2("1");
        question27.setAnswerPotential3("1");
        question27.setAnswerPotential4("1");
        question27.setSubject("Time Periods & Eras");
        questions[26] = question27;
        
        Question question28 = new Question();
        question28.setQuestion("era2");
        question28.setAnswerCorrect(1);
        question28.setAnswerPotential1("2");
        question28.setAnswerPotential2("2");
        question28.setAnswerPotential3("2");
        question28.setAnswerPotential4("2");
        question28.setSubject("Time Periods & Eras");
        questions[27] = question28;
        
        Question question29 = new Question();
        question29.setQuestion("war1");
        question29.setAnswerCorrect(1);
        question29.setAnswerPotential1("1");
        question29.setAnswerPotential2("1");
        question29.setAnswerPotential3("1");
        question29.setAnswerPotential4("1");
        question29.setSubject("Wars");
        questions[28] = question29;
        
        Question question30 = new Question();
        question30.setQuestion("war2");
        question30.setAnswerCorrect(1);
        question30.setAnswerPotential1("2");
        question30.setAnswerPotential2("2");
        question30.setAnswerPotential3("2");
        question30.setAnswerPotential4("2");
        question30.setSubject("Wars");
        questions[29] = question30;
        
        //Science questions
        
        Question question31 = new Question();
        question31.setQuestion("ani1");
        question31.setAnswerCorrect(1);
        question31.setAnswerPotential1("1");
        question31.setAnswerPotential2("1");
        question31.setAnswerPotential3("1");
        question31.setAnswerPotential4("1");
        question31.setSubject("Animals");
        questions[30] = question31;

        Question question32 = new Question();
        question32.setQuestion("ani2");
        question32.setAnswerCorrect(1);
        question32.setAnswerPotential1("2");
        question32.setAnswerPotential2("2");
        question32.setAnswerPotential3("2");
        question32.setAnswerPotential4("2");
        question32.setSubject("Animals");
        questions[31] = question32;
        
        Question question33 = new Question();
        question33.setQuestion("ast1");
        question33.setAnswerCorrect(1);
        question33.setAnswerPotential1("1");
        question33.setAnswerPotential2("1");
        question33.setAnswerPotential3("1");
        question33.setAnswerPotential4("1");
        question33.setSubject("Astronomy");
        questions[32] = question33;
        
        Question question34 = new Question();
        question34.setQuestion("ast2");
        question34.setAnswerCorrect(1);
        question34.setAnswerPotential1("2");
        question34.setAnswerPotential2("2");
        question34.setAnswerPotential3("2");
        question34.setAnswerPotential4("2");
        question34.setSubject("Astronomy");
        questions[33] = question34;

        Question question35 = new Question();
        question35.setQuestion("bio1");
        question35.setAnswerCorrect(1);
        question35.setAnswerPotential1("1");
        question35.setAnswerPotential2("1");
        question35.setAnswerPotential3("1");
        question35.setAnswerPotential4("1");
        question35.setSubject("Biology");
        questions[34] = question35;
        
        Question question36 = new Question();
        question36.setQuestion("bio2");
        question36.setAnswerCorrect(1);
        question36.setAnswerPotential1("2");
        question36.setAnswerPotential2("2");
        question36.setAnswerPotential3("2");
        question36.setAnswerPotential4("2");
        question36.setSubject("Biology");
        questions[35] = question36;

        Question question37 = new Question();
        question37.setQuestion("che1");
        question37.setAnswerCorrect(1);
        question37.setAnswerPotential1("1");
        question37.setAnswerPotential2("1");
        question37.setAnswerPotential3("1");
        question37.setAnswerPotential4("1");
        question37.setSubject("Chemistry");
        questions[36] = question37;
        
        Question question38 = new Question();
        question38.setQuestion("che2");
        question38.setAnswerCorrect(1);
        question38.setAnswerPotential1("2");
        question38.setAnswerPotential2("2");
        question38.setAnswerPotential3("2");
        question38.setAnswerPotential4("2");
        question38.setSubject("Chemistry");
        questions[37] = question38;
        
        Question question39 = new Question();
        question39.setQuestion("din1");
        question39.setAnswerCorrect(1);
        question39.setAnswerPotential1("1");
        question39.setAnswerPotential2("1");
        question39.setAnswerPotential3("1");
        question39.setAnswerPotential4("1");
        question39.setSubject("Dinosaurs");
        questions[38] = question39;
        
        Question question40 = new Question();
        question40.setQuestion("din2");
        question40.setAnswerCorrect(1);
        question40.setAnswerPotential1("2");
        question40.setAnswerPotential2("2");
        question40.setAnswerPotential3("2");
        question40.setAnswerPotential4("2");
        question40.setSubject("Dinosaurs");
        questions[39] = question40;
        
        return questions;
    }
  
}
