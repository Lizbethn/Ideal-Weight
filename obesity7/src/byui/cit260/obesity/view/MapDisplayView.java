/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;
import byui.cit260.obesity.control.MapControl;
import byui.cit260.obesity.exception.MapControlException;
import byui.cit260.obesity.model.Actor;
import byui.cit260.obesity.model.Location;
/**
 *
 * @author Lizbeth
 */
public class MapDisplayView extends View{
    
    double doubleNumber;

    public double getDoubleNumber() {
        Double number = null;
        
        while (number == null){
        String value = this.getInput();
        value = value.trim().toUpperCase();
        
        if(value.equals("Q"))
            break;
        
        try{
        //parse and convert number from text to a double
        number = Double.parseDouble(value);
        } catch (NumberFormatException nf){
            
            System.out.println("You must enter a valid number."
                    + "Try again or enter Q to quit");
        }}
        return number;
    }
    
    
    @Override
    public boolean doAction(String choice) {
        Actor actor = null;
         choice = choice.toUpperCase();//convert choice to upper case
        
        switch (choice){
            case "1": //Redirect to view map menu
                this.displayMap();
                break;
           
            case "G": //calculate the BMI
                 this. moveActorLocation();
                 break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
               break;
        }
        
        return false;
    }
    
    void displayMap() {
        Location coordinates = new Location();
        
        int row = coordinates.getRow();
        int column = coordinates.getColumn();
        
        System.out.println(row);
        
        System.out.println("\nIdeal Weight Map");
        System.out.println("\n1    2    3    4    5"
                           + "---------------------");
    }

    private void moveActorLocation() {
        //move actor to specified location
        //int returnValue = MapControl.moveActorsToLocation(actor, coordinates);
        try {
            MapControl.moveActorsToLocation(actor, coordinates);
        } catch (MapControlException me){
            System.out.println(me.getMessage());
        }
    }


}
