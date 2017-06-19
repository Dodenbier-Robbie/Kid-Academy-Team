/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;

/**
 *
 * @author rdodenbier
 */
public class LocationMenuView extends View {
    
    public LocationMenuView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Location Menu                         |"
            + "\n-----------------------------------------"
            + "\n1 - Science building"
            + "\n2 - English building"
            + "\n3 - Math building"
            + "\n4 - History building"
            + "\n5 - Graduation Ceremony"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //Redirect to Science Building menu
                this.displayScienceBuilding();
                break;
            case "2": //Redirect to English Building menu
                this.displayEnglishBuilding();
                break;
            case "3": //Redirect to Math Building menu
                this.displayMathBuilding();
                break;
            case "4": //Redirect to Math Building menu
                this.displayHistoryBuilding();
                break;
            case "5": //Redirect to Graduation Ceremony menu
                this.displayGraduationCeremony();
                break;                
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }    

    private void displayScienceBuilding() {
        // display the Science Building menu
        ScienceBuildingView scienceBuildingMenu = new ScienceBuildingView();
        scienceBuildingMenu.display();
    }

    private void displayEnglishBuilding() {
        // display the English Building menu
        EnglishBuildingView englishBuildingMenu = new EnglishBuildingView();
        englishBuildingMenu.display();
    }

    private void displayMathBuilding() {
        // display the Math Building menu
        MathBuildingView mathBuildingMenu = new MathBuildingView();
        mathBuildingMenu.display();
    }

    private void displayHistoryBuilding() {
        // display the History Building menu
        HistoryBuildingView historyBuildingMenu = new HistoryBuildingView();
        historyBuildingMenu.display();
    }

    private void displayGraduationCeremony() {
        // display the Graduation Ceremony menu
        GraduationCeremonyView graduationCeremonyMenu = new GraduationCeremonyView();
        graduationCeremonyMenu.display();
    }
}
