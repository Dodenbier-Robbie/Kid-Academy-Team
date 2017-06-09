/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;

/**
 *
 * @author Mann
 */
class GameMenuView {
    private String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Game Menu                             |"
                + "\n-----------------------------------------"
                + "\n1 - View map"
                + "\n2 - Move location"
                + "\n3 - Help menu"
                + "\n4 - Save game"
                + "\nQ - Quit"
                + "\n-----------------------------------------";
    }
    void displayMenu() {
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
            case "1": //Redirect to view map menu
                this.displayMapMenu();
                break;
            case "2": //Redirect to location menu
                this.displayLocationMenu();
                break;
            case "3": //Redirect to help menu
                this.displayHelpMenu();
                break;
            case "4": //Redirect to save  menu
                this.displaySaveGameMenu();
                break;              
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 

    private void displayMapMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayLocationMenu() {
        // display the Science Building menu
        LocationMenuView locationMenuView = new LocationMenuView();
        locationMenuView.displayLocationMenuView();
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displaySaveGameMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
