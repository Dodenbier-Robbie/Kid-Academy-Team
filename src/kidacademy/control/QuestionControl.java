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
        question2.setQuestion("How many straight edges does a cube have?");
        question2.setAnswerCorrect(4);
        question2.setAnswerPotential1("5");
        question2.setAnswerPotential2("9");
        question2.setAnswerPotential3("10");
        question2.setAnswerPotential4("12");
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
        question5.setQuestion("What would you use to measure an angle?");
        question5.setAnswerCorrect(2);
        question5.setAnswerPotential1("compass");
        question5.setAnswerPotential2("protractor");
        question5.setAnswerPotential3("slide rule");
        question5.setAnswerPotential4("abacoss");
        question5.setSubject("Geometry");
        questions[4] = question5;
        
        Question question6 = new Question();
        question6.setQuestion("What is a scalene triangle?");
        question6.setAnswerCorrect(4);
        question6.setAnswerPotential1("right triangle");
        question6.setAnswerPotential2("triagle with one equal side");
        question6.setAnswerPotential3("triagle with all equal sides");
        question6.setAnswerPotential4("triangle with no equal sides");
        question6.setSubject("Geometry");
        questions[5] = question6;

        Question question7 = new Question();
        question7.setQuestion("Solve for y in the equation: y + 9 = 14");
        question7.setAnswerCorrect(2);
        question7.setAnswerPotential1("7");
        question7.setAnswerPotential2("5");
        question7.setAnswerPotential3("3");
        question7.setAnswerPotential4("11");
        question7.setSubject("Algebra");
        questions[6] = question7;
        
        Question question8 = new Question();
        question8.setQuestion("What is the answer for x in this equation: 2x = 20");
        question8.setAnswerCorrect(2);
        question8.setAnswerPotential1("5");
        question8.setAnswerPotential2("10");
        question8.setAnswerPotential3("12");
        question8.setAnswerPotential4("8");
        question8.setSubject("Algebra");
        questions[7] = question8;
        
        Question question9 = new Question();
        question9.setQuestion("Given that tan(127°) = -1.327 and tan(143°) = -0.754, what is the value of tan(-143°)?");
        question9.setAnswerCorrect(4);
        question9.setAnswerPotential1("-1.327");
        question9.setAnswerPotential2("-0.754");
        question9.setAnswerPotential3("1.327");
        question9.setAnswerPotential4("0.754");
        question9.setSubject("Trigonometry");
        questions[8] = question9;
        
        Question question10 = new Question();
        question10.setQuestion("Given that sin(111°) = 0.934 and cos(111°) = -0.358, what is the value of cos(-111°)?");
        question10.setAnswerCorrect(1);
        question10.setAnswerPotential1("-0.934");
        question10.setAnswerPotential2("-0.358");
        question10.setAnswerPotential3("0.934");
        question10.setAnswerPotential4("0.358");
        question10.setSubject("Trigonometry");
        questions[9] = question10;
        
        //English questions
        
        Question question11 = new Question();
        question11.setQuestion("The blue car is ______ than the red car.");
        question11.setAnswerCorrect(3);
        question11.setAnswerPotential1("more fast");
        question11.setAnswerPotential2("more faster");
        question11.setAnswerPotential3("faster");
        question11.setAnswerPotential4("fast");
        question11.setSubject("Comparatives");
        questions[10] = question11;

        Question question12 = new Question();
        question12.setQuestion("This is the ______ movie I've ever seen.");
        question12.setAnswerCorrect(2);
        question12.setAnswerPotential1("more bore");
        question12.setAnswerPotential2("most boring");
        question12.setAnswerPotential3("boring");
        question12.setAnswerPotential4("boringest");
        question12.setSubject("Comparatives");
        questions[11] = question12;
        
        Question question13 = new Question();
        question13.setQuestion("Bob is ______ than Mike.");
        question13.setAnswerCorrect(2);
        question13.setAnswerPotential1("most knowledgeable");
        question13.setAnswerPotential2("more knowledgeable");
        question13.setAnswerPotential3("more knowledgeabler");
        question13.setAnswerPotential4("more knowledge");
        question13.setSubject("Superlatives");
        questions[12] = question13;
        
        Question question14 = new Question();
        question14.setQuestion("Albert Einstein was _______ than me.");
        question14.setAnswerCorrect(4);
        question14.setAnswerPotential1("intelligenter");
        question14.setAnswerPotential2("intelligent");
        question14.setAnswerPotential3("most intelligent");
        question14.setAnswerPotential4("more intelligent");
        question14.setSubject("Superlatives");
        questions[13] = question14;

        Question question15 = new Question();
        question15.setQuestion("I have been a fan of mystery stories since I was quite young.");
        question15.setAnswerCorrect(2);
        question15.setAnswerPotential1("Fan");
        question15.setAnswerPotential2("Quite");
        question15.setAnswerPotential3("Young");
        question15.setAnswerPotential4("Since");
        question15.setSubject("Adverbs");
        questions[14] = question15;
        
        Question question16 = new Question();
        question16.setQuestion("Some stories are incredibly exciting from start to finish.");
        question16.setAnswerCorrect(3);
        question16.setAnswerPotential1("Some");
        question16.setAnswerPotential2("Are");
        question16.setAnswerPotential3("Incredibly");
        question16.setAnswerPotential4("Exciting");
        question16.setSubject("Adverbs");
        questions[15] = question16;

        Question question17 = new Question();
        question17.setQuestion("Which of the following is correct?");
        question17.setAnswerCorrect(3);
        question17.setAnswerPotential1("Harvey is a good driver, moreover, he is a very friendly one.");
        question17.setAnswerPotential2("Harvey is a good driver. Moreover he is a very friendly one.");
        question17.setAnswerPotential3("Harvey is a good driver; moreover, he is a very friendly one.");
        question17.setAnswerPotential4("none of the above");
        question17.setSubject("Punctuation");
        questions[16] = question17;
        
        Question question18 = new Question();
        question18.setQuestion("I would go to bed now, ______ my homework is not done.");
        question18.setAnswerCorrect(3);
        question18.setAnswerPotential1("and");
        question18.setAnswerPotential2("or");
        question18.setAnswerPotential3("but");
        question18.setAnswerPotential4("none of the above");
        question18.setSubject("Conjuctions");
        questions[17] = question18;
        
        Question question19 = new Question();
        question19.setQuestion("Would you rather go swimming ______ to the movies?");
        question19.setAnswerCorrect(2);
        question19.setAnswerPotential1("and");
        question19.setAnswerPotential2("or");
        question19.setAnswerPotential3("but");
        question19.setAnswerPotential4("none of the above");
        question19.setSubject("Conjuctions");
        questions[18] = question19;
        
        Question question20 = new Question();
        question20.setQuestion("The ________ was a period of great achievements. It followed the ________ ________ and lasted from the 14th ________ until 1600.");
        question20.setAnswerCorrect(2);
        question20.setAnswerPotential1("Renaissance, Middle Ages, Century");
        question20.setAnswerPotential2("Renaissance, Middle Ages, century");
        question20.setAnswerPotential3("Renaissance, middle ages, century");
        question20.setAnswerPotential4("renaissance, middle ages, century");
        question20.setSubject("Punctuation");
        questions[19] = question20;
        
        //History questions
        
        Question question21 = new Question();
        question21.setQuestion("Who was the first US President?");
        question21.setAnswerCorrect(3);
        question21.setAnswerPotential1("Abraham Lincoln");
        question21.setAnswerPotential2("Benjamin Franklin");
        question21.setAnswerPotential3("George Washington");
        question21.setAnswerPotential4("John Adams");
        question21.setSubject("American History");
        questions[20] = question21;

        Question question22 = new Question();
        question22.setQuestion("Who won the Civil War?");
        question22.setAnswerCorrect(1);
        question22.setAnswerPotential1("North");
        question22.setAnswerPotential2("South");
        question22.setAnswerPotential3("Both");
        question22.setAnswerPotential4("Neither");
        question22.setSubject("American History");
        questions[21] = question22;
        
        Question question23 = new Question();
        question23.setQuestion("Which group is famous for traveling to California but lost many lives?");
        question23.setAnswerCorrect(2);
        question23.setAnswerPotential1("Mormon Pioneers");
        question23.setAnswerPotential2("Donner Party");
        question23.setAnswerPotential3("Spanish Missionaries");
        question23.setAnswerPotential4("James W. Marshall");
        question23.setSubject("Groups & Culture");
        questions[22] = question23;
        
        Question question24 = new Question();
        question24.setQuestion("Which one state succeeded from Mexico?");
        question24.setAnswerCorrect(4);
        question24.setAnswerPotential1("New Mexico");
        question24.setAnswerPotential2("California");
        question24.setAnswerPotential3("Arizona");
        question24.setAnswerPotential4("Texas");
        question24.setSubject("Groups & Culture");
        questions[23] = question24;

        Question question25 = new Question();
        question25.setQuestion("Which US president was shot and killed on November 22, 1963?");
        question25.setAnswerCorrect(2);
        question25.setAnswerPotential1("Lyndon B. Johnson");
        question25.setAnswerPotential2("John F. Kennedy");
        question25.setAnswerPotential3("Abraham Lincoln");
        question25.setAnswerPotential4("Ronald Reagan");
        question25.setSubject("Presidents");
        questions[24] = question25;
        
        Question question26 = new Question();
        question26.setQuestion("Which US president is considered the author of the Declaration of Independence?");
        question26.setAnswerCorrect(4);
        question26.setAnswerPotential1("James Madison");
        question26.setAnswerPotential2("John Adams");
        question26.setAnswerPotential3("George Washington");
        question26.setAnswerPotential4("Thomas Jefferson");
        question26.setSubject("Presidents");
        questions[25] = question26;

        Question question27 = new Question();
        question27.setQuestion("What year did England establish their first settlement in Jamestown?");
        question27.setAnswerCorrect(1);
        question27.setAnswerPotential1("1607");
        question27.setAnswerPotential2("1717");
        question27.setAnswerPotential3("1801");
        question27.setAnswerPotential4("1699");
        question27.setSubject("Time Periods & Eras");
        questions[26] = question27;
        
        Question question28 = new Question();
        question28.setQuestion("What year was the Louisiana Purchase?");
        question28.setAnswerCorrect(3);
        question28.setAnswerPotential1("1776");
        question28.setAnswerPotential2("1842");
        question28.setAnswerPotential3("1803");
        question28.setAnswerPotential4("1800");
        question28.setSubject("Time Periods & Eras");
        questions[27] = question28;
        
        Question question29 = new Question();
        question29.setQuestion("Where did the Creek War take place?");
        question29.setAnswerCorrect(3);
        question29.setAnswerPotential1("Canada");
        question29.setAnswerPotential2("Northern United States");
        question29.setAnswerPotential3("Southern United States");
        question29.setAnswerPotential4("Western United States");
        question29.setSubject("Wars");
        questions[28] = question29;
        
        Question question30 = new Question();
        question30.setQuestion("Military action was taken against which country during the Bay of Pigs Invasion?");
        question30.setAnswerCorrect(2);
        question30.setAnswerPotential1("Russia");
        question30.setAnswerPotential2("Cuba");
        question30.setAnswerPotential3("Panama");
        question30.setAnswerPotential4("Mexico");
        question30.setSubject("Wars");
        questions[29] = question30;
        
        //Science questions
        
        Question question31 = new Question();
        question31.setQuestion("Most chickens hatch at around 21 days.How long does it take for a duck to hatch?");
        question31.setAnswerCorrect(3);
        question31.setAnswerPotential1("22 days");
        question31.setAnswerPotential2("25-26 days");
        question31.setAnswerPotential3("28-32 days");
        question31.setAnswerPotential4("45 days");
        question31.setSubject("Animals");
        questions[30] = question31;

        Question question32 = new Question();
        question32.setQuestion("The scientific word for a cow is bovine.Whats the scientific word for a chicken?");
        question32.setAnswerCorrect(1);
        question32.setAnswerPotential1("Gallus");
        question32.setAnswerPotential2("Poultry");
        question32.setAnswerPotential3("Genouspolus");
        question32.setAnswerPotential4("Polusgenous");
        question32.setSubject("Animals");
        questions[31] = question32;
        
        Question question33 = new Question();
        question33.setQuestion("Put the planets in order from the sun");
        question33.setAnswerCorrect(3);
        question33.setAnswerPotential1("Mercury, Mars, Earth, Venus, Jupiter, Saturn, Uranus, Neptune, Pluto");
        question33.setAnswerPotential2("Mars, Mercury, Venus, Earth, Jupiter, Saturn, Uranus, Neptune, Pluto");
        question33.setAnswerPotential3("Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto");
        question33.setAnswerPotential4("Venus, Mercury, Mars, Earth, Jupiter, Saturn, Uranus, Neptune, Pluto");
        question33.setSubject("Astronomy");
        questions[32] = question33;
        
        Question question34 = new Question();
        question34.setQuestion("How many miles are in a light year?");
        question34.setAnswerCorrect(3);
        question34.setAnswerPotential1("Approx. 6 billion miles");
        question34.setAnswerPotential2("Approx. 9 billion miles");
        question34.setAnswerPotential3("Approx. 6 trillion miles");
        question34.setAnswerPotential4("Approx. 9 trillion miles");
        question34.setSubject("Astronomy");
        questions[33] = question34;

        Question question35 = new Question();
        question35.setQuestion("The largest organ of human body is?");
        question35.setAnswerCorrect(3);
        question35.setAnswerPotential1("Brain");
        question35.setAnswerPotential2("Heart");
        question35.setAnswerPotential3("Skin");
        question35.setAnswerPotential4("Liver");
        question35.setSubject("Biology");
        questions[34] = question35;
        
        Question question36 = new Question();
        question36.setQuestion("Carrot is orange in color because?");
        question36.setAnswerCorrect(3);
        question36.setAnswerPotential1("It grows in the soil");
        question36.setAnswerPotential2("It is not exposed to sunlight");
        question36.setAnswerPotential3("It contains carotene");
        question36.setAnswerPotential4("The entire plant is orange in color");
        question36.setSubject("Biology");
        questions[35] = question36;

        Question question37 = new Question();
        question37.setQuestion("The symbol Sb stands for stibnum or stibnite. What is the modern name of this element?");
        question37.setAnswerCorrect(2);
        question37.setAnswerPotential1("Arsenic");
        question37.setAnswerPotential2("Antimony");
        question37.setAnswerPotential3("Tin");
        question37.setAnswerPotential4("Samarium");
        question37.setSubject("Chemistry");
        questions[36] = question37;
        
        Question question38 = new Question();
        question38.setQuestion("Noble gases are inert because they have completed outer electron shells. Which of these elements isn't a noble gas?");
        question38.setAnswerCorrect(4);
        question38.setAnswerPotential1("Helium");
        question38.setAnswerPotential2("Argon");
        question38.setAnswerPotential3("Krypton");
        question38.setAnswerPotential4("Chlorine");
        question38.setSubject("Chemistry");
        questions[37] = question38;
        
        Question question39 = new Question();
        question39.setQuestion("How many horns did Triceratops have?");
        question39.setAnswerCorrect(3);
        question39.setAnswerPotential1("1");
        question39.setAnswerPotential2("2");
        question39.setAnswerPotential3("3");
        question39.setAnswerPotential4("4");
        question39.setSubject("Dinosaurs");
        questions[38] = question39;
        
        Question question40 = new Question();
        question40.setQuestion("Apatosaurus is also widely known by what other name?");
        question40.setAnswerCorrect(2);
        question40.setAnswerPotential1("Spinosaurus");
        question40.setAnswerPotential2("Brontosaurus");
        question40.setAnswerPotential3("Velociraptor");
        question40.setAnswerPotential4("Stegosaurus");
        question40.setSubject("Dinosaurs");
        questions[39] = question40;
        
        return questions;
    }
  
}
