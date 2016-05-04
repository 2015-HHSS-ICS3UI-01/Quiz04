
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        // create variable for calorie count
        int cal = 0;

        System.out.println("Welcome to Chip's Fast Food Emporium!");
        
        // burger
        System.out.println("Enter your burger choice:");
        // adding burger choice to calorie count
        int burger = input.nextInt();
        if (burger == 1) {
            cal = cal + 461;
        }
        if (burger == 2) {
            cal = cal + 431;
        }
        if (burger == 3) {
            cal = cal + 420;
        }
        if (burger == 4) {
            cal = cal + 0;
        }
        // side order
        System.out.println("Enter your side order choice:");
        int side = input.nextInt();
        // adding side order choice to calorie count
        if (side == 1) {
            cal = cal + 100;
        }
        if (side == 2) {
            cal = cal + 57;
        }
        if (side == 3) {
            cal = cal + 70;
        }
        if (side == 4) {
            cal = cal + 0;
        }
        // drink
        System.out.println("Enter your drink choice:");
        int drink = input.nextInt();
        // adding drink choice to calorie count
        if (drink == 1) {
            cal = cal + 130;
        }
        if (drink == 2) {
            cal = cal + 160;
        }
        if (drink == 3) {
            cal = cal + 118;
        }
        if (drink == 4) {
            cal = cal + 0;
        }
        // dessert
        System.out.println("Enter your dessert choice:");
        int dessert = input.nextInt();
        // adding dessert choice to calorie count
        if (dessert == 1) {
            cal = cal + 167;
        }
        if (dessert == 2) {
            cal = cal + 266;
        }
        if (dessert == 3) {
            cal = cal + 75;
        }
        if (dessert == 4) {
            cal = cal + 0;
        }
        
        System.out.println("Your total Calorie count is " + cal + ".");
    }
}
