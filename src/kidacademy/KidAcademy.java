/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy;

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
    }
    
}
