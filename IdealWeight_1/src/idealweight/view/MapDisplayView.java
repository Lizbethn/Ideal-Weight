/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;

import idealweight.model.Location;
import idealweight.model.Map;

/**
 *
 * @author Lizbeth
 */
class MapDisplayView {

    void displayMap() {
        Map location = new Map();
        Location[][] mapLocation = location.getLocations();
        
        int noOfRows = 8;
        int noOfColumns = 8;
        
        
        System.out.println("\n        Ideal Weight Game");
        System.out.println("\n  1    2    3    4    5    6    7    8");
        
        for (int i = 0; i < noOfRows; i++) {
            System.out.print("------------------------------------------" + "\n" + (i+1));
            
            for (int j = 0; j < noOfColumns; j++) {
                System.out.print("| ?? ");
            }
            
            System.out.println("|");
        }
        
        System.out.println("------------------------------------------");
    }
}    
