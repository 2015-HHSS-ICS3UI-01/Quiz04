
import java.util.Scanner;
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author godie2014
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inport Scanner
        Scanner input = new Scanner(System.in);
        int calories = 0;

        //Greet user
        System.out.println("Welcome to Chip’s Fast Food Emporium ");
        
        //Ask user to enter a burger choice
        System.out.println("Please enter a burger choice");

        int burger = input.nextInt();
        //Calories for each burger choice
        if (burger == 1) {
            calories = calories + 461;

        }
        if (burger == 2) {
            calories = calories + 431;

        }
        if (burger == 3) {
            calories = calories + 420;

        } else {
            calories = calories + 0;
            //Ask user to enter a side order choice
            System.out.println("Please enter a side order choice");

            int side = input.nextInt();
            //Calories for each side order
            if (side == 1) {
                calories = calories + 100;

            }
            if (side == 2) {
                calories = calories + 57;

            }
            if (side == 3) {
                calories = calories + 70;

            } else {
                calories = calories + 0;

                //Ask user to enter a drink choice
                System.out.println("Please enter a drink choice");

                int drink = input.nextInt();
                //calories for each drink
                if (drink == 1) {
                    calories = calories + 130;

                }
                if (drink == 2) {
                    calories = calories + 160;

                }
                if (drink == 3) {
                    calories = calories + 118;

                } else {
                    calories = calories + 0;

                    //Ask user to enter a dessert choice
                    System.out.println("Please enter a dessert choice");

                    int dessert = input.nextInt();
                    //Calories for each dessert
                    if (dessert == 1) {
                        calories = calories + 167;

                    }
                    if (dessert == 2) {
                        calories = calories + 266;

                    }
                    if (dessert == 3) {
                        calories = calories + 75;

                    } else {
                        calories = calories + 0;
                        //Tell user what their total Calorie count is
                        System.out.println("Your total Calorie count is " + calories);

                        input.close();

                    }
                }
            }
        }
    }
}
