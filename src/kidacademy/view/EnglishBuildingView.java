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
class EnglishBuildingView extends View {
    
    public EnglishBuildingView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n |English Building Menu                 |"
            + "\n-----------------------------------------"
            + "\n1 - Comparatives"
            + "\n2 - Superlatives"
            + "\n3 - Adverbs"
            + "\n4 - Conjuctions"
            + "\n5 - Punctuation"
            + "\nF - Final Exam"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
