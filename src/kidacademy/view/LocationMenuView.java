/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import kidacademy.control.BuildingControl;
import kidacademy.model.Building;

/**
 *
 * @author rdodenbier
 */
public class LocationMenuView extends View {
    public String currentBuilding;
    public Building[] buildings = BuildingControl.createBuildingList();
    
    public LocationMenuView() {
                
        // Instead of using super, call a setMessage function on View
        
        this.setMessage(
                "\n"
                + "\n-------------------------------------------------------"
                + "\nWelcome to the Kid Academy."
                + "\nPlease select a building by choosing the corresponding number."
                + "\n-------------------------------------------------------"
                + "\n1 - " + buildings[0].getName() + " Building"
                + "\n2 - " + buildings[1].getName() + " Building"
                + "\n3 - " + buildings[2].getName() + " Building"
                + "\n4 - " + buildings[3].getName() + " Building"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------"
        );
        
//        super("\n"
//            + "\n-----------------------------------------"
//            + "\n |Location Menu                         |"
//            + "\n-----------------------------------------"
//            + "\n1 - Science building"
//            + "\n2 - English building"
//            + "\n3 - Math building"
//            + "\n4 - History building"
//            + "\n5 - Graduation Ceremony"
//            + "\nQ - Quit"
//            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //Redirect to building 1
                currentBuilding = buildings[0].getName();                
                this.displayBuildingView(currentBuilding);
                break;
            case "2": //Redirect to building 2
                currentBuilding = buildings[1].getName();
                this.displayBuildingView(currentBuilding);
                break;
            case "3": //Redirect to building 3
                currentBuilding = buildings[2].getName();
                this.displayBuildingView(currentBuilding);
                break;
            case "4": //Redirect to building 4
                currentBuilding = buildings[3].getName();
                this.displayBuildingView(currentBuilding);
                break;
//            case "5": //Redirect to Graduation Ceremony menu
//                this.displayGraduationCeremony();
//                break;                
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }    

    private void displayBuildingView(String building){
        
        BuildingView buildingView = new BuildingView(building);
        buildingView.display();
    }

// I commented all of this out so that we didnt have to hardcode it all. 
// It should all work so that we can just add to the data and it will find
// everythign and populate the data. This should be easier to manage. 

    
//    private void displayScienceBuilding() {
//        // display the Science Building menu
//        ScienceBuildingView scienceBuildingMenu = new ScienceBuildingView();
//        scienceBuildingMenu.display();
//    }
//
//    private void displayEnglishBuilding() {
//        // display the English Building menu
//        EnglishBuildingView englishBuildingMenu = new EnglishBuildingView();
//        englishBuildingMenu.display();
//    }
//
//    private void displayMathBuilding() {
//        // display the Math Building menu
//        MathBuildingView mathBuildingMenu = new MathBuildingView();
//        mathBuildingMenu.display();
//    }
//
//    private void displayHistoryBuilding() {
//        // display the History Building menu
//        HistoryBuildingView historyBuildingMenu = new HistoryBuildingView();
//        historyBuildingMenu.display();
//    }
//
//    private void displayGraduationCeremony() {
//        // display the Graduation Ceremony menu
//        GraduationCeremonyView graduationCeremonyMenu = new GraduationCeremonyView();
//        graduationCeremonyMenu.display();
//    }
}
