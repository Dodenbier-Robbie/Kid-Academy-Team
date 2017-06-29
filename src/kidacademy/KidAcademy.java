/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy;

import kidacademy.model.Game;
import kidacademy.model.Player;
import kidacademy.view.StartProgramView;

/**
 *
 * @author aolse
 */
public class KidAcademy {
    
    private static Game currentGame = null;
    private static Player player = null;
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView ();
        try {
            // create StartProgramView and start the program
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        KidAcademy.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        KidAcademy.player = player;
    }

}
