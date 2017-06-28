/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import byui.cit260.obesity.exception.MapControlException;
import byui.cit260.obesity.model.Actor;
import byui.cit260.obesity.model.Map;
import byui.cit260.obesity.view.CuriousWorkmanship;
import java.awt.Point;

/**
 *
 * @author Lizbeth
 */
public class MapControl {
    static Map createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToLocation(Actor actor, Point coordinates) 
        throws MapControlException{
        Map map = CuriousWorkmanship.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if(newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || newColumn >= map.getNoOfColumns()){
        throw new MapControlException("Can not move actor to location"
                + coordinates.x + "," + coordinates.y
                + "because that location is outside"
                + "the bounds of the map.");
        }
      
    }
    
    public static void moveActorsToStartingLocation(Map map)
    throws MapControlException{
    //for every actor
    Actor[] actors = Actor.values();
    
    for( Actor actor : actors){
    Point coordinates = actor.getCoordinates();
    MapControl.moveActorsToLocation(actor, coordinates);
   
    }
    }
}
