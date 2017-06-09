/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;

/**
 *
 * @author Rudy
 */
public class HighScoreMenuView {
    private String menu;
    
     public HighScoreMenuView () {
                this.menu = "\n"
                        + "\n--------------------------------------"
                        + "\n | High Score Menu                   |"
                        + "\n--------------------------------------"
                        + "\n1 - High Score Player #1 Score"
                        + "\n2 - High Score Player #2 Score"
                        + "\n3 - High Score Player #3 Score"
                        + "\n4 - High Score Player #4 Score"
                        + "\n5 - High Score Player #5 Score"
                        + "\nQ - Quit"
                        + "\n-----------------------------------------";
     }
             
     
            void displayHighscoreMenuView () {
                
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
            case "1": //Display High Score Player #1
                this.displayHighScore1();
                break;
            case "2": //Display High Score Player #2
                this.displayHighScore2();
                break;
            case "3": //Display High Score Player #3
                this.displayHighScore3();
                break;
            case "4": //Display High Score Player #4
                this.displayHighScore4();
                break;
            case "5": //Display High Score Player #5
                this.displayHighScore5();
                break;                
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }    

     private void displayHighScore1() {
        // display the High Score 1
        HighScoreMenuView HighScoreMenu = new HighscoreMenuView();
        highScoreMenu.displayHighScoreMenuView();
    }


}
