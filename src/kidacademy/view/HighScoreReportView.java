/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.ArrayList;
import kidacademy.control.HighScoreControl;
import kidacademy.model.HighScore;

/**
 *
 * @author rdodenbier
 */
public class HighScoreReportView extends View {

    public HighScoreReportView() {
        // prompt for and get the file path to save the report
        super("\n\nEnter the file path where the report will be saved.");          
    }
    
    void displayHighScoreReport() { 
        
        HighScoreControl displayHighScores = new HighScoreControl();
        ArrayList<HighScoreControl.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        String filePath = this.getInput();
        
        this.console.println("\n\nYou entered " + filePath + " as your file directory ");
        
        try {
            // save the game to the specified file
            SaveReportView.saveHighScoreReport(displayHighScores.getHighScores(), filePath);
            
            this.console.println("Your file was successfully saved!");
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("Your file was successfully saved!");
        
        return true;
    }
    
}
