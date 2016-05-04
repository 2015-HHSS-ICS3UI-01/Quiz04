
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //Ask for a burger choice
        System.out.println("what burger would you like");
        //Give the person the opportunity to input the type of burger they want, which is then stored in the variable  
        int burger = input.nextInt();

        //Ask for a side choice 
        System.out.println("What side would you like ");
        //Give the person the opportunity to input the type of side they want, which is then stored in the variable
        int side = input.nextInt();

        //Ask for a drink choice  
        System.out.println("Whats drink would you like");
        //Give the person the opportunity to input the type of drink they want, which is then stored in the variable
        int drink = input.nextInt();

        //Ask for a desert choice
        System.out.println(" what dessert would you like ");
        //Give the person the opportunity to input the type of desert they want, which is then stored in the variable
        int dessert = input.nextInt();

        //Create int to store the burger variable 
        int KCalB = 0;
        //if they choose burger #1, set the calorie intake to 462KCal
        if (burger == 1) {
            KCalB = 462;
            //if they choose burger #2, set the calorie intake to 431KCal
        } else if (burger == 2) {
            KCalB = 431;

            //if they choose burger #3, set the calorie intake to 420KCal
        } else if (burger == 3) {
            KCalB = 420;
            //if they choose burger #4,set the calories intake to 0KCal
        } else if (burger == 4) {
            KCalB = 0;
        }

        //Create int to store the side variable
        int KCalS = 0;
        //if they choose side #1, set the calorie intake to 100KCal
        if (side == 1) {
            KCalS = 100;
            //if they choose side #2, set the calorie intake to 57KCal 
        } else if (side == 2) {
            KCalS = 57;
            //if they choose side #3, set the calorie intake to 70KCal
        } else if (side == 3) {
            KCalS = 70;
            //if they choose side #4, set the calorie intake to 0KCal
        } else if (side == 4) {
            KCalS = 0;
        }

        //Create int to store the drink variable
        int KCalDr = 0;
        //if they choose drink #1, set the calorie intake to 130KCal 
        if (drink == 1) {
            KCalDr = 130;
            //if they choose drink #2, set the calorie intake to 160KCal
        } else if (drink == 2) {
            KCalDr = 160;
            //if they choose drink #3, set the calorie intake to 118KCal 
        } else if (drink == 3) {
            KCalDr = 118;
            //if they choose drink #4, set the calorie intake to 0KCal 
        } else if (drink == 4) {
            KCalDr = 0;
        }

        //Create int to store the dessert variable
        int KCalDs = 0;
        //if they choose dessert #1, set the calorie intake to 167KCal 
        if (dessert == 1) {
            KCalDs = 167;
            //if they choose dessert #2, set the calorie intake to 266KCal  
        } else if (dessert == 2) {
            KCalDs = 266;
            //if they choose dessert #3, set the calorie intake to 75KCal 
        } else if (dessert == 3) {
            KCalDs = 75;
            //if they choose dessert #4, set the calorie intake to 0KCal  
        } else if (dessert == 4) {
            KCalDs = 0;
        }

        //Add up the total calores and store in the variable called "TOTALKCal" 
        int TOTALKCal = KCalB + KCalS + KCalDr + KCalDs;
        //Tell the person how many calories they are intaking with the above choices 
        System.out.println(" Your total Calorie count is " + TOTALKCal + ".");

    }

}
