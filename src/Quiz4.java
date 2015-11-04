
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prevw5940
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double BurgerCalorie = 0;
        double DrinkCalorie = 0;
        double SideCalorie = 0;
        double DesertCalorie = 0;
        while(true){
        //Says Welcome to Chip's Fast Food Emporium
        System.out.println("Welcome to Chip's Fast Food Emporium");
        //Asks to input a a burger choice number 1 through 4
        System.out.print("Please enter a burger choice: ");
        double BurgerChoice = input.nextInt();
        //Asks to input a drink choice AKA number 1 through 4
        System.out.print("Please enter a drink choice: ");
        double DrinkChoice = input.nextInt();
        //Asks to input a side order choice AKA number 1 through 4
        System.out.print("Please enter a side order choice: ");
        double SideChoice = input.nextInt();
        //Asks to input a desert choice AKA number 1 through 4
        System.out.print("​Please enter a dessert choice: ");
        double DesertChoice = input.nextInt();
        //If 1 is imputted for the Burger choice, the BurgerCalorie will be 461, 2 will add 431, 3 will add 420 and 4 will ad none/0
        if(BurgerChoice == 1)
        {
            BurgerCalorie = 461;
        }else if(BurgerChoice == 2)
        {
            BurgerCalorie = 431;
        }else if(BurgerChoice == 3)
        {
            BurgerCalorie = 420;
        }else if(BurgerChoice == 4)
        {
            BurgerCalorie = 0;
        }
        //If 1 is imputted for the Drink choice, the DrinkCalorie will be 130, 2 will add 160, 3 will add 118 and 4 will ad none/0
        if(DrinkChoice == 1)
        {
            DrinkCalorie = 130;
        }else if(DrinkChoice == 2)
        {
            DrinkCalorie = 160;
        }else if(DrinkChoice == 3)
        {
            DrinkCalorie = 118;
        }else if(DrinkChoice == 4)
        {
            DrinkCalorie = 0;
        }
        //If 1 is imputted for the Side choice, the SideCalorie will be 100, 2 will add 57, 3 will add 70 and 4 will ad none/0
        if(SideChoice == 1)
        {
            SideCalorie = 100;
        }else if(SideChoice == 2)
        {
            SideCalorie = 57;
        }else if(SideChoice == 3)
        {
            SideCalorie = 70;
        }else if(SideChoice == 4)
        {
            SideCalorie = 0;
        }
        //If 1 is imputted for the Desert choice, the DesertCalorie will be 167, 2 will add 266, 3 will add 75 and 4 will ad none/0
        if(DesertChoice == 1)
        {
            DesertCalorie = 167;
        }else if(DesertChoice == 2)
        {
            DesertCalorie = 266;
        }else if(DesertChoice == 3)
        {
            DesertCalorie = 75;
        }else if(DesertChoice == 4)
        {
            DesertCalorie = 0;
        }
        //Adds Burger, Drink, Side and Desert Calories into the calorie total
        double CalorieTotal = BurgerCalorie + DrinkCalorie + SideCalorie + DesertCalorie;
        //Tells the total calories the order will give
        System.out.println("​your total Calorie count is " + CalorieTotal + ".");
        break;
       }
    }
}
