
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make Scanner
        Scanner input = new Scanner(System.in);
        //Make scanner output "Welcome to Chip’s Fast Food Emporium"
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        //Ask user to pick a dessert
        System.out.println("Please enter a burger choice:");
        //Integer for burgers
        int burgers = input.nextInt();
        //Integer for burger calories
        int bCal = (burgers);
        //Cheeseburger
        if (burgers == 1) {
            //Cheeseburger calories
            bCal = 461;
            //Fish Burger
        } else if (burgers == 2) {
            //Fish Burger calories
            bCal = 431;
            //Veggie Burger
        } else if (burgers == 3) {
            //Veggie Burger calories
            bCal = 420;
            //No burger
        } else if (burgers == 4) {
            //No calories
            bCal = 0;
        }
        //Ask user to pick a dessert
        System.out.println("Please enter a side order choice:");
        //Integer for side orders
        int sideOrder = input.nextInt();
        //Integer for side order calories
        int sCal = (sideOrder);
        //Fries
        if (sideOrder == 1) {
            //Fries calories
            sCal = 100;
            //Baked Potato
        } else if (sideOrder == 2) {
            //Baked Potato calories
            sCal = 57;
            //Chef Salad
        } else if (sideOrder == 3) {
            //Chef Salad calories
            sCal = 70;
            //No side order
        } else if (sideOrder == 4) {
            //No calories
            sCal = 0;
        }
        //Ask user to pick a dessert
        System.out.println("Please enter a drink choice:");
        //Integer for drinks
        int drink = input.nextInt();
        //Integer for drink calories
        int dCal = (drink);
        //Soft Drink
        if (drink == 1) {
            //Soft Drink calories
            dCal = 130;
            //Orange Juice
        } else if (drink == 2) {
            //Orange Juice calories
            dCal = 160;
            //Milk
        } else if (drink == 3) {
            //Milk calories
            dCal = 118;
            //No drink
        } else if (drink == 4) {
            //No calories
            dCal = 0;
        }
        //Ask user to pick a dessert
        System.out.println("Please enter a dessert choice:");
        //Integer for dessert
        int dessert = input.nextInt();
        //Integer for dessert calories
        int dsCal = (dessert);
        //Apple Pie
        if (dessert == 1) {
            //Apple Pie calories
            dsCal = 167;
            //Sundae
        } else if (dessert == 2) {
            //Sundae calories
            dsCal = 226;
            //Fruit Cup
        } else if (dessert == 3) {
            //Fruit Cup calories
            dsCal = 75;
            //No dessert
        } else if (dessert == 4) {
            //No calories
            dsCal = 0;
        }
        //Adds calories of all orders together for a final amount
        int totalCals = bCal + dCal + sCal + dsCal;
        //Outputs total amount of calories for order
        System.out.println("Your total Calorie count is " + totalCals + ".");
        //Finish with scanner
        input.close();
    }
}
