/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.PlayerControl;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author USUARIO
 */
class CalculateBmiView {
    private String promptMessage;
    protected final BufferedReader keyboard = CuriousWorkmanship.getInFile();
    protected final PrintWriter console = CuriousWorkmanship.getOutFile();

    public CalculateBmiView() {
        ErrorView.display(this.getClass().getName(), "Ingrese peso.");
        
    }
    
    
    void displayCalculateBmiView() {
         boolean done = false; //set flag to not done
        do{
       //prompt for and get players name
       double weight = this.getWeight();
       this.console.println(this.promptMessage);
       double height = this.getHeight();
       //do the requested action and display the next view
       done = this.doAction(weight,height);
       
          
       }while (!done);
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
        return 0;
        
        
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

    private boolean doAction(double weight, double height) {

        PlayerControl calculo = new PlayerControl();
        double bmi = calculo.calculateBMI(weight, height);
        System.out.println("\nThe BMI is " + bmi);
        return false;
    }

  
    
}
