/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;
import java.util.Scanner;
import kidacademy.control.AnswerControl;
import kidacademy.model.Question;

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

public class QuestionView {
     //create prompt messages and fill them in with info from the question model - somehow!!!
    private final String promptQuestion = "What is 2+2?";
    private final String promptAnswer1 = "1";
    private final String promptAnswer2 = "2";
    private final String promptAnswer3 = "3";
    private final String promptAnswer4 = "4";
    private final String menu;    
    
    public QuestionView(){
        this.menu = "\n"
                + "\n-------------------------------------------------------"
                + "\nSelect an answer by choosing the corresponding number. "                
                + "\n-------------------------------------------------------"
                + "\n" + this.promptQuestion
                + "\n1. " + this.promptAnswer1
                + "\n1. " + this.promptAnswer2
                + "\n1. " + this.promptAnswer3
                + "\n1. " + this.promptAnswer4
                + "\nQ - Quit"
                + "\n-------------------------------------------------------";
    }
    
 void displayQuestionMenuView() {
 
            boolean done = false; // set flag to not done
            do {
                //prompt for and get players name
                String menuOption = this.getMenuOption();
                if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                    return; // exit the game
                
                // do the requested action and display the next view
                done = this.doAction(menuOption);
            
            } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String choice = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\n" + this.menu); 
            
            choice = keyboard.nextLine(); //get next line typed on keyboard
            choice = choice.trim(); // trim off leading and trailing breaks
            
            if (choice.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return choice; //return the value entered
    }

    private boolean doAction(String choice) {
        //sort answer and send for storage
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void validateAnswer(int answer) {
        //send off answer to be validated and stored
        AnswerControl.validateAnswer(answer);        

        //Display next view
        this.displayAnswerView();
    }
    private void displayAnswerView() {

        // Create AnswerView object
        AnswerView answerView = new AnswerView();        
        
        // Display the answer menu view
        answerView.displayAnswerMenuView();
    }
      
}
