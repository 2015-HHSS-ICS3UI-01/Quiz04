
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a new scanner
        Scanner input = new Scanner(System.in);
        //welcomes person to the restaurant
        System.out.println("Welcome to Chip’s Fast Food Emporium!");

        //burger choice 
        int cheeseBurger = 461;
        int fishBurger = 431;
        int veggieBurger = 420;
        int noBurger = 0;
        //side choice
        int fries = 100;
        int bakedPotatoes = 57;
        int chefSalad = 70;
        int noSideOrder = 0;
        //drink choice
        int softDrink = 130;
        int orangeJuice = 160;
        int milk = 118;
        int noDrink = 0;
        //dessert choice
        int applePie = 167;
        int sundae = 266;
        int fruitCup = 75;
        int noDessert = 0;

        //asks for burger choice
        System.out.print("Please enter a burger choice: ");
        int burgerChoice = input.nextInt();

        if (burgerChoice == 1) {
            burgerChoice = cheeseBurger;
        } else if (burgerChoice == 2) {
            burgerChoice = fishBurger;
        } else if (burgerChoice == 3) {
            burgerChoice = veggieBurger;
        } else if (burgerChoice == 4) {
            burgerChoice = noBurger;
        }
        //asks for side choice
        System.out.print("Please enter a side order choice: ");
        int sideChoice = input.nextInt();

        if (sideChoice == 1) {
            sideChoice = fries;
        } else if (sideChoice == 2) {
            sideChoice = bakedPotatoes;
        } else if (sideChoice == 3) {
            sideChoice = chefSalad;
        } else if (sideChoice == 4) {
            sideChoice = noSideOrder;
        }
        //asks for drink choice
        System.out.print("Please enter a drink choice: ");
        int drinkChoice = input.nextInt();

        if (drinkChoice == 1) {
            drinkChoice = softDrink;
        } else if (drinkChoice == 2) {
            drinkChoice = orangeJuice;
        } else if (drinkChoice == 3) {
            drinkChoice = milk;
        } else if (drinkChoice == 4) {
            drinkChoice = noDrink;
        }
        //asks for dessert choice
        System.out.print("Please enter a dessert choice: ");
        int dessertChoice = input.nextInt();

        if (dessertChoice == 1) {
            dessertChoice = applePie;
        } else if (dessertChoice == 2) {
            dessertChoice = sundae;
        } else if (dessertChoice == 3) {
            dessertChoice = fruitCup;
        } else if (dessertChoice == 4) {
            dessertChoice = noDessert;
        }
        //adds all the calories together
        int totalCal = burgerChoice + sideChoice + drinkChoice + dessertChoice;
        //tells them the number of calories
        System.out.println("Your total Calorie count is " + totalCal);




    }
}
