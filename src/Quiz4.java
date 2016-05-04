
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

        Scanner input = new Scanner(System.in);

        int burger = 0;
        int side = 0;
        int drink = 0;
        int dessert = 0;

        System.out.println("Hello, welcome to Chip's Fast Food Emporium!");
        System.out.println("Please enter burger choice.");
        int a = input.nextInt();
        if (a == 1) {
            burger = 461;
        }
        if (a == 2) {
            burger = 431;
        }
        if (a == 3) {
            burger = 420;
        }
        if (a == 4) {
            burger = 0;
        }

        System.out.println("Please enter a side order choice.");
        int b = input.nextInt();

        if (b == 1) {
            side = 100;
        }
        if (b == 2) {
            side = 57;
        }
        if (b == 3) {
            side = 70;
        }
        if (b == 4) {
            side = 0;
        }

        System.out.println("Please enter a drink choice.");
        int c = input.nextInt();

        if (c == 1) {
            drink = 130;
        }
        if (c == 2) {
            drink = 160;
        }
        if (c == 3) {
            drink = 118;
        }
        if (c == 4) {
            drink = 0;
        }

        System.out.println("Please enter a dessert choice.");
        int d = input.nextInt();

        if (d == 1) {
            dessert = 167;
        }
        if (d == 2) {
            dessert = 266;
        }
        if (d == 3) {
            dessert = 75;
        }
        if (d == 4) {
            dessert = 0;
        }

        int calories = burger + side + drink + dessert;

        System.out.println("Your total calorie count is " + calories);
    }
}
