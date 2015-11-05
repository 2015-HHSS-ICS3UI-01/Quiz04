
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner
        Scanner in = new Scanner(System.in);
        
        //New Intergers to store the variables 
        int burger;
        int drink;
        int side;
        int dessert;
        int calories;

        //Introduces the restraunt to the customer 
        System.out.println("Welcome to Chip’s Fast Food Emporium");

        //Customer chooses burger #
        System.out.println("Please enter a burger choice: ");
        burger = in.nextInt();
        
        //Customer chooses side #
        System.out.println("Please enter a side order choice:");
        side = in.nextInt();
        
        //Customer chooses drink #
        System.out.println("Please enter a drink choice:");
        drink = in.nextInt();
        
        //Customer chooses dessert #
        System.out.println("Please enter a dessert choice:");
        dessert = in.nextInt();

        //Amount of calories in specific burger
        if (burger == 1) {
            burger = 461;
        } else if (burger == 2) {
            burger = 431;
        } else if (burger == 3) {
            burger = 420;
        } else if (burger == 4) {
            burger = 0;
        } 
        
        //Amount of calories in specific side
        if (side == 1) {
            side = 100;
        } else if (side == 2) {
            side = 57;
        } else if (side == 3) {
            side = 70;
        } else if (side == 4) {
            side = 0;
        } 
        
        //Amount of calories in specific drink 
        if (drink == 1) {
            drink = 130;
        } else if (drink == 2) {
            drink = 160;
        } else if (drink == 3) {
            drink = 118;
        } else if (drink == 4) {
            drink = 0;
        } 
        
        //Amount of calories in specific dessert 
        if (dessert == 1) {
            dessert = 167;
        } else if (dessert == 2) {
            dessert = 266;
        } else if (dessert == 3) {
            dessert = 75;
        } else if (dessert == 4) {
            dessert = 0;
        }
        
        //Added all the calories for the different foods into one variable
        calories = (burger + side + drink + dessert);

        //Output our sentence to the user letting them know what they entered
        System.out.println("Your total Calorie count is " + calories);


















    }
}
