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
class TrigonometryClassRoomView {
    
    public TrigonometryClassRoomView() {
    System.out.println("\n"
            + "\n-----------------------------------------"
            + "\n |Trigonometry Class Room                   |"
            + "\n-----------------------------------------"
            + "\nPlease answer the following question"
            + "\nAnswer successfully for 35 points"
            + "\n-----------------------------------------");
    }

    void displayTrigonometryQuestion() {
        System.out.println("\n\nCProvide degrees in Fahrenheit (F)"
                + "and covert to Centigrade (C)");
        this.getInputs(0.0, 0.0);
    }
    
    private void getInputs(double degreeF, double calcDegreeC) {
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\nDegree F:");
            degreeF = keyboard.nextDouble();
            
            System.out.println("\nCalucated Degree C:"
                            + "\n(Round answer to two decimal places)");
            calcDegreeC = keyboard.nextDouble();
            
            break;
        }
        
        this.doAction(degreeF, calcDegreeC);
    }    

    private boolean doAction(double degreeF, double calcDegreeC) {
        //calculate distance between points
        MathControl newCalcDegree = new MathControl();
        double compareDegree = newCalcDegree.calcTempConversion(degreeF);
        
        //round results to two decimal places
        compareDegree = (Math.round(compareDegree * 100.0) / 100.0);
        
        //compare to determined if the user input was correct
        if(compareDegree  == calcDegreeC) {
            System.out.println("\nYou have answered the equation successfully"
                            + "\nYou have been awarded 35 points!!!");
            return false;
        }
        
        else {
            System.out.println("\nYour answer was incorrect. Try again!"
                            + "\nYour answer was: " + calcDegreeC
                            + "\nThe correct answer is: " + compareDegree);
            return true;
        }
    } 
    
}
