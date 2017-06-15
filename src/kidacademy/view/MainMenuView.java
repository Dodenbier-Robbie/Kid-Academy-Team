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
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Main Menu                             |"
            + "\n-----------------------------------------"
            + "\n1 - Go to school"
            + "\n2 - Continue a saved game"
            + "\n3 - Help menu"
            + "\n4 - Tutorial"
            + "\n5 - High score menu"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
        //QuestionView.displayQuestionMenuView();
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
