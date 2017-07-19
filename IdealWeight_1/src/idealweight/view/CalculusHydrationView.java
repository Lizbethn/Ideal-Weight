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
public class CalculusHydrationView extends View{
        public CalculusHydrationView(){
        super("\n"
                + "\n-----------------------------------------"
                + "\n |Calculus Hydration                   |"
                + "\n-----------------------------------------"
                + "\nWhich of the following vegetables is NOT a good source of hydration?"
                + "\n1. answer = celery"
                + "\n2. answer = cucumber"
                + "\n3. answer = watermelon"
                + "\n4. answer = Peas"
                + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "1": //set answer 1
                this.validateAnswer(1);
                break;
            case "2": //set answer 2
                this.validateAnswer(2);
                break;
            case "3": //set answer 3
                this.validateAnswer(3);
                break;
            case "4": //set answer 4
                this.validateAnswer(4);
                break;
            default: //invalid selection
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
        
    }

    private void validateAnswer(int i) {
        if(i  == 4) {
            System.out.println("\nYou have answered the question successfully."
                            + "\nYou have been awarded 25 points!!!");
            this.displayMathBuildingView();
        }

        else {
            System.out.println("\nYour answer was incorrect. Try again!");
            this.displayCalculusClassRoomView();
        }
    }

    private void displayMathBuildingView() {

        // Create AnswerView object
        MathBuildingView mathBuildingView = new MathBuildingView();        

        // Display the answer menu view
        mathBuildingView.display();
    }    

    private void displayCalculusClassRoomView() {

        // Create AnswerView object
        CalculusHydrationView calculusVegetablesView = new CalculusHydrationView();        

        // Display the answer menu view
        calculusVegetablesView.display();
    }  
}