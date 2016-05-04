
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create variables so they exist outside of the if statements
        int cal1 = 0;
        int cal2 = 0;
        int cal3 = 0;
        int cal4 = 0;
        //create scanner to scan for inputs
        Scanner input = new Scanner(System.in);
        //welcome guests and show them the fetch menu and get their order
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        System.out.println("Here are the three burger choices: \n"
                + "1 – Cheeseburger (461 Calories)   \n"
                + "2 – Fish Burger (431 Calories)  \n"
                + "3 – Veggie Burger (420 Calories) \n"
                + "4 – no burger");
        System.out.println("Which number of burger would you like?");
        //store order and calculate number of calories
        int burger = input.nextInt();
        if (burger == 1) {
            cal1 = 461;
        }
        if (burger == 2) {
            cal1 = 431;
        }
        if (burger == 3) {
            cal1 = 420;
        }
        if (burger == 4) {
            cal1 = 0;
        }
        //show guest menu and ask which side they would like
        System.out.println("Here are the three side order choices: \n"
                + "1 – Fries (100 Calories)  \n"
                + "2 – Baked Potato (57 Calories)  \n"
                + "3 – Chef Salad (70 Calories)   \n"
                + "4 – no side order ");
        System.out.println("Which number of side would you like?");
        //store order and calculate number of calories
        int side = input.nextInt();
        if (side == 1) {
            cal2 = 100;
        }
        if (side == 2) {
            cal2 = 57;
        }
        if (side == 3) {
            cal2 = 70;
        }
        if (side == 4) {
            cal2 = 0;
        }
        //show guest the menu and ask them what they would like
        System.out.println("Here are the three drink choices:\n"
                + "1 – Soft Drink (130 Calories)  \n"
                + "2 – Orange Juice (160 Calories)  \n"
                + "3 – Milk (118 Calories)\n"
                + "4 – no drink");
        System.out.println("Which number of drink would you like?");
        //store and calculate the number of calories
        int drink = input.nextInt();
        if (drink == 1) {
            cal3 = 130;
        }
        if (drink == 2) {
            cal3 = 160;
        }
        if (drink == 3) {
            cal3 = 118;
        }
        if (drink == 4) {
            cal3 = 0;
        }
        //show the coustomer the menu and ask what they would like
        System.out.println("Here are the three dessert choices:  \n"
                + "1 – Apple Pie (167 Calories)  \n"
                + "2 – Sundae (266 Calories)\n"
                + "3 – Fruit Cup (75 Calories)\n"
                + "​4 – no dessert");
        System.out.println("Which number of dessert would you like?");
        //store order and calculate the number of calories
        int dessert = input.nextInt();
        if (dessert == 1) {
            cal4 = 167;
        }
        if (dessert == 2) {
            cal4 = 266;
        }
        if (dessert == 3) {
            cal4 = 75;
        }
        if (dessert == 4) {
            cal4 = 0;
        }
        //total the number of calories and output it to the user
        int total = (cal1 + cal2 + cal3 + cal4);
        System.out.println("Thanks for ordering with Chip’s Fast Food Emporium"
                + "the total number of calories in your meal are " + total + " calories.");
    }
}
