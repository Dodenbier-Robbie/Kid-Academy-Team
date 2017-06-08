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
class HistoryBuildingView {
    private String menu;
    
    public HistoryBuildingView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |History Building Menu                 |"
                + "\n-----------------------------------------"
                + "\n1 - American History"
                + "\n2 - Groups & Culture"
                + "\n3 - Presidents"
                + "\n4 - Time Periods & Eras"
                + "\n5 - Wars"
                + "\nF - Final Exam"
                + "\nQ - Quit";
    }
    void displayHistoryBuildingView() {

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
            case "1": //Redirect to American History Class Room
                this.displayAmericanHistoryClassRoom();
                break;
            case "2": //Redirect to Groups & Culture Class Room
                this.displayGroupsCultureClassRoom();
                break;
            case "3": //Redirect to Presidents Class Room
                this.displayPresidentsClassRoom();
                break;
            case "4": //Redirect to Time Periods & Eras Class Room
                this.displayTimePeriodsClassRoom();
                break;
            case "5": //Redirect to Wars Class Room
                this.displayWarsClassRoom();
                break; 
            case "F": //Redirect to History Final Exam Class Room
                this.displayHistoryFinalExamClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 

    private void displayAmericanHistoryClassRoom() {
        System.out.println("\n*** displayAmericanHistoryClassRoom() stub function called ***");
    }

    private void displayGroupsCultureClassRoom() {
        System.out.println("\n*** displayGroupsCultureClassRoom() stub function called ***");
    }

    private void displayPresidentsClassRoom() {
        System.out.println("\n*** displayPresidentsClassRoom() stub function called ***");
    }

    private void displayTimePeriodsClassRoom() {
        System.out.println("\n*** displayTimePeriodsClassRoom() stub function called ***");
    }

    private void displayWarsClassRoom() {
        System.out.println("\n*** displayWarsClassRoom() stub function called ***");
    }

    private void displayHistoryFinalExamClassRoom() {
        System.out.println("\n*** displayHistoryFinalExamClassRoom() stub function called ***");
    }
    
}
