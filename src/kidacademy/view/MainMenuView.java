/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;
import kidacademy.KidAcademy;
import kidacademy.control.GameControl;

/**
 *
 * @author Mann
 */
public class MainMenuView {
    private String menu;
    
    public MainMenuView(){
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Main Menu                             |"
                + "\n-----------------------------------------"
                + "\n1 - Go to school"
                + "\n2 - Continue a saved game"
                + "\n3 - Help menu"
                + "\n4 - Tutorial"
                + "\n5 - High score menu"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    
    void displayMainMenuView() {
 
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
            case "1": //create and start a new game
                this.startNewGame();
                break;
            case "2": //get and start an existing game
                this.startExistingGame();
                break;
            case "3": //display the help menu
                this.displayHelpMenu();
                break;
            case "4": // save the current game
                this.saveGame();
                break;
            case "5": //get and show high score
                this.displayHighScore();
                break;
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(KidAcademy.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        //***test code*** temporarily adding in link to question view
        //QuestionView questionView = new QuestionView();
        //questionView.displayQuestionMenuView();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {   
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHighScore() {
        System.out.println("*** displayHighScore function called ***");
           // display the high score menu
        HighScoreMenuView highScoreMenu = new HighScoreMenuView();
        highScoreMenu.displayHighscoreMenuView();
    
    }
    
    
}
