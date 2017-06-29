/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import kidacademy.model.Location;

/**
 *
 * @author rdodenbier
 */
class MapDisplayView {

    void displayMap() {
        Location coordinates = new Location();
        
        int row = coordinates.getRow();
        int column = coordinates.getColumn();
        
        System.out.println(row);
        
        System.out.println("\nKid Academy School Campus");
        System.out.println("\n1    2    3    4    5"
                           + "---------------------");
    }
}    
