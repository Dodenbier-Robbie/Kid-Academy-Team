/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kidacademy.KidAcademy;
import kidacademy.exceptions.GameControlException;
import kidacademy.exceptions.MapControlException;
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

    public static void createNewGame(Player player) throws MapControlException {
        
        Game game = new Game();
        KidAcademy.setCurrentGame(game);
        
        game.setPlayer(player);
        
        //Map map = MapControl.createMap();
        //game.setMap(map);
        
        //MapControl.moveActorsToStartingLocation(map);
    }

    public static void assignsScenesToLocations(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game game, String filePath) 
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        KidAcademy.setCurrentGame(game);// save in KidAcademy
        
    }

    public void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
