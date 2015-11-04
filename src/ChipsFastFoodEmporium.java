
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class ChipsFastFoodEmporium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will ask the user for their fastfood choices
        // using a number system and then will calculate the total calories for the user
        
        // create scanner to get input
        Scanner input = new Scanner (System.in);
        
        // welcome the user
        System.out.println("Welcome to Chip's Fast Food Emporium");
        
        // ask the user what their burger choice is and then collect the number
        System.out.print("Please enter a burger choice: ");
        int burger = input.nextInt();
        // create variable for the number of calories of the burger
        int burgerCal;
        
        // ask the user what their side order choice is and then collect the number
        System.out.print("Please enter a side order choice: ");
        int sideOrder = input.nextInt();
        // create variable for the number of calories of the side order
        int sideOrderCal;
        
        // ask the user what their drink choice is and then collect the number
        System.out.print("Please enter a drink choice: ");
        int drink = input.nextInt();
        // create variable for the number of calories of the drink
        int drinkCal;
        
        // ask the user what their dessert choice is and then collect the number
        System.out.print("Please enter a dessert choice: ");
        int dessert = input.nextInt();
        // create variable for the number of calories of the dessert
        int dessertCal;
        
        // if the burger choice is 1 than it has 461 calories in it
        if(burger == 1){
            burgerCal = 461;
        // if the burger choice is 2 than it has 431 calories in it
        } else if(burger == 2){
            burgerCal = 431;
        // if the burger choice is 3 than it has 420 calories in it
        } else if(burger == 3){
            burgerCal = 420;
        // if the burger choice is 4 than it has 0 calories in it
        } else{
            burgerCal = 0;
        }
        
        // if the drink choice is 1 than it has 130 calories in it
        if(drink == 1){
            drinkCal = 130;
        // if the drink choice is 2 than it has 160 calories in it
        } else if(drink == 2){
            drinkCal = 160;
        // if the drink choice is 3 than it has 118 calories in it    
        } else if(drink == 3){
            drinkCal = 118;
        // if the drink choice is 4 than it has 0 calories in it
        } else{
            drinkCal = 0;
        }
                
        // if the side order choice is 1 than it has 100 calories in it
        if(sideOrder == 1){
            sideOrderCal = 100;
        // if the side order choice is 2 than it has 57 calories in it
        } else if(sideOrder == 2){
            sideOrderCal = 57;
        // if the side order choice is 3 than it has 70 calories in it
        } else if(sideOrder == 3){
            sideOrderCal = 70;
        // if the side order choice is 4 than it has 0 calories in it
        } else{
            sideOrderCal = 0;
        }
        
        // if the dessert is 1 than it has 167 calories in it
        if(dessert == 1){
            dessertCal = 167;
        // if the dessert is 2 than it has 266 calories in it
        } else if(dessert == 2){
            dessertCal = 266;
        // if the dessert is 3 than it has 75 calories in it
        } else if(dessert == 3){
            dessertCal = 75;
        // if the dessert is 4 than it has 0 calories in it
        } else{
            dessertCal = 0;
        }
        
        // create a variable for the total calorie count and display outcome
        int totalCalories = burgerCal +  drinkCal + sideOrderCal + dessertCal;
        System.out.println("Your total Calorie count is " + totalCalories + ".");
        
        // close scanner
        input.close();
    }
}
