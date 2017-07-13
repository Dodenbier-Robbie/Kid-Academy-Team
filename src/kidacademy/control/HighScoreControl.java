/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import java.util.ArrayList;
import java.util.Objects;
import kidacademy.KidAcademy;
import kidacademy.model.Player;

/**
 *
 * @author rdodenbier
 */
public class HighScoreControl {
    
    public ArrayList<HighScore> getHighScores() {
        Player player = new Player();
        player = KidAcademy.getPlayer();
            
        String playerName = player.getName();
        int playerScore = player.getBestScore();
        // create an ArrayList of high scores 
        ArrayList<HighScore> highScore = new ArrayList<>();

        // adding objects to the ArrayList
        highScore.add(new HighScore(playerName, playerScore));
        highScore.add(new HighScore("Michael", 400));
        highScore.add(new HighScore("Andrew", 300));
        highScore.add(new HighScore("RudyR", 200));
        highScore.add(new HighScore("Peter", 100));
        highScore.add(new HighScore("Camden", 50));
        
        return highScore;
    }

    public static class HighScore {

    private String playerName;
    private int playerScore;

    
    public HighScore(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.playerName);
        hash = 89 * hash + Objects.hashCode(this.playerScore);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HighScore other = (HighScore) obj;
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        if (!Objects.equals(this.playerScore, other.playerScore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return (playerName + "\t\t\t" + playerScore);
    }
}}
