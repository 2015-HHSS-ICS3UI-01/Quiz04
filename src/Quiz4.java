
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dhalt0019
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Ask them for a burger choice
        System.out.println("Please enter a burger choice: ");
        int burger = input.nextInt();

        // Ask them for a side choice
        System.out.println("Please enter a side order choice: ");
        int side = input.nextInt();

        // Ask them for a drink choice
        System.out.println("Please enter a drink choice ");
        int drink = input.nextInt();

        // Ask them for a dessert choice
        System.out.println("Please enter a dessert choice ");
        int dessert = input.nextInt();

        // The calories for burgers 1 to 4
        int BCal = 0;

        if (burger == 1) {

            BCal = 461;

        } else if (burger == 2) {

            BCal = 431;

        } else if (burger == 3) {

            BCal = 420;

        } else if (burger == 4) {

            BCal = 0;
        }
        
        
        // The calories for the side dishes 1 to 4
        int SCal = 0;

        if (side == 1) {

            SCal = 100;

        } else if (side == 2) {

            SCal = 57;

        } else if (side == 3) {

            SCal = 70;

        } else if (side == 4) {

            SCal = 0;

        }
        
        
        // The calories for the drinkes 1 to 4
        int DCal = 0;

        if (drink == 1) {

            DCal = 130;

        } else if (drink == 2) {

            DCal = 160;

        } else if (drink == 3) {

            DCal = 118;

        } else if (drink == 4) {

            DCal = 0;
        }
        
        
        // The calories for the desserts 1 to 4
        int DesCal = 0;

        if (dessert == 1) {

            DesCal = 167;

        } else if (dessert == 2) {

            DesCal = 266;

        } else if (dessert == 3) {

            DesCal = 75;

        } else if (dessert == 4) {

            DesCal = 0;
        }

        // Total calories
        int totalCal = BCal + SCal + DCal + DesCal;
        
        // Tell them their total calories
        System.out.println("Your total calorie count is " + totalCal);

    }
}

