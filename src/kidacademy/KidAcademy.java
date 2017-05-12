/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy;

import kidacademy.model.Actor;
import kidacademy.model.Game;

/**
 *
 * @author aolse
 */
public class KidAcademy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        gameOne.setTotalTime(19.99);
        String totalTime = gameOne.toString();
        System.out.println(totalTime);
        
        // Actor Class Testing
        Actor actorOne = new Actor();
        
        actorOne.setName("Robbie Dodenbier");
        actorOne.setDescription("Welcome to the Kid Academy Game!");
        actorOne.setCoordinates("10|10");
        actorOne.setCurrentScore(10);
        actorOne.setPlayer("Billy");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
    }
    
}
