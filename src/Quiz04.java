
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a new scanner
        Scanner input = new Scanner(System.in);
        // Welcome the customer/user
        System.out.println("Welcome to Chip's Fast Food Emporium!");

        // Ask the user to choose a burger
        System.out.println("Please enter a burger choice.");
        // Assign the user's burger choice to variabele 'burger'
        int burger = input.nextInt();
        // Assign the user's total calorie count of the burger to variable 'burgercal'
        int burgercal = 0;
        // User's burger choice's and their calorie count
        if (burger == 1) {
            burgercal = 461;
        } else if (burger == 2) {
            burgercal = 431;
        } else if (burger == 3) {
            burgercal = 420;
        } else if (burger == 4) {
            burgercal = 0;
        }

        // Ask the user to choose a side
        System.out.println("Please enter a side choice.");
        // Assign the user's side choice to varaible 'side'
        int side = input.nextInt();
        // Assign the user's total calorie count of the side to variable 'sidecal'
        int sidecal = 0;
        // User's side choice's and their calorie count
        if (side == 1) {
            sidecal = 100;
        } else if (side == 2) {
            sidecal = 57;
        } else if (side == 3) {
            sidecal = 70;
        } else if (side == 4) {
            sidecal = 0;
        }

        // Ask the user to choose a drink 
        System.out.println("Please enter a drink choice.");
        // Assign  the user's drink choice to variable 'drink'
        int drink = input.nextInt();
        // Assign the user's total calorie count of the drink to variable 'drinkcal'
        int drinkcal = 0;
        // User's drink choice's and their calorie count
        if (drink == 1) {
            drinkcal = 130;
        } else if (drink == 2) {
            drinkcal = 160;
        } else if (drink == 3) {
            drinkcal = 118;
        } else if (drink == 4) {
            drinkcal = 0;
        }

        // Ask the user to choose a dessert 
        System.out.println("Please enter a dessert choice.");
        // Assign the user's dessert choice to variable 'dessert'
        int dessert = input.nextInt();
        // Assign the user's total calorie count of the dessert to variable 'dessertcal'
        int dessertcal = 0;
        // User's dessert choice's and their calorie count
        if (dessert == 1) {
            dessertcal = 167;
        } else if (dessert == 2) {
            dessertcal = 266;
        } else if (dessert == 3) {
            dessertcal = 75;
        } else if (dessert == 4) {
            dessertcal = 0;
        }

        // Add all the calories together
        int totalcal = burgercal + sidecal + drinkcal + dessertcal;
        // Output the user's total calorie count
        System.out.println("Your total calorie count is " + totalcal + ".");
    }
}
