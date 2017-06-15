/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

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
                + "\nG - Calculate the BMI"
                + "\nM - calculate Level of Mood"
                + "\nW - calculate Ideal Weight"
                + "\nE - calculate Calories By Dishes"
                + "\nCG - calculate Calories Gain"
                + "\nR - Exit returns to the Main Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    }



    public boolean doAction(String value) {
         value = value.toUpperCase();//convert choice to upper case
        
        switch (value){
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
        calculateCaloriesByDishesView.displayCalculateCaloriesByDishesView();
    }

    private void calculateCaloriesGain() {
       CalculateCaloriesGainView calculateCaloriesGainView = new CalculateCaloriesGainView();
       calculateCaloriesGainView.displayCalculateCaloriesGainView();
    }

   

   

    
    
}
