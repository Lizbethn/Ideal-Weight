/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import obesity.CuriousWorkmanship;
import byui.cit260.obesity.control.PlayerControl;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
class CalculateLevelMoodView {
    private String promptMessage;
    protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
    protected final PrintWriter console = CuriousWorkmanship.getOutFile();

    public CalculateLevelMoodView() {
        System.out.println("Ingrese color que le guste los cuales son: red, skyblue, gray, black, yellow, green, pink");
    }
    
     void displayCalculateLevelMoodView() {
       boolean done = false; //set flag to not done
       do{
       //prompt for and get players name
       String color = this.getColor();
        if(color.toUpperCase().equals("Q"))//user wants to quit
            return; // exit the game

       //do the requested action and display the next view
       done = this.doAction(color);
       
          
       }while (!done);
    }

    private String getColor() {
      
        String value = ""; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        try{
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blancks
            
            if(value.length() < 1){ //value is blank
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
            }
        break; //end the loop
        
        } }catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return value; //return the value 
    }

    private boolean doAction(String color) {
       PlayerControl calculo = new PlayerControl();
        String mood = calculo.calculateLevelMood(color);
        System.out.println("\nYour level mood is " + mood);
        return false;
    }
}
