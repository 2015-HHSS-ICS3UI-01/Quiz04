
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        //make scanner
        Scanner input = new Scanner(System.in);
        //make calorie variable
        int cal = 0;
        //ask for first choice
        System.out.println("Enter your Burger Choice.");
        int burg = input.nextInt();
        //add choices calorise
        if(burg == 1){
            cal = cal + 461;
            System.out.println("You chose the Cheeseburger");
        }else if(burg == 2){
            cal = cal + 431;
            System.out.println("You chose the Fish Burger");
        }else if(burg == 3){
            cal = cal + 420;
            System.out.println("You chose the Veggie Burger");
        }else{
            System.out.println("You chose nothing");
        }
        //ask for second choice
        System.out.println("Enter your Side Choice.");
        int side = input.nextInt();
        //add choices calorise
        if(side == 1){
            cal = cal + 100;
            System.out.println("You chose the Fries");
        }else if(side == 2){
            cal = cal + 57;
            System.out.println("You chose the Baked Potato");
        }else if(side == 3){
            cal = cal + 70;
            System.out.println("You chose the Chef Salad");
        }else{
            System.out.println("You chose nothing");
        }
        //ask for third choice
        System.out.println("Enter your Drink Choice.");
        int drink = input.nextInt();
        //add choices calorise
        if(drink == 1){
            cal = cal + 130;
            System.out.println("You chose the Soft Drink");
        }else if(drink == 2){
            cal = cal + 160;
            System.out.println("You chose the Orange Juice");
        }else if(drink == 3){
            cal = cal + 118;
            System.out.println("You chose the Milk");
        }else{
            System.out.println("You chose nothing");
        }
        //ask for forth choice
        System.out.println("Enter your Dessert Choice.");
        int dest = input.nextInt();
        //add choices calorise
        if(dest == 1){
            cal = cal + 167;
            System.out.println("You chose the Apple Pie");
        }else if(dest == 2){
            cal = cal + 266;
            System.out.println("You chose the Sundae");
        }else if(dest == 3){
            cal = cal + 75;
            System.out.println("You chose the Fruit Cup");
        }else{
            System.out.println("You chose nothing");
        }
        //tell the calorie count
        System.out.println("Your orders Calorie count is " + cal + ".");
    }
}