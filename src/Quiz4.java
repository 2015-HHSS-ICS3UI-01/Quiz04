
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //import a scanner 
        Scanner input = new Scanner(System.in);
        
        //say "Welcome to Chip’s Fast Food Emporium "
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        
        //ask for their burger choice
        System.out.println("Please enter a burger choice: ");
        int burger = input.nextInt();
        
        //if the 1st burger is picked they eat 461 calories
        if(burger == 1) {
            burger = 461;
        } //if the 2nd burger is picked they eat 431 calories
        else if(burger == 2) {
            burger = 431;
        } //if the 3rd burger is picked they eat 420 calories
        else if(burger == 3) {
            burger = 420;
        } //if the 4th burger is picked they eat 0 calories
        else if(burger == 4) {
            burger = 0;
        }
        
        //ask for their side order choice
        System.out.println("Please enter a side order choice: ");
        int side = input.nextInt();
        
        //if the 1st side is picked they eat 100 calories
        if(side == 1) {
            side = 100;
        } //if the 2nd side is picked they eat 57 calories
        else if(side == 2) {
            side = 57;
        } //if the 3rd side is picked they eat 70 calories
        else if(side == 3) {
            side = 70;
        } //if the 4th side is picked they eat 0 calories
        else if(side == 4) {
            side = 0;
        }
        
        //ask for their drink choice
        System.out.println("Please enter a drink choice: ");
        int drink = input.nextInt();
        
        //if the 1st drink is picked they drink 130 calories
        if(drink == 1) {
            drink = 130;
        } //if the 2nd drink is picked they drink 160 calories
        else if(drink == 2) {
            drink = 160;
        } //if the 3rd drink is picked they drink 118 calories 
        else if(drink == 3) {
            drink = 118;
        } //if the 4th drink is picked they drink 0 calories
        else if(drink == 4) {
            drink = 0;
        }
        
        //ask for their dessert choice
        System.out.println("Please enter a dessert choice: ");
        int dessert = input.nextInt();
        
        //if the 1st dessert is picked they eat 167 calories
        if(dessert == 1) {
            dessert = 167;
        } //if the 2nd dessert is picked they eat 266 calories
        else if(dessert == 2) {
            dessert = 266;
        } //if the 3rd dessert is picked they eat 75 calories
        else if(dessert == 3) {
            dessert = 75;
        } //if the 4th dessert is picked they eat 0 calories
        else if(dessert == 4) {
            dessert = 0;
        }
        
        //add up the total calories
        int total = burger + side + drink + dessert;
        //your total number of calories is
        System.out.println("Your total Calorie count is " + total + ".");
        
        
    }
}
