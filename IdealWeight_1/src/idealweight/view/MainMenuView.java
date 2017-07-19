
package idealweight.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import idealweigh.IdealWeight;
import idealweight.control.GameControl;
import idealweight.control.QuestionControl;
import idealweight.exceptions.MapControlException;

/**
 *
 * @author Lizbeth
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Main Menu                             |"
            + "\n-----------------------------------------"
            + "\n1 - Go to Play"
            + "\n2 - Continue a saved game"
            + "\n3 - Help Menu"
            + "\n4 - Save game"
            + "\n5 - High score Menu"
            + "\n6 - Print game list"   
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": {
            try {
                //create and start a new game
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "2": //get and start an existing game
                this.startExistingGame();
                break;
            case "3": //display the help menu
                this.displayHelpMenu();
                break;
            case "4": // save the current game
                this.saveGame();
                break;
            case "5": //get and show high score
                this.displayHighScore();
                break;
            case "6": //get and show all questions
                this.saveGameList();
                break;
            default: //get and start an existing game
                ErrorView.display("MainMenuView",
                                "*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void startNewGame() throws MapControlException {
        GameControl.createNewGame(IdealWeight.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();


    }

    private void startExistingGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

    private void displayHelpMenu() {   
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGameList() {   
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            QuestionControl.saveStudyList(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void saveGame() {
        //prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for the file where the game "
                        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(IdealWeight.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

    }

    private void displayHighScore() {
           // display the high score menu
        HighScoreMenuView highScoreMenu = new HighScoreMenuView();
        highScoreMenu.display();
    
    }
    
    
}
