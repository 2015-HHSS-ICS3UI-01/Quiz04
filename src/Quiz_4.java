
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Quiz_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //created a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //created a variable named "burgercal" and made it equal to zero
        int burgercal = 0;
        //created a variable named "sideordercal" and made it equal to zero
        int sideordercal = 0;
        //created a variable named "drinkcal" and made it equal to zero
        int drinkcal = 0;
        //created a variable named "dessertcal" and made it equal to zero
        int dessertcal = 0;
        //makes the program display "Welcome to Chip's Fast Food Emporium"
        System.out.println("Welcome to Chip's Fast Food Emporium");
        //makes the program display "Please enter a burger choice: "
        System.out.println("Please enter a burger choice: ");
        //created a variable named "burger" and made it equal to 
        //whatever number the user inputs
        int burger = input.nextInt();
        //if burger equals 1, burgercal will then equal 461
        if (burger == 1) {
            burgercal = 461;
        }
        //if burger equals 2, burgercal will then equal 431
        if (burger == 2) {
            burgercal = 431;
        }
        //if burger equals 3, burgercal will then equal 420
        if (burger == 3) {
            burgercal = 420;
        }
        //if burger equals 4, burgercal will then equal 0
        if (burger == 4) {
            burgercal = 0;
        }
        //makes the program display "Please enter a side order choice: "
        System.out.println("Please enter a side order choice: ");
        //created a variable named "sideorder" and made it equal to 
        //whatever number the user inputs
        int sideorder = input.nextInt();
        //if sideorder equals 1, sideorder cal will then equal 100
        if (sideorder == 1) {
            sideordercal = 100;
        }
        //if sideorder equals 2, sideorder cal will then equal 57
        if (sideorder == 2) {
            sideordercal = 57;
        }
        //if sideorder equals 3, sideorder cal will then equal 70
        if (sideorder == 3) {
            sideordercal = 70;
        }
        //if sideorder equals 4, sideorder cal will then equal 0
        if (sideorder == 4) {
            sideordercal = 0;
        }
        //makes the program display "Please enter a drink choice: "
        System.out.println("Please enter a drink choice: ");
        //created a variable named "drink" and made it equal to 
        //whatever number the user inputs
        int drink = input.nextInt();
        //if drink equals 1, drinkcal will then equal 130
        if (drink == 1) {
            drinkcal = 130;
        }
        //if drink equals 2, drinkcal will then equal 160
        if (drink == 2) {
            drinkcal = 160;
        }
        //if drink equals 3, drinkcal will then equal 118
        if (drink == 3) {
            drinkcal = 118;
        }
        //if drink equals 4, drinkcal will then equal 0
        if (drink == 4) {
            drinkcal = 0;
        }
        //makes the program display "Please enter a dessert choice: "
        System.out.println("Please enter a dessert choice: ");
        //created a variable named "dessert" and made it equal to 
        //whatever number the user inputs
        int dessert = input.nextInt();
        //if dessert equals 1, dessertcal will then equal 167
        if (dessert == 1) {
            dessertcal = 167;
        }
        //if dessert equals 2, dessertcal will then equal 266
        if (dessert == 2) {
            dessertcal = 266;
        }
        //if dessert equals 3, dessertcal will then equal 75
        if (dessert == 3) {
            dessertcal = 75;
        }
        //if dessert equals 4, dessertcal will then equal 0
        if (dessert == 4) {
            dessertcal = 0;
        }
        //created a new variable called "totalcal" and made it equal to
        //burgercal plus sideordercal plus drinkcal plus dessertcal
        int totalcal = (burgercal + sideordercal + drinkcal + dessertcal);
        //makes the program display "Your total Calorie count is " +totalcal + "."
        System.out.println("Your total Calorie count is " + totalcal + ".");
    }
}
