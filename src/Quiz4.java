
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class Quiz4 {
    //get how many calories for burger

    public static int calories1(int burger) {

        if (burger == 1) {
            burger = 461;
        } else if (burger == 2) {
            burger = 431;
        } else if (burger == 3) {
            burger = 420;
        } else if (burger == 4) {
            burger = 0;
        }
        return burger;
    }
    //get how many calories for side order

    public static int calories2(int side) {

        if (side == 1) {
            side = 100;
        } else if (side == 2) {
            side = 57;
        } else if (side == 3) {
            side = 70;
        } else if (side == 4) {
            side = 0;
        }
        return side;
    }
    //get how many calories for drink

    public static int calories3(int drink) {

        if (drink == 1) {
            drink = 130;
        } else if (drink == 2) {
            drink = 160;
        } else if (drink == 3) {
            drink = 118;
        } else if (drink == 4) {
            drink = 0;
        }
        return drink;
    }
    //get how many calories for dessert

    public static int calories4(int dessert) {

        if (dessert == 1) {
            dessert = 167;
        } else if (dessert == 2) {
            dessert = 266;
        } else if (dessert == 3) {
            dessert = 75;
        } else if (dessert == 4) {
            dessert = 0;
        }
        return dessert;
    }
    //calculate total calories

    public static void totalcalorie(int c1, int c2, int c3, int c4) {
        int totalcalorie = c1 + c2 + c3 + c4;
        System.out.println("Your total Calorie count is " + totalcalorie);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Chip's Fast Food Emporium");
            //ask user which burger they want
            System.out.println("Here are the three burger choices:");
            System.out.println("1 - Cheeseburger (461 Calories)");
            System.out.println("2 - Fish Burger (431 Calories)");
            System.out.println("3 - Veggie Burger (420 Calories)");
            System.out.println("4 - no burger");
            int burger = input.nextInt();
            //ask user which side order they want
            System.out.println("Here are the three side order choices:");
            System.out.println("1 - Fries (100 Calories)");
            System.out.println("2 - Baked Potato (57 Calories)");
            System.out.println("3 - Chef Salad (70 Calories)");
            System.out.println("4 - no side order");
            int side = input.nextInt();
            //ask user which drink they want
            System.out.println("Here are the three drink choices:");
            System.out.println("1 - Soft Drink (130 Calories)");
            System.out.println("2 - Orange Juice (160 Calories)");
            System.out.println("3 - Milk (118 Calories)");
            System.out.println("4 - no drink");
            int drink = input.nextInt();
            //ask user which dessert they want
            System.out.println("Here are the three dessert choices:");
            System.out.println("1 - Apple Pie (167 Calories)");
            System.out.println("2 - Sundae (266 Calories)");
            System.out.println("3 - Fruit Cup (75 Calories)");
            System.out.println("4 - no dessert");
            int dessert = input.nextInt();

            input.nextLine();
            //bring value of total calories
            totalcalorie(calories1(burger), calories2(side), calories3(drink), calories4(dessert));
            //ask user whether they want to choose menu again or finish the program
            System.out.println("Please type Continue to choose again and End to finish the program");
            String ans = input.nextLine();
            //if use type continue it goes back to choosing burger and if type end it end the program
            if (ans.equals("Continue") || ans.equals("continue") || ans.equals("End") || ans.equals("end")) {
                if (ans.equals("Continue") || ans.equals("continue")) {
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}
