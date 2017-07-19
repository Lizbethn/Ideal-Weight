/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.control;


import idealweigh.IdealWeight;
import idealweight.exceptions.MapControlException;
import idealweight.model.Actor;
import idealweight.model.Actor.Point;
import idealweight.model.Map;

/**
 *
 * @author Lizbeth
 */
class MapControl {

    static Map createMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToStartingLocation(Map map) 
                            throws MapControlException {
        Actor[] actors = Actor.values();
        //for every actor
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
        
    }
    
    public static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
       Map map = IdealWeight.getCurrentGame().getMap();
       int newRow = coordinates.x-1;
       int newColumn = coordinates.y-1;
       
       if (newRow <0 || newRow >= map.getNoOfRows() ||
               newColumn <0 || newColumn >= map.getNoOfColumns()){
                throw new MapControlException("Can not move actor to location "
                                            + coordinates.x + ", " + coordinates.y
                                            + " because that location is outside "
                                            + "the bounds of the map.");
       }
        
    }
    
    
}
