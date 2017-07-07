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
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class CalculateIdelWeightView {
    private String promptMessage;
    protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
    protected final PrintWriter console = CuriousWorkmanship.getOutFile();

    public CalculateIdelWeightView() {
        System.out.println("Input Height");
    }
    
    void displayCalculateIdelWeightView() {
       boolean done = false; //set flag to not done
       do{
       //prompt for and get players name
       double height = this.getHeight();
       
       System.out.println("Input sex: female or male");
       String sex = this.getSex();
        if(sex.toUpperCase().equals("Q"))//user wants to quit
            return; // exit the game
       System.out.println("Input Complexion: little or median or big");
       String complexion = this.getComplexion();
       
       
       //do the requested action and display the next view
       done = this.doAction(sex, complexion, height);
          
       }while (!done);
    }

    private String getSex() {
     
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
        
        }}catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return value; //return the value   
    }

    private String getComplexion() {
       
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
        
        }}catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return value; //return the value 
    }

    private double getHeight() {
        
        String  value = null; //value to be returned
        boolean valid = false; // initialize to nt valid
       
        try{
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine(); //get next line typed on keyboard
            
            if(value.length() < 0.1){ //value is blank
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
            }
        break; //end the loop
        
        }
    }catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return 0; //return the value 
    }

    private boolean doAction(String sex, String complexion, double height) {
        PlayerControl calculo = new PlayerControl();
        String peso_ideal = calculo.calculateIdelWeight(height, sex, complexion);
        System.out.println("\nThe Ideal weight is " + peso_ideal);
        return false;
    }
}
