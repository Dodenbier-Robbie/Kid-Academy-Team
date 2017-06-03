/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;

/**
 *
 * @author Mann
 */
public class HelpMenuView {
  private String menu;
    
    public HelpMenuView(){
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Help Menu                             |"
                + "\n-----------------------------------------"
                + "\n1 - What is the objective of the game?"
                + "\n2 - How do I play the game?"
                + "\n3 - Where can I provide feedback?"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }  
    
    void displayHelpMenuView() {
 
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
               // + "\n1 - What is the objective of the game?"
               //+ "\n2 - How do I play the game?"
               //+ "\n3 - Where can I provide feedback?"
    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
            case "1": //display objective of the game
                this.displayObjective();
                break;
            case "2": //display rules of the game
                this.displayRules();
                break;
            case "3": //display the feedback address
                this.displayFeedback();
                break;
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayObjective() {
        System.out.println("*** displayObjective function called ***");
    }

    private void displayRules() {
        System.out.println("*** displayRules function called ***");
    }

    private void displayFeedback() {
        System.out.println("*** displayFeedback function called ***");
    }
}
