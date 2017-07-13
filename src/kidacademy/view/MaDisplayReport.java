/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.ArrayList;

/**
 *
 * @author Rudy
 */
public class MaDisplayReport extends View {

    public MaDisplayReport() {
        // prompt for and get the file path to save the report
        super("\n\nEnter the file path where the report will be saved.");          
    }

    void displayMapReport() { 
        
        MapControl displayMap = new MapControl();
        ArrayList <MapControl.Map>displayMap;
        displayMap = null;
        displayMap = displayMap.getMap();
        
        String filePath = this.getInput();
        
        this.console.println("\n\nYou entered " + filePath + " as your file directory ");
        
        try {
            // save the game to the specified file
            SaveReportView.saveMapReport(displayMap.getMap(), filePath);
            
            this.console.println("Your file was successfully saved!");
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("Your file was successfully saved!");
        
        return true;
    }
    
}
