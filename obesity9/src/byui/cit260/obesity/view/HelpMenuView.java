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
public class HelpMenuView extends View{


    public HelpMenuView(){
    super("\n"
                + "\n------------------------------------------"
                + "\n| Help Menu"
                + "\n------------------------------------------"
                + "\nG - What is the goal of the game?"
                + "\nM - How to move"
                + "\nE - Estimating the amount of resources"
                + "\nH - Harvesting resources"
                + "\nD - Delivering resources to warehouse"
                + "\nR - Exit returns to the Main Menu"
                + "\nQ - Quit"
                + "\n------------------------------------------");
    
    }
    

    @Override
    public boolean doAction(String value) {

      value = value.toUpperCase();//convert choice to upper case
        
        switch (value){
            case "G": //What is the goal of the game?
                 this.goalGame();
                 break;
            case "M": //How to move
                 this.howToMove();
                 break;
            case "E": //Estimating the amount of resources
                 this.amountResources();
                 break;
            case "H": //Harvesting resources
                 this.harvestingResources();
                 break;
            case "D": //Delivering resources to warehouse
                 this.deliveringResources();
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

    private void goalGame() {
        System.out.println("\n*** goalGame() function called: What is the goal of the game? ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() function called: How to move ***");
    }

    private void amountResources() {
        System.out.println("\n*** amountResources() function called: Estimating the amount of resources ***");
    }

    private void harvestingResources() {
        System.out.println("\n*** harvestingResources() function called: Harvesting resources ***");
    }

    private void deliveringResources() {
        System.out.println("\n*** deliveringResources() function called: Delivering resources to warehouse ***");
    }

    private void returnMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
                
       //Display the main view
        mainMenuView.display();
    }

    

    
    
    
    
    
    
    
    
}
