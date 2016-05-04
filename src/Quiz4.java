
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating the scanner

        int burger = 0; // integer for burger
        int side = 0; // integer for side order
        int drink = 0; // integer for drink
        int dessert = 0; // integer for dessert

        System.out.println("Hello, welcome to Chip's Fast Food Emporium!"); // addressing the user 
        System.out.println("Please enter burger choice."); // telling user to input their burger choice
        int a = input.nextInt(); // user inputting their burger choice
        if (a == 1) { // if the burger choice is 1 the calories is 461
            burger = 461;
        }
        if (a == 2) { // if the burger choice is 2 the calories is 431
            burger = 431;
        }
        if (a == 3) { // if the burger choice is 3 the calories is 420
            burger = 420;
        }
        if (a == 4) { // if the burger choice is 4 the calories is 0
            burger = 0;
        }

        System.out.println("Please enter a side order choice."); // telling user to input their side order choice
        int b = input.nextInt();

        if (b == 1) { // if the side choice is 1 the calories is 100
            side = 100;
        }
        if (b == 2) { // if the side choice is 2 the calories is 57
            side = 57;
        }
        if (b == 3) { // if the side choice is 3 the calories is 70
            side = 70;
        }
        if (b == 4) { // if the side choice is 4 the calories is 0
            side = 0;
        }

        System.out.println("Please enter a drink choice."); // telling user to input their drink choice
        int c = input.nextInt();

        if (c == 1) { // if the drink choice is 1 the calories is 130
            drink = 130;
        }
        if (c == 2) { // if the drink choice is 2 the calories is 160
            drink = 160;
        }
        if (c == 3) { // if the drink choice is 3 the calories is 118
            drink = 118;
        }
        if (c == 4) { // if the drink choice is 4 the calories is 0
            drink = 0;
        }

        System.out.println("Please enter a dessert choice."); // telling user to input their dessert choice
        int d = input.nextInt();

        if (d == 1) { // if the dessert choice is 1 the calories is 167
            dessert = 167;
        }
        if (d == 2) { // if the dessert choice is 2 the calories is 266
            dessert = 266;
        }
        if (d == 3) { // if the dessert choice is 3 the calories is 75
            dessert = 75;
        }
        if (d == 4) { // if the dessert choice is 4 the calories is 0
            dessert = 0;
        }

        int calories = burger + side + drink + dessert; // adding up the calories
        System.out.println("Your total calorie count is " + calories); // emitting the final calorie count
    }
}
