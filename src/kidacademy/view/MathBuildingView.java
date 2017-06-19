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
class MathBuildingView extends View {
    
    public MathBuildingView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Math Building Menu                    |"
            + "\n-----------------------------------------"
            + "\n1 - Arithmetric"
            + "\n2 - Geometry"
            + "\n3 - Algebra"
            + "\n4 - Trigonometry"
            + "\n5 - Calculus"
            + "\nF - Final Exam"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //Redirect to Arithmetric Class Room
                this.displayArithmetricClassRoom();
                break;
            case "2": //Redirect to Geometry Class Room
                this.displayGeometryClassRoom();
                break;
            case "3": //Redirect to Algebra Class Room
                this.displayAlgebraClassRoom();
                break;
            case "4": //Redirect to Trigonometry Class Room
                this.displayTrigonometryClassRoom();
                break;
            case "5": //Redirect to Calculus Class Room
                this.displayCalculusClassRoom();
                break; 
            case "F": //Redirect to Math Final Exam Class Room
                this.displayMathFinalExamClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;        
    }

    private void displayArithmetricClassRoom() {
        System.out.println("\n*** displayArithmetricClassRoom() stub function called ***");
    }

    private void displayGeometryClassRoom() {
        // Redirect to Geometry Class Room
        GeometryClassRoomView geometryClassRoom = new GeometryClassRoomView();
        geometryClassRoom.displayGeometryQuestion();
    }

    private void displayAlgebraClassRoom() {
        System.out.println("\n*** displayAlgebraClassRoom() stub function called ***");
    }

    private void displayTrigonometryClassRoom() {
        // Redirect to Trigonometry Class Room
        TrigonometryClassRoomView trigonometryClassRoom = new TrigonometryClassRoomView();
        trigonometryClassRoom.displayTrigonometryQuestion();
    }

    private void displayCalculusClassRoom() {
        
        // Create AnswerView object
        CalculusClassRoomView calculusView = new CalculusClassRoomView();        

        // Display the answer menu view
        calculusView.display();
    }

    private void displayMathFinalExamClassRoom() {
        System.out.println("\n*** displayMathFinalExamClassRoom() stub function called ***");
    }
    
}
