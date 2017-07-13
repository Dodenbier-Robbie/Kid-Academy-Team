/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kidacademy.control;

import kidacademy.model.Building;

/**
 *
 * @author Mann
 */
public class BuildingControl {

    public static Building getBuildingByName(String name) {
//        try {
            Building building;

            Building[] buildings = createBuildingList();
            Building[] validBuilding = new Building[1];

            // Loop through and get questions for this subject
            for (int i = 0; i < buildings.length; i++){

                if (buildings[i].getName() == name) {
                    validBuilding[0] = buildings[i];
                }
            }

            building = validBuilding[0];

//            error handling
//            if (question == null){
//                throw new QuestionControlException("Question not found.");
//            }

            return building;
            
//        } 
//        catch(QuestionControlException qce){
//            return null;
//        }
    }    
    
 public static Building[] createBuildingList(){

        Building[] buildings = new Building[4];
        
        Building building1 = new Building();
        building1.setName("English");
        building1.setDescription("This building has English classrooms in it.");
        building1.setClassroom1("Comparatives");
        building1.setClassroom2("Superlatives");
        building1.setClassroom3("Adverbs");
        building1.setClassroom4("Conjuctions");
        building1.setClassroom5("Punctuation");
        buildings[0] = building1;
        
        Building building2 = new Building();
        building2.setName("History");
        building2.setDescription("This building has History classrooms in it.");
        building2.setClassroom1("American History");
        building2.setClassroom2("Groups & Culture");
        building2.setClassroom3("Presidents");
        building2.setClassroom4("Time Periods & Eras");
        building2.setClassroom5("Wars");
        buildings[1] = building2;
        
        Building building3 = new Building();
        building3.setName("Math");
        building3.setDescription("This building has Math classrooms in it.");
        building3.setClassroom1("Arithmetic");
        building3.setClassroom2("Geometry");
        building3.setClassroom3("Algebra");
        building3.setClassroom4("Trigonometry");
        building3.setClassroom5("Calculus");
        buildings[2] = building3;
        
        Building building4 = new Building();
        building4.setName("Science");
        building4.setDescription("This building has Science classrooms in it.");
        building4.setClassroom1("Animals");
        building4.setClassroom2("Astronomy");
        building4.setClassroom3("Biology");
        building4.setClassroom4("Chemistry");
        building4.setClassroom5("Dinosaurs");
        buildings[3] = building4;

        return buildings;
    }   
}
