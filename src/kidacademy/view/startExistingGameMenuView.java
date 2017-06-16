/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

/**
 *
 * @author rdodenbier
 */
public class startExistingGameMenuView extends View {
    
    public startExistingGameMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n | Saved Games Menu                             |"
            + "\n-----------------------------------------"
            + "\n1 - Saved Game #1"
            + "\n2 - Saved Game #2"
            + "\n3 - Saved Game #3"
            + "\n4 - Saved Game #4"
            + "\n5 - Saved Game #5"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //create and start a new game
                this.retrieveGame1();
                break;
            case "2": //get and start an existing game
                this.retrieveGame2();
                break;
            case "3": //display the help menu
                this.retrieveGame3();
                break;
            case "4": // save the current game
                this.retrieveGame4();
                break;
            case "5": //get and show high score
                this.retrieveGame5();
                break;
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void retrieveGame1() {
        System.out.println("*** retrieveGame1 function called ***");
    }

    private void retrieveGame2() {
        System.out.println("*** retrieveGame2 function called ***");
    }

    private void retrieveGame3() {
        System.out.println("*** retrieveGame3 function called ***");
    }

    private void retrieveGame4() {
        System.out.println("*** retrieveGame4 function called ***");
    }

    private void retrieveGame5() {
        System.out.println("*** retrieveGame5 function called ***");
    }
}
