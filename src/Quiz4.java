
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // asks user to enter a number
        System.out.println("Please enter a burger choice:");
        // stores the number that the user put in
        int burger = input.nextInt();
        System.out.println("Please enter a side order choice:");
        int side = input.nextInt();
        System.out.println("Please enter a drink choice:");
        int drink = input.nextInt();
        System.out.println("Please enter a dessert choice:");
        int dessert = input.nextInt();
        // if number was 1
        if (burger == 1) {
            // stores new integer, which is the number of calories
            burger = 461;
        }
        //  if number was 2
        if (burger == 2) {
            burger = 431;
        }
        // if number was 3
        if (burger == 3) {
            burger = 420;
        }
        // if number was 4
        if (burger == 4) {
            burger = 0;
        }
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
        if (dessert == 1) {
            dessert = 167;
        }
        if (dessert == 2) {
            dessert = 266;
        }
        if (dessert == 3) {
            dessert = 75;
        }
        if (dessert == 4) {
            dessert = 0;
        }
        // adds all the new integers 
        int calories = burger + side + drink + dessert;
        // outputs the final number of calories
        System.out.println("Your total Calorie count is " + calories + ".");
    }
}

