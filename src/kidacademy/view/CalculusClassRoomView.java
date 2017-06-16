/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;

/**
 *
 * @author Mann
 */
public class CalculusClassRoomView extends View{
        public CalculusClassRoomView(){
        super("\n"
                + "\n-----------------------------------------"
                + "\n |Calculus Class Room                   |"
                + "\n-----------------------------------------"
                + "\nPlease choose the correct answer, assuming this is a right triangle."
                + "\nIf side a = 3 and side b = 4, what does side c equal?"
                + "\n1. c = 3"
                + "\n2. c = 4"
                + "\n3. c = 5"
                + "\n4. c = 6"
                + "\n-----------------------------------------");
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

    private void validateAnswer(int i) {
        if(i  == 3) {
            System.out.println("\nYou have answered the question successfully."
                            + "\nYou have been awarded 35 points!!!");
            this.displayMathBuildingView();
        }

        else {
            System.out.println("\nYour answer was incorrect. Try again!");
            this.displayCalculusClassRoomView();
        }
    }

    private void displayMathBuildingView() {

        // Create AnswerView object
        MathBuildingView mathBuildingView = new MathBuildingView();        

        // Display the answer menu view
        mathBuildingView.display();
    }    

    private void displayCalculusClassRoomView() {

        // Create AnswerView object
        CalculusClassRoomView calculusClassRoomView = new CalculusClassRoomView();        

        // Display the answer menu view
        calculusClassRoomView.display();
    }  
}