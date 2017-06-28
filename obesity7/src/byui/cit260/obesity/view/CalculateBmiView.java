/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.PlayerControl;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class CalculateBmiView {
    private String promptMessage;

    public CalculateBmiView() {
        System.out.println("Ingrese peso");
        
    }
    
    
    void displayCalculateBmiView() {
         boolean done = false; //set flag to not done
        do{
       //prompt for and get players name
       double weight = this.getWeight();
       System.out.println("Ingrese altura");
       double height = this.getHeight();
       //do the requested action and display the next view
       done = this.doAction(weight,height);
       
          
       }while (!done);
    }
    
        private double getWeight() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        double  value = 0.0; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextDouble(); //get next line typed on keyboard
            
            if(value < 0.1){ //value is blank
                System.out.println("\nInvalid value: value not valid");
                continue;
            }
        break; //end the loop
        
        }
        return value; //return the value 
    }
        
    private double getHeight() {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);;
        double  value = 0.0; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextDouble(); //get next line typed on keyboard
            
            if(value < 0.1){ //value is blank
                System.out.println("\nInvalid value: value not valid");
                continue;
            }
        break; //end the loop
        
        }
        return value; //return the value 
    }    

    private boolean doAction(double weight, double height) {

        PlayerControl calculo = new PlayerControl();
        double bmi = calculo.calculateBMI(weight, height);
        System.out.println("\nThe BMI is " + bmi);
        return false;
    }
    
}
