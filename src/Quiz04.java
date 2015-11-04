
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner generated
        Scanner in = new Scanner(System.in);
        // Variables created, that will store the consumer's order according to # of the food
        int burger = 0;
        int drink = 0;
        int side = 0;
        int dessert = 0;
        int Calories;
        // Welcomes the consumer 
        System.out.println("Welcome to Chip’s Fast Food Emporium ");
        // Asks consumer their burger choice
        System.out.println("Please enter a burger choice:");
        burger = in.nextInt();
        // Asks consumer their side choice
        System.out.println("Please enter a side order choice");
        side = in.nextInt();
        // asks consumer their drink choice
        System.out.println("Please enter a drink choice: ");
        drink = in.nextInt();
        // asks for yummy desserts
        System.out.println("Please enter a dessert choice");
        dessert = in.nextInt();
        // Gives their calorie count according to the number they inserted for burger
       if(burger == 1){
           burger = 461;
       }else if(burger == 2){
           burger = 431;
       }else if(burger == 3){
           burger = 420;
       }else{
           burger = 0;
       }
       
       // Gives their calorie count according to the number they inserted for Side
       if (side == 1){
           side = 100;
       }else if (side == 2){
           side = 57;
       }else if(side == 3){
           side = 70;
       }else{
           side = 0;
       }
       
       // Gives their calorie count according to the number they inserted for drink
       if(drink == 1){
           drink = 130;
       }else if(drink == 2){
           drink = 160;
       }else if (drink == 3){
           drink = 118;
       }else{
           drink = 0;
       }
       
       // Gives their calorie count according to the number they inserted for dessert
       if (dessert == 1){
           dessert = 167;
       }else if (dessert == 2){
           dessert = 266;
       }else if (dessert == 3){
           dessert = 75;
       }else{
           dessert = 0;
       }
       // Totals up all the calories 
       Calories = (burger + drink + side + dessert);
       // Informs the consumer how much they've ate
        System.out.println(" Your total Calorie count is " + Calories+".");
        in.close();
    }
    
}
