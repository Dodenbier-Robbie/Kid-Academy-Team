/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import kidacademy.model.Game;
import kidacademy.model.Player;
import kidacademy.view.StartProgramView;

/**
 *
 * @author aolse
 */
public class KidAcademy {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null; 
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        KidAcademy.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        KidAcademy.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        KidAcademy.inFile = inFile;
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
            //open charatcer stream files for end user input and output
            KidAcademy.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            KidAcademy.outFile = new PrintWriter(System.out, true);
        
            //open log file
            String filePath = "log.txt";
            KidAcademy.logFile = new PrintWriter(filePath);
            
            // create StartProgramView and start the program        
            StartProgramView startProgramView = new StartProgramView ();
            startProgramView.display();
            
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
        }
        finally{
            try {
                if (KidAcademy.inFile != null)
                    KidAcademy.inFile.close();
                
                if (KidAcademy.outFile != null)
                    KidAcademy.outFile.close();
                
                if (KidAcademy.logFile != null)
                    KidAcademy.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files");
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        KidAcademy.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        KidAcademy.player = player;
    }

}
