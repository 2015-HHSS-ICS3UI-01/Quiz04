
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eadil1765
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Add the good oldscanneraroo
        Scanner input = new Scanner(System.in);

        //Say welcome and ask for the first food choice
        System.out.println(" Welcome to Liam's Fast Food CapFat ");
        System.out.println(" Please enter a burger choice ");

        //Leave space for them to enter a number
        int FirstNumber = input.nextInt();

        //Enter the number of calories in the hiz houz
        if (FirstNumber == 1) {
            FirstNumber = 461;
        }
        if (FirstNumber == 2) {
            FirstNumber = 431;
        }
        if (FirstNumber == 3) {
            FirstNumber = 420;
        }
        if (FirstNumber == 4) {
            FirstNumber = 0;
        }

        //Ask to put in the side order
        System.out.println(" Please enter a side order choice ");

        //Leave space for them to enter a number
        int SecondNumber = input.nextInt();

        //Enter the number of calories in the Hiz Houz pt2
        if (SecondNumber == 1) {
            SecondNumber = 100;
        }
        if (SecondNumber == 2) {
            SecondNumber = 57;
        }
        if (SecondNumber == 3) {
            SecondNumber = 70;
        }
        if (SecondNumber == 4) {
            SecondNumber = 0;
        }

        //Ask for the drank or the stank
        System.out.println(" Please enter a drink choice ");

        //Leave space for them to enter a number
        int ThirdNumber = input.nextInt();

        //Enter the number of calories in the Hiz Houz pt3
        if (ThirdNumber == 1) {
            ThirdNumber = 130;
        }
        if (ThirdNumber == 2) {
            ThirdNumber = 160;
        }
        if (ThirdNumber == 3) {
            ThirdNumber = 118;
        }
        if (ThirdNumber == 4) {
            ThirdNumber = 0;
        }

        //Ask for the dessert choices
        System.out.println(" Please enter a dessert choice ");

        //Leave space for the good old answeraroo
        int FourthNumber = input.nextInt();

        //Enter the number of calories in the Hiz Houz pt4
        if (FourthNumber == 1) {
            FourthNumber = 167;
        }
        if (FourthNumber == 2) {
            FourthNumber = 266;
        }
        if (FourthNumber == 3) {
            FourthNumber = 75;
        }
        if (FourthNumber == 4) {
            FourthNumber = 0;
        }
        
        //Add the cap uparinoo
         System.out.println(" The Amount of Calories is " + (FirstNumber + SecondNumber + ThirdNumber + FourthNumber));

    }
}
