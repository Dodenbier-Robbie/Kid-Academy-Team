/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import java.util.ArrayList;

/**
 *
 * @author rdodenbier
 */
public class HighScoreControl {
    
    public ArrayList<HighScore> addHighScores( ) {
        // create an ArrayList of high scores 
        ArrayList<HighScore> highScore = new ArrayList<>();

        // adding objects to the ArrayList
        highScore.add(new HighScore("Robbie", 500));
        highScore.add(new HighScore("Michael", 400));
        highScore.add(new HighScore("Andrew", 300));
        highScore.add(new HighScore("Rudy", 200));
        
        return highScore;
    }

    private static class HighScore {

        public HighScore() {
        }

        private HighScore(String playerName, int playerScore) {
        }
    }
}
