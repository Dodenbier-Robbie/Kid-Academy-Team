/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;
import kidacademy.control.GameControl;
import kidacademy.model.Player;

/**
 *
 * @author rdodenbier
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        //promptMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your name: ";
        //diplay the banner when view is created
        
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(    
        "\n*************************************************"
        +"\n                                               *"
        +"\n This is the game of                           *"
        +"\n************************************************"
        );
    }
    
    /**
    * displays the start program view
    */
    public void displayStartProgramView() {
        
        boolean done = false; //set the flag to done
        do { 
            //prompt for and get playersName
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
            //do the request action and display the new view
            done = this.doAction(playersName);
            
        } while (!done);
       
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\n" + this.promptMessage); 
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing breaks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: name cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "This name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if(player == null) { // if unsuccessful
            System.out.println("\nError creating player");
            return false;
        }
        
        //display new view
        this.displayNextView(player);
        
        return true; //
    }

    private void displayNextView(Player player) {
        System.out.println("\n*** displayNextView() called ***");
    }
}
