
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);

        //Greet user
        System.out.println("Welcome to Chip's Fast Food Emporium.");

        //Get user input
        //For the burger:
        System.out.print("Please enter a burger choice: ");
        int burger = input.nextInt();

        //For the side order:
        System.out.print("Please enter a side order choice: ");
        int side = input.nextInt();

        //For the drink:
        System.out.print("Please enter a drink choice: ");
        int drink = input.nextInt();

        //For the dessert choice:
        System.out.print("Please enter a desssert choice: ");
        int dessert = input.nextInt();

        //Create counter for calories
        int CalorieCounter = 0;

        //if statement to deterime calorie count for burger:
        if (burger == 1) {
            CalorieCounter = CalorieCounter + 461;
        } else if (burger == 2) {
            CalorieCounter = CalorieCounter + 431;
        } else if (burger == 3) {
            CalorieCounter = CalorieCounter + 420;
        } else if (burger == 4) {
            CalorieCounter = CalorieCounter + 0;
        }

        //if statement to determine calorie counter for side order:
        if (side == 1) {
            CalorieCounter = CalorieCounter + 100;
        } else if (side == 2) {
            CalorieCounter = CalorieCounter + 57;
        } else if (side == 3) {
            CalorieCounter = CalorieCounter + 70;
        } else if (side == 4) {
            CalorieCounter = CalorieCounter + 0;
        }

        //if statement to determine calorie counter for drink:
        if (drink == 1) {
            CalorieCounter = CalorieCounter + 130;
        } else if (drink == 2) {
            CalorieCounter = CalorieCounter + 160;
        } else if (drink == 3) {
            CalorieCounter = CalorieCounter + 118;
        } else if (drink == 4) {
            CalorieCounter = CalorieCounter + 0;
        }

        //if statement to determine calorie counter for dessert:
        if (dessert == 1) {
            CalorieCounter = CalorieCounter + 167;
        } else if (dessert == 2) {
            CalorieCounter = CalorieCounter + 266;
        } else if (dessert == 3) {
            CalorieCounter = CalorieCounter + 75;
        } else if (dessert == 4) {
            CalorieCounter = CalorieCounter + 0;
        }

        //tell user calorie intake
        System.out.println("Your total calorie count is " + CalorieCounter);
    }
}
