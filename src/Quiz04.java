
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int burger;
        int drink;
        int side;
        int desert;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number of the burger you want");
        burger = input.nextInt();
        if(burger == 1){
            burger = 461;
            
        }
        if (burger == 2){
            burger = 431;
            
        }
        if(burger == 3){
           burger = 420;
            
        }
        if(burger == 4){
            burger = 0;
                                
        }
        System.out.println("Please input the number of the soft drink you want");
        drink = input.nextInt();
        if(drink == 1){
            drink = 130;
            
        }
        if (drink == 2){
            drink = 160;
            
        }
        if(drink == 3){
           drink = 118;
            
        }
        if(drink == 4){
            drink = 0;
                                
        }
        System.out.println("Please input the number of the side you want");
        side = input.nextInt();
        if(side == 1){
            side = 100;
            
        }
        if (side == 2){
            side = 57;
            
        }
        if(side == 3){
           side = 70;
            
        }
        if(side == 4){
            side = 0;
                                
        }
        System.out.println("Please input the number of the desert you want");
        desert = input.nextInt();
        if(desert == 1){
            desert = 167;
            
        }
        if (desert == 2){
            desert = 266;
            
        }
        if(desert == 3){
           desert = 75;
            
        }
        if(desert == 4){
            desert = 0;
                                
        }
        
        int cal = burger + drink + side + desert;
        System.out.println("your calories for this meal are " + cal);
    }
}
