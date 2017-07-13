/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.view;
import kidacademy.control.BuildingControl;
import kidacademy.model.Building;

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

public class BuildingView extends View{
    public Building currentBuilding;
    public String currentClassroom;
    
    public BuildingView(String building){
        
        // Instead of using super, call a setMessage function on View

        //This view takes a building from a location and displays all classrooms within it
        //When the player selects a classroom it sends that classroom to the question view
        
        //fill in the "Math" with the room from the room view
        BuildingControl buildingControl = new BuildingControl();
        currentBuilding = buildingControl.getBuildingByName(building);
        
        this.setMessage(
                "\n"
                + "\n-------------------------------------------------------"
                + "\nWelcome to the " + currentBuilding.getName() + " building!"                                     
                + "\nPlease select a classroom by choosing the corresponding number. "                
                + "\n-------------------------------------------------------"
                + "\n1 - " + currentBuilding.getClassroom1()  + " Classroom"
                + "\n2 - " + currentBuilding.getClassroom2()  + " Classroom"
                + "\n3 - " + currentBuilding.getClassroom3()  + " Classroom"
                + "\n4 - " + currentBuilding.getClassroom4()  + " Classroom"
                + "\n5 - " + currentBuilding.getClassroom5()  + " Classroom"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------"
        );
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //set answer 1
                currentClassroom = currentBuilding.getClassroom1();
                this.displayQuestionView(currentClassroom);
                break;
            case "2": //set answer 2
                currentClassroom = currentBuilding.getClassroom2();
                this.displayQuestionView(currentClassroom);
                break;
            case "3": //set answer 3
                currentClassroom = currentBuilding.getClassroom3();
                this.displayQuestionView(currentClassroom);
                break;
            case "4": //set answer 4
                currentClassroom = currentBuilding.getClassroom4();
                this.displayQuestionView(currentClassroom);
                break;
            case "5": //set answer 5
                currentClassroom = currentBuilding.getClassroom5();
                this.displayQuestionView(currentClassroom);
                break;
            default: //invalid selection
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    //send the classroom to the question view based on what the player selects

    private void displayQuestionView(String classroom) {
       
        QuestionView questionView = new QuestionView(classroom);
        questionView.display();

    }    
    
}
