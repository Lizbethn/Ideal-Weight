/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

import byui.cit260.obesity.exception.MapControlException;
import byui.cit260.obesity.model.Game;
import byui.cit260.obesity.model.Map;
import byui.cit260.obesity.model.Player;
import obesity.CuriousWorkmanship;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author USUARIO
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if(name == null){
        return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        CuriousWorkmanship.setPlayer(player); //save the player
        
        return player;
    }

    public static void createNewGame(Player player) throws MapControlException {
        Game game = new Game();
        CuriousWorkmanship.setCurrentGame(game);
        
        game.setPlayer(player);
        
       // Map map = MapControl.createMap();
       // game.setMap(map);
        
       // MapControl.moveActorsToStartingLocation(map);
    }

   public static void assignsScenesToLocations(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game game, String filepath) throws GameControlException{
    
        try(FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
    
    }

    public static void getSavedGame(String filepath) throws GameControlException{
        Game game = null;
        try(FileInputStream fips = new FileInputStream(filepath)){
           ObjectInputStream input = new ObjectInputStream(fips);
           
           game = (Game) input.readObject();
        }catch( Exception e){
           throw new GameControlException(e.getMessage());
        }
        
        CuriousWorkmanship.setCurrentGame(game);
    }

    public void createNewGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double calculateCaloriesGain(String sex, double weight, double height, int age, String activity_factor){
        
     double calories = 0;
     double valor_factor = 0.0;
     
    if(activity_factor =="Light activity"){  
    valor_factor = 1.375;    
    }
    else if(activity_factor =="Moderate activity "){
    valor_factor = 1.55;     
    }
    else if(activity_factor =="Intense activity"){
    valor_factor = 1.725;     
    }
    else{
    valor_factor = 1.9;     
    }
     
    if (weight <=  0 || height <= 0 || age <= 0){		
    return 0;					
    }else if(height == 0 && weight == 0 && age == 0){		
    return 0;					
    }else if(weight > 0 && height == 0 && age <= 0){	
    return 0;					
    }else if (sex.equals("female")){				
    calories = (655 +(9.6 * weight))+((1.8*height)-(4.7*age))* valor_factor;
    }else{					
    calories =(66 + (13.7 * weight))+((5*height)-(6.8*age))* valor_factor;
    }   
       return calories;   
    }

    
     
}
