
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);//set scanner
        
        
        System.out.println("Welcome to Chip’s Fast Food Emporium");//greets user
         
        System.out.print("Please enter a burger choice: "); //asks user for choice of food
        int burger = in.nextInt();//sets variable as next inputed integer by user

        int burgerc = 0;//set burger calories variable at 0

        if (burger == 1) { //add in calories for each type of burger
            burgerc = 461;
        }


        if (burger == 2) {
            burgerc = 431;
        }

        if (burger == 3) {
            burgerc = 420;
        }

        if (burger == 4) {
            burgerc = 0;
        }

        System.out.print("Please enter a side order choice: ");//asks user for choice of food
        int side = in.nextInt();//sets variable as next inputed integer by user

        int sidec = 0;//set side order calories variable at 0

        if (side == 1) {//add in calories for each type of side
            sidec = 100;
        }

        if (side == 2) {
            sidec = 57;
        }

        if (side == 3) {
            sidec = 70;
        }

        if (side == 4) {
            sidec = 0;
        }
        System.out.print("Please enter a drink choice: ");//asks user for choice of food
        int drink = in.nextInt();//sets variable as next inputed integer by user

        int drinkc = 0;//set drink calories variable at 0

        if (drink == 1) {//add in calories for each type of drink
            drinkc = 130;
        }

        if (drink == 2) {
            drinkc = 160;
        }

        if (drink == 3) {
            drinkc = 118;
        }

        if (drink == 4) {
            drinkc = 0;
        }
        System.out.print("Please enter a dessert choice: ");//asks user for choice of food
        int dessert = in.nextInt();//sets variable as next inputed integer by user

        int dessertc = 0;//set dessert calories variable at 0

        if (dessert == 1) {//add in calories for each type of dessert
            dessertc = 167;
        }

        if (dessert == 2) {
            dessertc = 266;
        }

        if (dessert == 3) {
            dessertc = 75;
        }

        if (dessert == 3) {
            dessertc = 75;
        }

        int totalc = burgerc + sidec + drinkc + dessertc; // set variable for total calories as sum of all calories of food


        System.out.println("Your total Calorie count is " + totalc + "."); // print out final calorie count to screen
    }
}
