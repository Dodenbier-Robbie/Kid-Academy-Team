/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;
import kidacademy.control.AnswerControl;

/**
 * @author Mann
 * 
 * 1. create a prompt message and save it
 * 2. Display the question and potential answers
 * 3. Display the prompt message
 * 4. Allow player to enter answer
 * 5. Send answer to answer validate function
 * 
 */

public class QuestionView extends View{
    
    public QuestionView(){
        super("\n"
                + "\n-------------------------------------------------------"
                + "\nSelect an answer by choosing the corresponding number. "                
                + "\n-------------------------------------------------------"
                + "\nWhat is 2+2?"
                + "\n1. 1"
                + "\n2. 2"
                + "\n3. 3"
                + "\n4. 4"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //set answer 1
                this.validateAnswer(1);
                break;
            case "2": //set answer 2
                this.validateAnswer(2);
                break;
            case "3": //set answer 3
                this.validateAnswer(3);
                break;
            case "4": //set answer 4
                this.validateAnswer(4);
                break;
            default: //invalid selection
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void validateAnswer(int answer) {
        //send off answer to be validated and stored
        AnswerControl.validateAnswer(answer);        

        //Display next view
        this.displayAnswerView();
    }
    private void displayAnswerView() {

        // Create AnswerView object
        AnswerView answerView = new AnswerView();        
        
        // Display the answer menu view
        answerView.display();
    }
      
}
