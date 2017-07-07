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
public class GameMenuView extends View{
    

     public GameMenuView() {
       
       super("\n"
                + "\n------------------------------------------"
                + "\n| Game Menu"
                + "\n------------------------------------------"
                + "\n1 - View map"
                + "\nG - Calculate the BMI"
                + "\nM - calculate Level of Mood"
                + "\nW - calculate Ideal Weight"
                + "\nE - calculate Calories By Dishes"
                + "\nCG - calculate Calories Gain"
                + "\nR - Exit returns to the Main Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
       
       
       
    }

  
    @Override
    public boolean doAction(String value) {
         value = value.toUpperCase();//convert choice to upper case
        
        switch (value){
            case "1": //Redirect to view map menu
                this.displayMap();
                break;
           
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

 
    private void displayMap() {
        //display the Map
        MapDisplayView displayMapView = new MapDisplayView();
        displayMapView.displayMap();
    }
    
    
    private void returnMainMenu() {
       MainMenuView mainMenuView = new MainMenuView();
                
       //Display the main view
        mainMenuView.display();
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
        calculateCaloriesByDishesView.display();
    }

    private void calculateCaloriesGain() {
       CalculateCaloriesGainView calculateCaloriesGainView = new CalculateCaloriesGainView();
       calculateCaloriesGainView.displayCalculateCaloriesGainView();
    }



   

   

    
    
}
