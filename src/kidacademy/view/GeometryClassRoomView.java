/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.Scanner;
import kidacademy.control.MathControl;

/**
 *
 * @author rdodenbier
 */
class GeometryClassRoomView {
    
    public GeometryClassRoomView() {
        System.out.println("\n"
                + "\n-----------------------------------------"
                + "\n |Geometry Class Room                   |"
                + "\n-----------------------------------------"
                + "\nPlease answer the following question"
                + "\nAnswer successfully for 35 points"
                + "\n-----------------------------------------");
    }
    void displayGeometryQuestion() {
        System.out.println("\n\nCalculate the distance between two points."
                + "\nEnter a value for each of the required inputs as well"
                + "\nas your calculated answer");
    }
    
    private double getX1Input() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double x1 = 0.0; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\nx1: "); 
            
            x1 = keyboard.nextDouble(); //get next line typed on keyboard
            
            if (x1 == 0) { //value is blank
                System.out.println("\nInvalid value: x1 must not equal 0");
                continue;
            }
            
            break; //end the loop
        }
        
        return x1; //return the value entered
    }
    
    private double getX2Input() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double x2 = 0.0; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\nx1: "); 
            
            x2 = keyboard.nextDouble(); //get next line typed on keyboard
            
            if (x2 == 0) { //value is blank
                System.out.println("\nInvalid value: x2 must not equal 0");
                continue;
            }
            
            break; //end the loop
        }
        
        return x2; //return the value entered
    }
        
    private double getY1Input() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double y1 = 0.0; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\nx1: "); 
            
            y1 = keyboard.nextDouble(); //get next line typed on keyboard
            
            if (y1 == 0) { //value is blank
                System.out.println("\nInvalid value: y1 must not equal 0");
                continue;
            }
            
            break; //end the loop
        }
        
        return y1; //return the value entered
    }
    
    private double getY2Input() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double y2 = 0.0; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\nx1: "); 
            
            y2 = keyboard.nextDouble(); //get next line typed on keyboard
            
            if (y2 == 0) { //value is blank
                System.out.println("\nInvalid value: y2 must not equal 0");
                continue;
            }
            
            break; //end the loop
        }
        
        return y2; //return the value entered
    }
    
    private double getCalcDistanceInput() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        double calcDistance = 0.0; //value to be returned
        boolean valid = false; //initalize to not valid
        
        while (!valid) { //loop while and invalid value is enter
            System.out.println("\nx1: "); 
            
            calcDistance = keyboard.nextDouble(); //get next line typed on keyboard
            
            if (calcDistance == 0) { //value is blank
                System.out.println("\nInvalid value: Distance must not equal 0");
                continue;
            }
            
            break; //end the loop
        }
        
        return calcDistance; //return the value entered
    }

    private boolean doAction () {
        double x1 = this.getX1Input();
        double x2 = this.getX2Input();
        double y1 = this.getY1Input();
        double y2 = this.getY2Input();
        double calcDistance = this.getCalcDistanceInput();
        
        //calculate distance between points
        MathControl newCalcDistance = new MathControl();
        double compareDistance = newCalcDistance.calcDistanceTwoPoints(x1, x2, y1, y2);
        
        //compare to determined if the user input was correct
        if(compareDistance == calcDistance) {
            System.out.println("\nYou have answered the equation successfully");
        }
        
        else {
            System.out.println("\nYour answer was incorrect. Try again!");
        }
       
        return false;
    }
    
}
