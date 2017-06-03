/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import kidacademy.KidAcademy;
import kidacademy.model.Player;

/**
 *
 * @author rdodenbier
 */
public class GameControl {

    public static Player createPlayer(String playersName) {

        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        
        KidAcademy.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** crateNewGame stub function called ***");
    }

}
