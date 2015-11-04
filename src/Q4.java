
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Chip's Fast Food Emporium");


        //Ask the use what their burger hoice is
        System.out.println("Please enter a burger choice.");
        int burger = input.nextInt();
        //Store the choice
        if (burger == 1) {
            burger = 461;

        }
        if (burger == 2) {
            burger = 431;

        }
        if (burger == 3) {
            burger = 420;

        }
        if (burger == 4) {
            burger = 0;

        }

        //Ask the user their side order choices
        System.out.println("Please enter side order choice.");
        int side = input.nextInt();

        //Store the choice
        if (side == 1) {
            side = 100;

        }
        if (side == 2) {
            side = 57;

        }
        if (side == 3) {
            side = 70;

        }
        if (side == 4) {
            side = 0;

        }

        //Ask the user their drink order choices
        System.out.println("Please enter drink order choice.");
        int drink = input.nextInt();

        //Store the choice
        if (drink == 1) {
            drink = 130;

        }
        if (drink == 2) {
            drink = 160;

        }
        if (drink == 3) {
            drink = 118;

        }
        if (drink == 4) {
            drink = 0;

        }

        //Ask the user their desert order choices
        System.out.println("Please enter desert order choice.");
        int desert = input.nextInt();

        //Store the choice
        if (desert == 1) {
            desert = 167;

        }
        if (desert == 2) {
            desert = 266;

        }
        if (desert == 3) {
            desert = 75;

        }
        if (desert == 4) {
            desert = 0;

        }

        //Calculate the amount of calories for their meal
        int totalCal;
        totalCal = burger + desert + side + drink;

        System.out.println("Your total calorie count is " + totalCal + ".");
    }
}
