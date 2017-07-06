/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
class CalculateCaloriesGainView {
    private String promptMessage;
    protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
    protected final PrintWriter console = CuriousWorkmanship.getOutFile();

    public CalculateCaloriesGainView() {
        System.out.println("Input sex: female or male");
    }
    
    void displayCalculateCaloriesGainView() {
       boolean done = false; //set flag to not done
       do{
       //prompt for and get players name
       String sex = this.getSex();
        if(sex.toUpperCase().equals("Q"))//user wants to quit
            return; // exit the game
        
       System.out.println("Input Weight");
       double weight = this.getWeight();
       
       System.out.println("Input Height");
       double height = this.getHeight();
       
       System.out.println("Input Age");
       int age = this.getAge();
       
       System.out.println("Input activity factor: Light activity"
               + "Moderate activity"
               + "Intense activity");
       String activity_factor = this.getActivityFactor();
       
       
       //do the requested action and display the next view
       done = this.doAction(sex,weight,height,age,activity_factor);
          
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
        
        }
    }catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return value; //return the value
    }

    private double getWeight() {
      
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

    private int getAge() {
        
        String value = null; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        try{
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = this.keyboard.readLine(); //get next line typed on keyboard

            if(value.length() < 1){ //value is blank
                 ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
            }
        break; //end the loop
        
        }}catch (Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
           
        }
        return 0; //return the value
    }

    private String getActivityFactor() {
       
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

    private boolean doAction(String sex, double weight, double height, int age, String activity_factor) {
        GameControl calculo = new GameControl();
        double calories = calculo.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        System.out.println("\nThe calories gain is " + calories);
        return false;
    }
    
}
