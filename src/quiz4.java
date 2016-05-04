
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Chip's Fast Food Emporium");
        
        //ask what choice of burger they want
        System.out.println("Please enter a burger choice:");
        int burger = input.nextInt();
        //change the number choice to calorie count for that choice
        if (burger == 1) {
            burger = burger + 460;
        }
        if (burger == 2) {
            burger = burger + 429;
        }
        if (burger == 3) {
            burger = burger + 417;
        }
        if (burger == 4) {
            burger = burger - 4;
        }
        
        //ask what choice of side order they want
        System.out.println("Please enter a side order choice:");
        int side = input.nextInt();
        //add different amount of calories based on order choice
        if (side == 1) {
            side = side + 99;
        }
        if (side == 2) {
            side = side + 55;
        }
        if (side == 3) {
            side = side + 67;
        }
        if (side == 4) {
            side = side - 4;
        }
        
        //ask what choice of drink they want
        System.out.println("Please enter a drink choice:");
        int drink = input.nextInt();
        //find out which order choice they made, calculate calories
        if (drink == 1) {
            drink = drink + 129;
        }
        if (drink == 2) {
            drink = drink + 158;
        }
        if (drink == 3) {
            drink = drink + 115;
        }
        if (drink == 4) {
            drink = drink - 4;
        }
        
        //ask what choice of dessert they want
        System.out.println("Please enter a dessert choice:");
        int des = input.nextInt();
        //add different amount of calories based on order choice
        if (des == 1) {
            des = des + 166;
        }
        if (des == 2) {
            des = des + 264;
        }
        if (des == 3) {
            des = des + 72;
        }
        if (des == 4) {
            des = des - 4;
        }
        //calculate total calorie count
        int cal = burger + side + drink + des;
        //output total calories
        System.out.println("Your total Calorie count is " + cal + ".");
    }
}