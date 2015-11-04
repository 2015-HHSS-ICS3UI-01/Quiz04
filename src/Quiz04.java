
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);
                
        //ask user what burger they want to eat
        System.out.println("Welcome to Chip's Fast Food Emporium");
        System.out.println("Please enter a burger choice:");
        int burger = input.nextInt();
        int burgerCalories = burger;
        if(burger == 1){
            burgerCalories = 461;
        }if(burger == 2){
            burgerCalories = 431;
        }if(burger == 3){
            burgerCalories = 420;
        }if(burger == 4){
            burgerCalories = 0;
        }
        //ask user what drink they want
        System.out.println("Please enter a drink choice:");
        int drink = input.nextInt();
        int drinkCalories = drink;
        if(drink == 1){
            drinkCalories = 130;
        }if(drink == 2){
            drinkCalories = 160;
        }if(drink == 3){
            drinkCalories = 118;
        }if(drink == 4){
            drinkCalories = 0;
        }
        //ask user what side order they want
        System.out.println("Please enter a side order choice:");
        int side = input.nextInt();
        int sideCalories = side;
        if(side == 1){
            sideCalories = 100;
        }if(side == 2){
            sideCalories = 57;
        }if(side == 3){
            sideCalories = 70;
        }if(side == 4){
            sideCalories = 0;
        }
        //ask user what dessert they want
        System.out.println("Please enter a dessert choice:");
        int dessert = input.nextInt();
        int dessertCalories = dessert;
        if(dessert == 1){
            dessertCalories = 167;
        }if(dessert == 2){
            dessertCalories = 266;
        }if(dessert == 3){
            dessertCalories = 75;
        }if(dessert == 4){
            dessertCalories = 0;
        }
        //tell user how many calories they are consuming
        int calorieTotal = burgerCalories + drinkCalories + sideCalories + dessertCalories;
        System.out.println("Your total calorie count is " + (calorieTotal));
    }
}
