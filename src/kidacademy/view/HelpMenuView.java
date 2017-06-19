/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;

/**
 *
 * @author Mann Edit by Rudy
 */
public class HelpMenuView extends View {
      
    public HelpMenuView(){
        super("\n"
                + "\n-----------------------------------------"
                + "\n |Help Menu                             |"
                + "\n-----------------------------------------"
                + "\n1 - What is the objective of the game?"
                + "\n2 - How do I play the game?"
                + "\n3 - Where can I provide feedback?"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
    }     
        
    
   
        @Override
        public boolean doAction(String value) {
        value = value.toUpperCase(); // convert to choice upper case
        
        switch (value) {
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
            // display the Objective
        System.out.println("*** displayObjective function called ***");
    }

    private void displayRules() {
        System.out.println("*** displayRules function called ***");
    }

    private void displayFeedback() {
        System.out.println("*** displayFeedback function called ***");
    }
}
