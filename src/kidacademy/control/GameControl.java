/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import kidacademy.KidAcademy;
import kidacademy.model.Game;
import kidacademy.model.Map;
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
        
        Game game = new Game();
        KidAcademy.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    public static void assignsScenesToLocations(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
