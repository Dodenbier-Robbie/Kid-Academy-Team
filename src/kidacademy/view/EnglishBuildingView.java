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
class EnglishBuildingView {
    private String menu;
    
    public EnglishBuildingView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |English Building Menu                 |"
                + "\n-----------------------------------------"
                + "\n1 - Comparatives"
                + "\n2 - Superlatives"
                + "\n3 - Adverbs"
                + "\n4 - Conjuctions"
                + "\n5 - Punctuation"
                + "\nF - Final Exam"
                + "\nQ - Quit122";
    }
    void displayEnglishBuildingView() {
 
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
            case "1": //Redirect to Comparatives Class Room
                this.displayComparativesClassRoom();
                break;
            case "2": //Redirect to Superlatives Class Room
                this.displaySuperlativesClassRoom();
                break;
            case "3": //Redirect to Adverbs Class Room
                this.displayAdverbsClassRoom();
                break;
            case "4": //Redirect to Conjuctions Class Room
                this.displayConjuctionsClassRoom();
                break;
            case "5": //Redirect to Punctuation Class Room
                this.displayPunctuationClassRoom();
                break; 
            case "F": //Redirect to English Final Exam Class Room
                this.displayEnglishFinalExamClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    } 

    private void displayComparativesClassRoom() {
        System.out.println("\n*** displayComparativesClassRoom() stub function called ***");
    }

    private void displaySuperlativesClassRoom() {
        System.out.println("\n*** displaySuperlativesClassRoom() stub function called ***");
    }

    private void displayAdverbsClassRoom() {
        System.out.println("\n*** displayAdverbsClassRoom() stub function called ***");
    }

    private void displayConjuctionsClassRoom() {
        System.out.println("\n*** displayConjuctionsClassRoom() stub function called ***");
    }

    private void displayPunctuationClassRoom() {
        System.out.println("\n*** displayPunctuationClassRoom() stub function called ***");
    }

    private void displayEnglishFinalExamClassRoom() {
        System.out.println("\n*** displayEnglishFinalExamClassRoom() stub function called ***");
    }
    
}
