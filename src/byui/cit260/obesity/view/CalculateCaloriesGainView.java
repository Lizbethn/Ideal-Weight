/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.GameControl;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class CalculateCaloriesGainView {
    private String promptMessage;

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

    private double getWeight() {
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

    private int getAge() {
        Scanner keyboard = new Scanner(System.in);
        int value = 0; //value to be returned
        boolean valid = false; // initialize to nt valid
        
        while(!valid){ //loop while an invalid value is enter 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextInt(); //get next line typed on keyboard

            if(value < 1){ //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
        break; //end the loop
        
        }
        return value; //return the value
    }

    private String getActivityFactor() {
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

    private boolean doAction(String sex, double weight, double height, int age, String activity_factor) {
        GameControl calculo = new GameControl();
        double calories = calculo.calculateCaloriesGain(sex, weight, height, age, activity_factor);
        System.out.println("\nThe calories gain is " + calories);
        return false;
    }
    
}
