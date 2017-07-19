/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;

import idealweight.model.Building;

/**
 *
 * @author Lizbeth
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


            return building;

    }    
    
 public static Building[] createBuildingList(){

        Building[] buildings = new Building[4];
        
        Building building1 = new Building();
        building1.setName("Vegetables");
        building1.setDescription("Vegetables are classified into:");
        building1.setKitchen1("Tubers");
        building1.setKitchen2("Of fruit");
        building1.setKitchen3("At root");
        buildings[0] = building1;
        
        Building building2 = new Building();
        building2.setName("Proteins");
        building2.setDescription("Proteins are classified into:");
        building2.setKitchen1("Animal origin proteins");
        building2.setKitchen2("vegetable origin proteins");
        buildings[1] = building2;
        
        Building building3 = new Building();
        building3.setName("Fruits");
        building3.setDescription("Fruits are classified into:");
        building3.setKitchen1("Acid fruits");
        building3.setKitchen2("Sweet fruits");
        building3.setKitchen3("Neutral fruits");
        buildings[2] = building3;
        
        Building building4 = new Building();
        building4.setName("Cereals");
        building4.setDescription("Cereals are classified into:");
        building4.setKitchen1("Wheat");
        building4.setKitchen2("Rice");
        building4.setKitchen3("Barley");
        buildings[3] = building4;

        return buildings;
    }   
}
