
package idealweight.view;

import idealweight.control.GameControl;
import idealweight.model.Player;

/**
 *
 * @author Lizbeth
 */
public class StartProgramView extends View{
        
    public StartProgramView() {
        super("\nPlease enter your name: ");
        
        //diplay the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(    
        "\n*************************************************"
        + "\n                                               *"
        + "\nWelcome to Ideal Weight Play!!!!!!"
        + "\nThis is a fun game that promotes healthy foods"
        + "\nhigh in certain vitamins and minerals to children."
        + "\nChildren are given a specific nutrient and a list of foods"
        + "\nthat are high in that vitamin or mineral."
        + "\nChildren should find foods high in the nutrient that the machine asks for."
        + "\nChildren learn about healthy foods and begin"
        + "\nto associate vitamins and minerals with foods in food groups."
        + "\nGood luck!!!                                    "
        + "\n                                               *"
        + "\n************************************************"
        );
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "This name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(value);
        
        if(player == null) { // if unsuccessful
            System.out.println("\nError creating player");
            return false;
        }
        
        //display new view
        this.displayNextView(player);
        
        return true; //
    }

    private void displayNextView(Player player) {
        System.out.println("\n================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n Let's to play!"
                          + "\n================================="        
        );
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }
}
