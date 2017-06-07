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
class MathBuildingView {
    private String menu;
    
    public MathBuildingView() {
        this.menu = "\n"
                + "\n-----------------------------------------"
                + "\n |Math Building Menu                 |"
                + "\n-----------------------------------------"
                + "\n1 - Arithmetric"
                + "\n2 - Geometry"
                + "\n3 - Algebra"
                + "\n4 - Trigonometry"
                + "\n5 - Calculus"
                + "\nF - Final Exam"
                + "\nQ - Quit";
    }
    void displayMathBuildingView() {

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
            case "1": //Redirect to Arithmetric Class Room
                this.displayArithmetricClassRoom();
                break;
            case "2": //Redirect to Geometry Class Room
                this.displayGeometryClassRoom();
                break;
            case "3": //Redirect to Algebra Class Room
                this.displayAlgebraClassRoom();
                break;
            case "4": //Redirect to Trigonometry Class Room
                this.displayTrigonometryClassRoom();
                break;
            case "5": //Redirect to Calculus Class Room
                this.displayCalculusClassRoom();
                break; 
            case "F": //Redirect to Math Final Exam Class Room
                this.displayMathFinalExamClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;        
    }

    private void displayArithmetricClassRoom() {
        System.out.println("\n*** displayArithmetricClassRoom() stub function called ***");
    }

    private void displayGeometryClassRoom() {
        // Redirect to Geometry Class Room
        GeometryClassRoomView geometryClassRoom = new GeometryClassRoomView();
        geometryClassRoom.displayGeometryQuestion();
    }

    private void displayAlgebraClassRoom() {
        System.out.println("\n*** displayAlgebraClassRoom() stub function called ***");
    }

    private void displayTrigonometryClassRoom() {
        System.out.println("\n*** displayTrigonometryClassRoom() stub function called ***");
    }

    private void displayCalculusClassRoom() {
        System.out.println("\n*** displayCalculusClassRoom() stub function called ***");
    }

    private void displayMathFinalExamClassRoom() {
        System.out.println("\n*** displayMathFinalExamClassRoom() stub function called ***");
    }
    
}
