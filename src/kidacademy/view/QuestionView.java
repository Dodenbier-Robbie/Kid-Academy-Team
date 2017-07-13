/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;
import kidacademy.KidAcademy;
import kidacademy.model.Question;
import kidacademy.control.QuestionControl;
import kidacademy.model.Player;

/**
 * @author Mann
 * 
 * 1. create a prompt message and save it
 * 2. Display the question and potential answers
 * 3. Display the prompt message
 * 4. Allow player to enter answer
 * 5. Send answer to answer validate function
 * 
 */

public class QuestionView extends View{
    public Question currentQuestion;
    public QuestionView(String classroom){
        
        // Instead of using super, call a setMessage function on View
        
        QuestionControl questionControl = new QuestionControl();
        currentQuestion = questionControl.getQuestion(classroom);
        
        this.setMessage(
                "\n"
                + "\n-------------------------------------------------------"
                + "\nSelect an answer by choosing the corresponding number. "                
                + "\n-------------------------------------------------------"
                + "\n" + currentQuestion.getQuestion()
                + "\n1 - " + currentQuestion.getAnswerPotential1()
                + "\n2 - " + currentQuestion.getAnswerPotential2()
                + "\n3 - " + currentQuestion.getAnswerPotential3()
                + "\n4 - " + currentQuestion.getAnswerPotential4()
                + "\nQ - Quit"
                + "\n-------------------------------------------------------"
        );
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //set answer 1
                this.validateAnswer(1);
                break;
            case "2": //set answer 2
                this.validateAnswer(2);
                break;
            case "3": //set answer 3
                this.validateAnswer(3);
                break;
            case "4": //set answer 4
                this.validateAnswer(4);
                break;
            default: //invalid selection
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void validateAnswer(int answer) {
        Integer answerCorrect = currentQuestion.getAnswerCorrect();
        if(answer == answerCorrect) {
            
            Player player = new Player();
            player = KidAcademy.getPlayer();
            
            String playerName = player.getName();
            int playerScore = player.getBestScore() + 35;
           
            this.console.println("\nYou have answered the question successfully."
                               + "\nYou have been awarded 35 points!!!");
            
            this.console.println("\nPlayer Name: " + playerName 
                               + "\nCurrent Score: " + playerScore);
            
            player.setBestScore(playerScore);
        }

        else {
            this.console.println("\nYour answer was incorrect. Try again!");

        }       
        this.displayLocationView();
    
    }

    private void displayLocationView() {

        // Create AnswerView object
        LocationMenuView locationView = new LocationMenuView();        

        // Display the answer menu view
        locationView.display();
    }    
    
}
