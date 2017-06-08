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
public class LocationMenuView {
    private String menu;
    
    public LocationMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Location Menu                         |"
                + "\n-----------------------------------------"
                + "\n1 - Science building"
                + "\n2 - English building"
                + "\n3 - Math building"
                + "\n4 - History building"
                + "\n5 - Graduation Ceremony"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    void displayLocationMenuView() {
 
        boolean done = false; // set flag to not done
        do {
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
                return; // exit the game
                
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String choice = ""; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\n" + this.menu); 
            
            choice = keyboard.nextLine(); //get next line typed on keyboard
            choice = choice.trim(); // trim off leading and trailing breaks
            
            if (choice.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return choice; //return the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
        scienceBuildingMenu.displayScienceBuildingView();
    }

    private void displayEnglishBuilding() {
        // display the English Building menu
        EnglishBuildingView englishBuildingMenu = new EnglishBuildingView();
        englishBuildingMenu.displayEnglishBuildingView();
    }

    private void displayMathBuilding() {
        // display the Math Building menu
        MathBuildingView mathBuildingMenu = new MathBuildingView();
        mathBuildingMenu.displayMathBuildingView();
    }

    private void displayHistoryBuilding() {
        // display the History Building menu
        HistoryBuildingView historyBuildingMenu = new HistoryBuildingView();
        historyBuildingMenu.displayHistoryBuildingView();
    }

    private void displayGraduationCeremony() {
        // display the Graduation Ceremony menu
        GraduationCeremonyView graduationCeremonyMenu = new GraduationCeremonyView();
        graduationCeremonyMenu.displayGraduationCeremonyView();
    }
}
