/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;


/**
 * @author Mann
 * 
 * 1. Display to the player if their answer is right or wrong
 * 2. Tell the player their new score
 * 3. Ask if they want another question or to go to a different building
 * test
 */
public class AnswerView {
     //create prompt message
    private final String promptAnswer = "CoRrEcT";
    private final String promptScore = "123456789";
    private final String menu;    
    
    public AnswerView(){
        //set prompt message and save it
        //figure out how to display if question is right or wrong!!!
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\nYour answer is " + this.promptAnswer
                + "\nYour score is " + this.promptScore
                + "\n1 - Ask another question"
                + "\n2 - Go to a different location"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    
 void displayAnswerMenuView() {
 
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
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "1": //ask another question
                this.displayQuestionView();
                break;
            case "2": //move to another location
                this.displayLocationView();
                break;
            default: //ask for another selection
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
        
    }

    private void displayQuestionView() {

        // Create AnswerView object
        QuestionView questionView = new QuestionView();        
        
        // Display the answer menu view
        questionView.displayQuestionMenuView();
    }      

    private void displayLocationView() {

        // Create AnswerView object
        LocationMenuView locationView = new LocationMenuView();        
        
        // Display the answer menu view
        locationView.displayLocationMenuView();
    }    
    
}
