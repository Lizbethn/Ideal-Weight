/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.obesity.control;

/**
 *
 * @author USUARIO
 */
public class DishesControl {
    
    public int calculateCaloriesByDishes(String dishes){
    
        int calories_dishes = 0;
        if (dishes.equals(" ")){
    calories_dishes = 0;
    } else if(dishes.equals("Albóndigas")){
    calories_dishes = 202;
    }else if (dishes.equals("Arroz frito")){
    calories_dishes = 186;
    }else if (dishes.equals("Arroz integral")){
    calories_dishes = 362;
    }else if (dishes.equals("Barbacoa de borrego")){
    calories_dishes = 170;
    }else if (dishes.equals("Burrito")){
    calories_dishes = 163;
    }else if (dishes.equals("Canelones")){
    calories_dishes = 153;
    }else if (dishes.equals("Carne con tomate")){
    calories_dishes = 240;
    }else if (dishes.equals("Carne mechada")){
    calories_dishes = 254;
    }else if (dishes.equals("Chili con Carne")){
    calories_dishes = 105;
    }else if (dishes.equals("Chuleta / Costeleta de cerdo")){
    calories_dishes = 225;
    }else if (dishes.equals("Codillo de cerdo asado")){
    calories_dishes = 164;
    }else if (dishes.equals("Costillas a la barbacoa / barbecue")){
    calories_dishes = 292;
    }else if (dishes.equals("Empanada de atún")){
    calories_dishes = 251;
    }else if (dishes.equals("Empanada de carne")){
    calories_dishes = 293;
    }else if (dishes.equals("Empanada de jamón y queso")){
    calories_dishes = 234;
    }else if (dishes.equals("Enchiladas")){
    calories_dishes = 168;
    }else if (dishes.equals("Ensalada César")){
    calories_dishes = 127;
    }else if (dishes.equals("Ensalada de patata / papa")){
    calories_dishes = 143;
    }else if (dishes.equals("Espaguetis a la boloñesa")){
    calories_dishes = 132;
    }else if (dishes.equals("Estofado de ternera / Guisado de carne")){
    calories_dishes = 95;
    }else if (dishes.equals("Fajita")){
    calories_dishes = 117;
    }else if (dishes.equals("Fish and Chips / Pescado con papas")){
    calories_dishes = 195;
    }else if (dishes.equals("Gazpacho")){
    calories_dishes = 80;
    }else if (dishes.equals("Guiso de arroz")){
    calories_dishes = 243;
    }else if (dishes.equals("Guiso de fideos con carne")){
    calories_dishes = 400;
    }else if (dishes.equals("Guiso de lentejas")){
    calories_dishes = 336;
    }else if (dishes.equals("Guiso de porotos")){
    calories_dishes = 358;
    }else if (dishes.equals("Hummus / Puré de garbanzo")){
    calories_dishes = 177;
    }else if (dishes.equals("Judías estofadas / Frijoles cocidos")){
    calories_dishes = 94;
    }else if (dishes.equals("Kebab")){
    calories_dishes = 215;
    }else if (dishes.equals("Lasaña")){
    calories_dishes = 132;
    }else if (dishes.equals("Lasaña vegetal")){
    calories_dishes = 177;
    }else if (dishes.equals("Locro")){
    calories_dishes = 191;
    }else if (dishes.equals("Lomo de cerdo asado")){
    calories_dishes = 247;
    }else if (dishes.equals("Lomo en salsa")){
    calories_dishes = 108;
    }else if (dishes.equals("Macarrones / Fideos a la boloñesa")){
    calories_dishes = 107;
    }else if (dishes.equals("Macarrones / Fideos con queso")){
    calories_dishes = 370;
    }else if (dishes.equals("Milanesa de pescado")){
    calories_dishes = 275;
    }else if (dishes.equals("Milanesa de pollo")){
    calories_dishes = 115;
    }else if (dishes.equals("Milanesa de ternera")){
    calories_dishes = 215;
    }else if (dishes.equals("Mole poblano")){
    calories_dishes = 0;
    }else if (dishes.equals("Moussaka")){
    calories_dishes = 120;
    }else if (dishes.equals("Paella")){
    calories_dishes = 156;
    }else if (dishes.equals("Patatas / Papas alioli")){
    calories_dishes = 250;
    }else if (dishes.equals("Patatas / Papas bravas")){
    calories_dishes = 130;
    }else if (dishes.equals("Pato a la pekinesa")){
    calories_dishes = 225;
    }else if (dishes.equals("Pizza")){
    calories_dishes = 267;
    }else if (dishes.equals("Pollo al horno")){
    calories_dishes = 164;
    }else if (dishes.equals("Pollo asado / rostizado")){
    calories_dishes = 144;
    }else if (dishes.equals("Pollo relleno")){
    calories_dishes = 220;
    }else if (dishes.equals("Pozole")){
    calories_dishes = 0;
    }else if (dishes.equals("Puré de patatas / papas")){
    calories_dishes = 83;
    }else if (dishes.equals("Raviolis / Ravioles")){
    calories_dishes = 203;
    }else if (dishes.equals("Rollito de primavera")){
    calories_dishes = 250;
    }else if (dishes.equals("Rosbif")){
    calories_dishes = 111;
    }else if (dishes.equals("Salmorejo")){
    calories_dishes = 87;
    }else if (dishes.equals("Sopa de guisantes / arvejas / chícharo")){
    calories_dishes = 75;
    }else if (dishes.equals("Taco")){
    calories_dishes = 217;
    }else if (dishes.equals("Tamales")){
    calories_dishes = 200;
    }else if (dishes.equals("Tortilla de patatas / papas")){
    calories_dishes = 126;
    }
    return calories_dishes;
    }
    
}
