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
public class ScienceBuildingView {
    private String menu;
    
    public ScienceBuildingView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Science Building Menu                 |"
                + "\n-----------------------------------------"
                + "\n1 - Animals"
                + "\n2 - Astronomy"
                + "\n3 - Biology"
                + "\n4 - Chemistry"
                + "\n5 - Dinosaurs"
                + "\nF - Final Exam"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    void displayScienceBuildingView() {
        
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
            case "1": //Redirect to Animal Class Room
                this.displayAnimalClassRoom();
                break;
            case "2": //Redirect to Astronomy Class Room
                this.displayAstronomyClassRoom();
                break;
            case "3": //Redirect to Biology Class Room
                this.displayBiologyClassRoom();
                break;
            case "4": //Redirect to Chemistry Class Room
                this.displayChemistryClassRoom();
                break;
            case "5": //Redirect to Dinosaurs Class Room
                this.displayDinosaursClassRoom();
                break; 
            case "F": //Redirect to Science Final Exam Class Room
                this.displayScienceFinalExamClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 

    private void displayAnimalClassRoom() {
        System.out.println("\n*** displayAnimalClassRoom() stub function called ***");
    }

    private void displayAstronomyClassRoom() {
        System.out.println("\n*** displayAstronomyClassRoom() stub function called ***");
    }

    private void displayBiologyClassRoom() {
        System.out.println("\n*** displayBiologyClassRoom() stub function called ***");
    }

    private void displayChemistryClassRoom() {
        System.out.println("\n*** displayChemistryClassRoom() stub function called ***");
    }

    private void displayDinosaursClassRoom() {
        System.out.println("\n*** displayDinosaursClassRoom() stub function called ***");
    }

    private void displayScienceFinalExamClassRoom() {
        System.out.println("\n*** displayScienceFinalExamClassRoom() stub function called ***");
    }
}
