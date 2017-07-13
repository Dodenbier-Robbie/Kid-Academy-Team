/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.ArrayList;
import kidacademy.control.HighScoreControl;

/**
 *
 * @author Rudy Edit by Rudy
 */

    public class HighScoreMenuView extends View {
    
    public HighScoreMenuView () {
        super("\n-----------------------------------------"
                + "\n1 - Export High Scores to file"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
        
        HighScoreControl displayHighScores = new HighScoreControl();
        ArrayList<HighScoreControl.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        this.console.println("\n" 
                       + "\n-----------------------------------------"
                       + "\n |High Scores                 |"
                       + "\n-----------------------------------------");
        
        for (int i = 0; i < displayScores.size(); i++){
            this.console.println(i+1 + ": " + displayScores.get(i));
        }
}

        @Override
        public boolean doAction(String value) {
          value = value.toUpperCase(); //convert choice to upper case

          switch (value) {            
                case "1": //call high score report class
                this.displayHighScoreReportView();
                break;
              
              default: //get and start an existing game
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
          }

          return false;
    }    

    private void displayHighScoreReportView() {
        //display the Map
        HighScoreReportView displayHighScoreReport = new HighScoreReportView();
        displayHighScoreReport.displayHighScoreReport();
    }

}
