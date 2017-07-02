/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import kidacademy.model.Location;
import kidacademy.model.Map;

/**
 *
 * @author rdodenbier
 */
class MapDisplayView {

    void displayMap() {
        Map location = new Map();
        Location[][] mapLocation = location.getLocations();
        
        int noOfRows = 8;
        int noOfColumns = 8;
        
        
        System.out.println("\n        Kid Academy School Campus");
        System.out.println("\n  1    2    3    4    5    6    7    8");
        
        for (int i = 0; i < noOfRows; i++) {
            System.out.print("------------------------------------------" + "\n" + (i+1));
            
            for (int j = 0; j < noOfColumns; j++) {
                System.out.print("| ?? ");
            }
            
            System.out.println("|");
        }
        
        System.out.println("------------------------------------------");
    }
}    
