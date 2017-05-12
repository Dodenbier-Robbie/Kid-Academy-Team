/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy;

import kidacademy.model.Actor;
import kidacademy.model.Game;
import kidacademy.model.Location;
import kidacademy.model.RegularSceneType;

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
        
        //Location Class Testing
        
        Location locationOne = new Location();
        
        locationOne.setCompleted(true);
        locationOne.setCoordinates("1,1");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
        
        // RegularSceneType Class Testing
        
        RegularSceneType rstOne = new RegularSceneType();
        
        rstOne.setLocation("12");
        rstOne.setSubject("Science");
        rstOne.setType("Location");
        rstOne.setName("Biology Room");
        rstOne.setDescription("This is Biology Room 12. In here you will be "
                + "asked questions about life sciences.");
        
        String rstInfo = rstOne.toString();
        System.out.println(rstInfo);
        
    }
    
}
