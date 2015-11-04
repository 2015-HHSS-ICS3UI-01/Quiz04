
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fitws6356
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Chip's Fast Food Emporium.");
        //allow user to type in his/her order
        System.out.println("Please enter your choice of burger.");
        int burger = input.nextInt();
        System.out.println("Please enter your choice of a side.");
        int sideOrder = input.nextInt();
        System.out.println("Please enter your choice of a drink.");
        int drink = input.nextInt();
        System.out.println("Please enter your choice of a dessert.");
        int dessert = input.nextInt();
        //write in how many calories each item contains
        if (burger == 1) {
            burger = 461;
        } else if (burger == 2) {
            burger = 431;
        } else if (burger == 3) {
            burger = 420;
        } else if (burger == 4) {
            burger = 0;
        }
        if (sideOrder == 1) {
            sideOrder = 100;
        } else if (sideOrder == 2) {
            sideOrder = 57;
        } else if (sideOrder == 3) {
            sideOrder = 70;
        } else if (sideOrder == 4) {
            sideOrder = 0;
        }
        if (drink == 1) {
            drink = 130;
        } else if (drink == 2) {
            drink = 160;
        } else if (drink == 3) {
            drink = 118;
        } else if (drink == 4) {
            drink = 0;
        }
        if (dessert == 1) {
            dessert = 167;
        } else if (dessert == 2) {
            dessert = 266;
        } else if (dessert == 3) {
            dessert = 75;
        } else if (dessert == 4) {
            dessert = 0;
        }
        //calculate how many calories are in the customer's entire order
         int calorieTotal = burger + sideOrder + drink + dessert;
         System.out.println("Your total Calorie count is " + calorieTotal + ".");
         
    }
}