/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.io.PrintWriter;
import kidacademy.KidAcademy;

/**
 *
 * @author Mann
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = KidAcademy.getOutFile();
    private static final PrintWriter logFile = KidAcademy.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "---------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
    
}
