/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;

import idealweight.control.BuildingControl;
import idealweight.model.Building;

/**
 *
 * @author Lizbeth
 */
public class LocationMenuView extends View {
    public String currentBuilding;
    public Building[] buildings = BuildingControl.createBuildingList();
    
    public LocationMenuView() {

        
        this.setMessage(
                "\n"
                + "\n-------------------------------------------------------"
                + "\nWelcome to the Ideal Weight Game."
                + "\nPlease select a category by choosing the corresponding number."
                + "\n-------------------------------------------------------"
                + "\n1 - " + buildings[0].getName() + " Category"
                + "\n2 - " + buildings[1].getName() + " Category"
                + "\n3 - " + buildings[2].getName() + " Category"
                + "\n4 - " + buildings[3].getName() + " Category"
                + "\nQ - Quit"
                + "\n-------------------------------------------------------"
        );

    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //Redirect to building 1
                currentBuilding = buildings[0].getName();                
                this.displayBuildingView(currentBuilding);
                break;
            case "2": //Redirect to building 2
                currentBuilding = buildings[1].getName();
                this.displayBuildingView(currentBuilding);
                break;
            case "3": //Redirect to building 3
                currentBuilding = buildings[2].getName();
                this.displayBuildingView(currentBuilding);
                break;
            case "4": //Redirect to building 4
                currentBuilding = buildings[3].getName();
                this.displayBuildingView(currentBuilding);
                break;               
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }    

    private void displayBuildingView(String building){
        
        BuildingView buildingView = new BuildingView(building);
        buildingView.display();
    }

}
