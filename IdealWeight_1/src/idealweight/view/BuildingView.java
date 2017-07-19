/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;
import idealweight.control.BuildingControl;
import idealweight.model.Building;

/**
 * @author Lizbeth 
 */

public class BuildingView extends View{
    public Building currentBuilding;
    public String currentClassroom;
    
    public BuildingView(String building){
        
        BuildingControl buildingControl = new BuildingControl();
        currentBuilding = buildingControl.getBuildingByName(building);
        
        this.setMessage(
                "\n"
                + "\n-------------------------------------------------------"
                + "\nWelcome to the " + currentBuilding.getName() + " building!"                                     
                + "\nPlease select a kitchen. "                
                + "\n-------------------------------------------------------"
                + "\n1 - " + currentBuilding.getKitchen1()  + " kitchen"
                + "\n2 - " + currentBuilding.getKitchen2()  + " kitchen"
                + "\n3 - " + currentBuilding.getKitchen3()  + " kitchen"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------"
        );
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //set answer 1
                currentClassroom = currentBuilding.getKitchen1();
                this.displayQuestionView(currentClassroom);
                break;
            case "2": //set answer 2
                currentClassroom = currentBuilding.getKitchen2();
                this.displayQuestionView(currentClassroom);
                break;
            case "3": //set answer 3
                currentClassroom = currentBuilding.getKitchen3();
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
