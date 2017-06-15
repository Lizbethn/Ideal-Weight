/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.view;

import byui.cit260.obesity.control.DishesControl;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
class CalculateCaloriesByDishesView {
private String promptMessage;

    public CalculateCaloriesByDishesView() {
        System.out.println("Ingrese meal: Albóndigas\n" +
"Arroz frito\n" +
"Arroz integral\n" +
"Barbacoa de borrego\n" +
"Burrito\n" +
"Canelones\n" +
"Carne con tomate\n" +
"Carne mechada\n" +
"Chili con Carne\n" +
"Chuleta / Costeleta de cerdo\n" +
"Codillo de cerdo asado\n" +
"Costillas a la barbacoa / barbecue\n" +
"Empanada de atún\n" +
"Empanada de carne\n" +
"Empanada de jamón y queso\n" +
"Enchiladas\n" +
"Ensalada César\n" +
"Ensalada de patata / papa\n" +
"Espaguetis a la boloñesa\n" +
"Estofado de ternera / Guisado de carne\n" +
"Fajita\n" +
"Fish and Chips / Pescado con papas\n" +
"Gazpacho\n" +
"Guiso de arroz\n" +
"Guiso de fideos con carne\n" +
"Guiso de lentejas\n" +
"Guiso de porotos\n" +
"Hummus / Puré de garbanzo\n" +
"Judías estofadas / Frijoles cocidos\n" +
"Kebab\n" +
"Lasaña\n" +
"Lasaña vegetal\n" +
"Locro\n" +
"Lomo de cerdo asado\n" +
"Lomo en salsa\n" +
"Macarrones / Fideos a la boloñesa\n" +
"Macarrones / Fideos con queso\n" +
"Milanesa de pescado\n" +
"Milanesa de pollo\n" +
"Milanesa de ternera\n" +
"Mole poblano\n" +
"Moussaka\n" +
"Paella\n" +
"Patatas / Papas alioli\n" +
"Patatas / Papas bravas\n" +
"Pato a la pekinesa\n" +
"Pizza\n" +
"Pollo al horno\n" +
"Pollo asado / rostizado\n" +
"Pollo relleno\n" +
"Pozole\n" +
"Puré de patatas / papas\n" +
"Raviolis / Ravioles\n" +
"Rollito de primavera\n" +
"Rosbif\n" +
"Salmorejo\n" +
"Sopa de guisantes / arvejas / chícharo\n" +
"Taco\n" +
"Tamales\n" +
"Tortilla de patatas / papas");
    }
    
   void displayCalculateCaloriesByDishesView() {
       boolean done = false; //set flag to not done
       do{
       //prompt for and get players name

       String dishes = this.getDishes();
        if(dishes.toUpperCase().equals("Q"))//user wants to quit
            return; // exit the game

       //do the requested action and display the next view
       done = this.doAction(dishes);
          
       }while (!done);
    } 

    private String getDishes() {
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

    private boolean doAction(String dishes) {
        DishesControl calculo = new DishesControl();
        int calories_dishes = calculo.calculateCaloriesByDishes(dishes);
        System.out.println("\nThis meal has " + calories_dishes + " calories");
        return false;
    }
    
}
