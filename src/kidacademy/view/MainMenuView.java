/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import kidacademy.KidAcademy;
import kidacademy.control.GameControl;
import kidacademy.control.QuestionControl;
import kidacademy.exceptions.MapControlException;

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
            + "\n4 - Save game"
            + "\n5 - High score menu"
            + "\n6 - Print study list"   
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": {
            try {
                //create and start a new game
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
            case "6": //get and show all questions
                this.saveStudyList();
                break;
            default: //get and start an existing game
                ErrorView.display("MainMenuView",
                                "*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(KidAcademy.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        //***test code*** temporarily adding in link to question view
//        QuestionView questionView = new QuestionView();
//        questionView.display();

        //***test code*** temporarily adding in link to building view
//        BuildingView buildingView = new BuildingView();
//        buildingView.display();

    }

    private void startExistingGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
//        // display the start existing game menu
//        startExistingGameMenuView startExisitingGameMenu = new startExistingGameMenuView();
//        startExisitingGameMenu.display();
    }

    private void displayHelpMenu() {   
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveStudyList() {   
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            QuestionControl.saveStudyList(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(KidAcademy.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

// display the saved games menu
//        SaveGameMenuView saveGameMenu = new SaveGameMenuView();
//        saveGameMenu.display();
    }

    private void displayHighScore() {
           // display the high score menu
        HighScoreMenuView highScoreMenu = new HighScoreMenuView();
        highScoreMenu.display();
    
    }
    
    
}
