/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

import java.util.ArrayList;
import java.util.Scanner;
import kidacademy.control.HighScoreControl;
import kidacademy.model.HighScore;

/**
 *
 * @author Rudy Edit by Rudy
 */

    public class HighScoreMenuView extends View {
    
    public HighScoreMenuView () {
                super("\n"
                        + "\n--------------------------------------"
                        + "\n | High Score Menu                   |"
                        + "\n--------------------------------------"
                        + "\n1 - High Score Player #1 Score"
                        + "\n2 - High Score Player #2 Score"
                        + "\n3 - High Score Player #3 Score"
                        + "\n4 - High Score Player #4 Score"
                        + "\n5 - High Score Player #5 Score"
                        + "\nQ - Quit"
                        + "\n-----------------------------------------");
        
        HighScoreControl displayHighScores = new HighScoreControl();
        ArrayList<HighScoreControl.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        System.out.println(displayScores.get(0));
}

          
        @Override
        public boolean doAction(String value) {
          value = value.toUpperCase(); //convert choice to upper case

          switch (value) {
              case "1": //Display High Score Player #1
                  this.displayHighScore1();
                  break;
              case "2": //Display High Score Player #2
                  this.displayHighScore2();
                  break;
              case "3": //Display High Score Player #3
                  this.displayHighScore3();
                  break;
              case "4": //Display High Score Player #4
                  this.displayHighScore4();
                  break;
              case "5": //Display High Score Player #5
                  this.displayHighScore5();
                  break;                
              default: //get and start an existing game
                  System.out.println("\n*** Invalid Selection *** Try Again");
                  break;
          }

          return false;
    }    

     private void displayHighScore1() {
        System.out.println("*** displayHighScore1 function called ***");
     }

    private void displayHighScore2() {
        System.out.println("*** displayHighScore2 function called ***");
   }
    

    private void displayHighScore3() {
        System.out.println("*** displayHighScore3 function called ***");
   }
    

    private void displayHighScore4() {
        System.out.println("*** displayHighScore4 function called ***");
   }
    

    private void displayHighScore5() {
        System.out.println("*** displayHighScore5 function called ***");
   }    


}
