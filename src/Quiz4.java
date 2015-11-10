
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Matt
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int burgerCalorie = 0;
        int drinkCalorie = 0;
        int sideCalorie = 0;
        int dessertCalorie = 0;

        System.out.println("Please enter a burger choice between 1 and 4:");
        int burgerChoice = input.nextInt();

        if (burgerChoice == 1) {
            burgerCalorie = 461;
        }
        if (burgerChoice == 2) {
            burgerCalorie = 431;
        }
        if (burgerChoice == 3) {
            burgerCalorie = 420;
        }
        if (burgerChoice == 4) {
            burgerCalorie = 420;
        }
        if (burgerChoice >= 5) {
            System.out.println("Please select an item from the list given.");
        }

        System.out.println("Please enter a drink choice between 1 and 4:");
        int drinkChoice = input.nextInt();

        if (drinkChoice == 1) {
            drinkCalorie = 130;
        }
        if (drinkChoice == 2) {
            drinkCalorie = 160;
        }
        if (drinkChoice == 3) {
            drinkCalorie = 118;
        }
        if (drinkChoice == 4) {
            drinkCalorie = 0;
        }
        if (drinkChoice >= 5) {
            System.out.println("Please select an item from the list given.");
        }

        System.out.println("Please enter a side choice between 1 and 4:");
        int sideChoice = input.nextInt();

        if (sideChoice == 1) {
            sideCalorie = 100;
        }
        if (sideChoice == 2) {
            sideCalorie = 57;
        }
        if (sideChoice == 3) {
            sideCalorie = 70;
        }
        if (sideChoice == 4) {
            sideCalorie = 0;
        }
        if (sideChoice >= 5) {
            System.out.println("Please select an item from the list given.");
        }

        System.out.println("Please enter a dessert choice between 1 and 4:");
        int dessertChoice = input.nextInt();

        if (dessertChoice == 1) {
            dessertCalorie = 167;
        }
        if (dessertChoice == 2) {
            dessertCalorie = 266;
        }
        if (dessertChoice == 3) {
            dessertCalorie = 75;
        }
        if (dessertChoice == 4) {
            dessertCalorie = 0;
        }

        int totalCalorie = burgerCalorie + sideCalorie + dessertCalorie + drinkCalorie;
        System.out.println("Your total calories for this meal are " + totalCalorie + " calories.");

    }

}
