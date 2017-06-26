/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;
import byui.cit260.obesity.model.Location;
/**
 *
 * @author Lizbeth
 */
public class MapDisplayView {
    void displayMap() {
        Location coordinates = new Location();
        
        int row = coordinates.getRow();
        int column = coordinates.getColumn();
        
        System.out.println(row);
        
        System.out.println("\nIdeal Weight Map");
        System.out.println("\n1    2    3    4    5"
                           + "---------------------");
    }

}
