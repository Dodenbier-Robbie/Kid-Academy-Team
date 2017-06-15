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
class GraduationCeremonyView extends View {
    
    public GraduationCeremonyView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Graduation Ceremony Menu              |"
            + "\n-----------------------------------------"
            + "\n1 - Continue to graduation"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //Redirect to Graduation Ceremony
                this.displayGraduationCeremony();
                break;                 
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayGraduationCeremony() {
        System.out.println("\n*** displayGraduationCeremony() stub function called ***");
    }
}
