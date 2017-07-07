/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.ReportControl;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReportView extends View{

    
 public ReportView() {
        super("\n-----------------------------------------"
                + "\nQ - Quit"
                + "\n-----------------------------------------");
        
        ReportControl displayHighScores = new ReportControl();
        ArrayList<ReportControl.HighScore> displayScores;
        displayScores = displayHighScores.getHighScores();
        
        this.console.println("\n" 
                       + "\n-----------------------------------------"
                       + "\n |High Scores                 |"
                       + "\n-----------------------------------------");
        
        for (int i = 0; i < displayScores.size(); i++){
            this.console.println(i+1 + ": " + displayScores.get(i));
        }
}

        @Override
        public boolean doAction(String value) {
          value = value.toUpperCase(); //convert choice to upper case

          switch (value) {            
              default: //get and start an existing game
                  this.console.println("\n*** Invalid Selection *** Try Again");
                  break;
          }

          return false;
    }    
    
}
