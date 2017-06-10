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
        
        this.getInputs(0, 0, 0, 0, 0);
    }
    
    private void getInputs(double x1, double x2, double y1, double y2, double calcDistance) {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\nx1:");
            x1 = keyboard.nextDouble();
            
            System.out.println("\nx2:");
            x2 = keyboard.nextDouble();
            
            System.out.println("\ny1:");
            y1 = keyboard.nextDouble();
            
            System.out.println("\ny2");
            y2 = keyboard.nextDouble();
            
            System.out.println("\nCalucated Distance:"
                            + "\n(Round answer to two decimal places)");
            calcDistance = keyboard.nextDouble();
            
            if (x1 == 0) {
                System.out.println("\nInvalid value: x1 must not equal 0");
                continue;
            }
            
            if (x2 == 0)  {
                System.out.println("\nInvalid value: x2 must not equal 0");
                continue;
            }
            
            if (y1 == 0)  {
                System.out.println("\nInvalid value: y1 must not equal 0");
                continue;
            }
            
            if (y2 == 0)  {
                System.out.println("\nInvalid value: y2 must not equal 0");
                continue;
            }
            
            if (calcDistance == 0)  {
                System.out.println("\nInvalid value: Distance must not equal 0");
                continue;
            }
            
            break;
        }
        
        this.doAction(x1, x2, y1, y2, calcDistance);
    }
    
    private boolean doAction(double x1, double x2, double y1, double y2, double calcDistance) {
        
        //calculate distance between points
        MathControl newCalcDistance = new MathControl();
        double compareDistance = newCalcDistance.calcDistanceTwoPoints(x1, x2, y1, y2);
        
        //round results to two decimal places
        compareDistance = (Math.round(compareDistance * 100.0) / 100.0);
        
        //compare to determined if the user input was correct
        if(compareDistance  == calcDistance) {
            System.out.println("\nYou have answered the equation successfully"
                            + "\nYou have been awarded 35 points!!!");
            return false;
        }
        
        else {
            System.out.println("\nYour answer was incorrect. Try again!"
                            + "\nYour answer was: " + calcDistance
                            + "\nThe correct answer is: " + compareDistance);
            return true;
        }
    } 
}
