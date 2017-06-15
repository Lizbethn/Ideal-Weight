/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.PlayerControl;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class CalculateLevelMoodView {
    private String promptMessage;

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
      Scanner keyboard = new Scanner(System.in);
        String value = ""; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blancks
            
            if(value.length() < 1){ //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
        break; //end the loop
        
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
