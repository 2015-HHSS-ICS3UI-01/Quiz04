
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int B1 = 461;
        int B2 = 431;
        int B3 = 420;
        int B4 = 0;
        System.out.println("What burger would you like to get?");
        int burger = input.nextInt();
        if(burger == 1){
            burger = B1;
        }
        if(burger == 2){
            burger = B2;
        }
        if(burger == 3){
            burger = B3;
        }
        if(burger == 4){
            burger = B4;
        }
        
        int L1 = 130;
        int L2 = 160;
        int L3 = 118;
        int L4 = 0;   
        System.out.println("What drink would you like to get?");
        int drink = input.nextInt();
        if(drink == 1){
            drink = L1;
        }
        if(drink == 2){
            drink = L2;
        }
        if(drink == 3){
            drink = L3;
        }
        if(drink == 4){
            drink = L4;
        }
        
        int S1 = 100;
        int S2 = 57;
        int S3 = 70;
        int S4 = 0;
        System.out.println("What side would you like to get?");
        int side = input.nextInt();
        if(side == 1){
             side = S1;
        }
        if(side == 2){
            side = S2;
        }
        if(side == 3){
            side = S3;
        }
        if(side == 4){
            side = S4;
        }
        
        int D1 = 167;
        int D2 = 266;
        int D3 = 75;
        int D4 = 0;
        System.out.println("What dessert would you like to get?");
        int dessert = input.nextInt();
        if(dessert == 1){
            dessert = D1;
        }
        if(dessert == 2){
            dessert = D2;
        }
        if(dessert == 3){
            dessert = D3;
        }
        if(dessert == 4){
            dessert = D4;
        }
        
        System.out.println("The total calories consumed is " + (burger + drink + side + dessert));
        
        
    }
}
