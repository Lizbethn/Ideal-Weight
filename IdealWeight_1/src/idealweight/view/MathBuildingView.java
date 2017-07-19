/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idealweight.view;
/**
 *
 * @author Lizbeth
 */
class MathBuildingView extends View {
    
    public MathBuildingView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n |Math Building Menu                    |"
            + "\n-----------------------------------------"
            + "\n1 - Vegetables"
            + "\n2 - Proteins"
            + "\n3 - Fruits"
            + "\n4 - Hydration"
            + "\nF - Final Exam"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": 
                this.displayVegetablesClassRoom();
                break;
            case "2": 
                this.displayProteinsClassRoom();
                break;
            case "3": 
                this.displayFruitsClassRoom();
                break;
            case "4": 
                this.displayHydrationClassRoom();
                break; 
            case "5": 
                this.displayCalciumClassRoom();
                break;                  
            default: //get and start an existing game
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;        
    }

    private void displayVegetablesClassRoom() {
        
        CalculusVegetablesView calculusVegetables = new CalculusVegetablesView();
        calculusVegetables.display();
    }

    private void displayProteinsClassRoom() {
        CalculusProteinsView calculusProteins = new CalculusProteinsView();
        calculusProteins.display();
    }

    private void displayFruitsClassRoom() {
        
        CalculusFruitsView calculusFruits = new CalculusFruitsView();
        calculusFruits.display();
    }

    private void displayHydrationClassRoom() {
        
        CalculusHydrationView calculusHydration = new CalculusHydrationView();
        calculusHydration.display();
    }

    private void displayCalciumClassRoom() {
        CalculusCalciumView calculusHydration = new CalculusCalciumView();
        calculusHydration.display();
    }
    
}
