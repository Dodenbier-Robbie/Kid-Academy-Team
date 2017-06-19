/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;
/**
 * @author Mann
 * 
 * 1. Display to the player if their answer is right or wrong
 * 2. Tell the player their new score
 * 3. Ask if they want another question or to go to a different building
 * test
 */
public class AnswerView extends View {

    public AnswerView(){
        //set prompt message and save it
        //figure out how to display if question is right or wrong!!!
        super("\n"
            + "\n-----------------------------------------"
            + "\nYour answer is correct"
            + "\nYour score is 123456789"
            + "\n1 - Ask another question"
            + "\n2 - Go to a different location"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //ask another question
                this.displayQuestionView();
                break;
            case "2": //move to another location
                this.displayLocationView();
                break;
            default: //ask for another selection
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
        
    }

    private void displayQuestionView() {

        // Create AnswerView object
        QuestionView questionView = new QuestionView();        
        
        // Display the answer menu view
        questionView.display();
    }      

    private void displayLocationView() {

        // Create AnswerView object
        LocationMenuView locationView = new LocationMenuView();        
        
        // Display the answer menu view
        locationView.display();
    }    
    
}
