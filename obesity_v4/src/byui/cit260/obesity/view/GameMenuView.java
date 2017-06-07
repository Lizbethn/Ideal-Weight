/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class GameMenuView {
private String promptMessage;

    public GameMenuView() {
        this.gameMenu();
    }
  
     private void gameMenu() {
       System.out.println("\n"
                + "\n------------------------------------------"
                + "\n| Game Menu"
                + "\n------------------------------------------"
                + "\nG - Calculate the BMI"
                + "\nM - calculate Level of Mood"
                + "\nW - calculate Ideal Weight"
                + "\nE - calculate Calories By Dishes"
                + "\nCG - calculate Calories Gain"
                + "\nR - Exit returns to the Main Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }

    void displayMenu() {
         boolean done = false; //set flag to not done
        do{
        //prompt for and get players name
        String menuOption = this.getMenuOption();   
        if(menuOption.toUpperCase().equals("Q"))//user wants to quit
            return; // exit the game
        
        //do the requested action and display the next view
        done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
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

    private boolean doAction(String menuOption) {
         menuOption = menuOption.toUpperCase();//convert choice to upper case
        
        switch (menuOption){
            case "G": //calculate the BMI
                 this.calculateBMI();
                 break;
            case "M": //calculateLevelMood
                 this.calculateLevelMood();
                 break;
            case "W": //calculateIdelWeight
                 this.calculateIdelWeight();
                 break;
            case "E": //calculateCaloriesByDishes
                 this.calculateCaloriesByDishes();
                 break;
            case "CG": //calculateCaloriesGain
                 this.calculateCaloriesGain();
                 break;     
            case "R": // Exit returns to the Main Menu
                 this.returnMainMenu();
                 break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
               break;
        }
        
        return false;
    }

 

    private void returnMainMenu() {
       MainMenuView mainMenuView = new MainMenuView();
                
       //Display the main view
        mainMenuView.displayMainMenuView();
    }

    private void calculateBMI() {
       CalculateBmiView calculateBmiView = new CalculateBmiView();
       
       calculateBmiView.displayCalculateBmiView();
       
    }

    private void calculateLevelMood() {
        
        CalculateLevelMoodView calculateLevelMoodView = new CalculateLevelMoodView();
        calculateLevelMoodView.displayCalculateLevelMoodView();
    }

    private void calculateIdelWeight() {
        CalculateIdelWeightView calculateIdelWeightView = new CalculateIdelWeightView();
        calculateIdelWeightView.displayCalculateIdelWeightView();
    }

    private void calculateCaloriesByDishes() {
        CalculateCaloriesByDishesView calculateCaloriesByDishesView = new CalculateCaloriesByDishesView();
        calculateCaloriesByDishesView.displayCalculateCaloriesByDishesView();
    }

    private void calculateCaloriesGain() {
       CalculateCaloriesGainView calculateCaloriesGainView = new CalculateCaloriesGainView();
       calculateCaloriesGainView.displayCalculateCaloriesGainView();
    }

   

   

    
    
}
