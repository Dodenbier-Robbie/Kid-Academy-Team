/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.io.PrintWriter;
import java.util.ArrayList;
import kidacademy.control.HighScoreControl;
import kidacademy.exceptions.HighScoreControlException;

/**
 *
 * @author rdodenbier
 */
public class SaveReportView {

    public static void saveHighScoreReport(ArrayList<HighScoreControl.HighScore> highScores, String filePath) 
            throws HighScoreControlException{
        
        try(PrintWriter out = new PrintWriter(filePath)) {
            
            // print title and column headings
            out.println("\n\n           High Scores               ");
            out.printf("%n%-20s%10s", "Player Name", "Player Score");
            out.printf("%n%-20s%10s", "-----------", "------------");
            
            //print the player names and scores
            for (int i = 0; i < highScores.size(); i++){
                out.printf("%n%-20s",highScores.get(i));
            }
        }
        catch(Exception e) {
            throw new HighScoreControlException(e.getMessage()); 
        }
    }
    
}
