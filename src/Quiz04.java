
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
        
        Scanner input = new Scanner(System.in);//scanner for the code
        System.out.println("Please input the number of the burger you want");//output this onto the screen
        burger = input.nextInt();//integer burger will be inputted on the next line
        if(burger == 1){//if the number entered is 1
            burger = 461;//buger will have 461 callories
            
        }
        if (burger == 2){//if the number entered is 2
            burger = 431;//buger will have 431 callories
            
        }
        if(burger == 3){//if the number entered is 3
           burger = 420;//buger will have 420 callories
            
        }
        if(burger == 4){//if the number entered is 4
            burger = 0;//buger will have 0 callories
                                
        }
        System.out.println("Please input the number of the soft drink you want");//output this onto the screen
        drink = input.nextInt();//integer drink will be inputted on the next line
        if(drink == 1){//if the number entered is 1
            drink = 130;//drink will have 130 callories
            
        }
        if (drink == 2){//if the number entered is 2
            drink = 160;//drink will have 160 callories
            
        }
        if(drink == 3){//if the number entered is 2
           drink = 118;//drink will have 118 callories
            
        }
        if(drink == 4){//if the number entered is 4
            drink = 0;//drink will have 0 callories
                                
        }
        System.out.println("Please input the number of the side you want");//output this onto the screen
        side = input.nextInt();//integer side will be inputted on the next line
        if(side == 1){//if the number entered is 1
            side = 100;//side will have 100 callories
            
        }
        if (side == 2){//if the number entered is 2
            side = 57;//side will have 57 callories
            
        }
        if(side == 3){//if the number entered is 3
           side = 70;//side will have 70 callories
            
        }
        if(side == 4){//if the number entered is 4
            side = 0;//side will have 0 callories
                                
        }
        System.out.println("Please input the number of the desert you want");//output this onto the screen
        desert = input.nextInt();//integer desert will be inputted on the next line
        if(desert == 1){//if the number entered is 1
            desert = 167;//desert will have 167 callories
            
        }
        if (desert == 2){//if the number entered is 1
            desert = 266;//desert will have 266 callories
            
        }
        if(desert == 3){//if the number entered is 1
           desert = 75;//desert will have 75 callories
            
        }
        if(desert == 4){//if the number entered is 1
            desert = 0;//desert will have 0 callories
                                
        }
        
        int cal = burger + drink + side + desert;//the math that adds up all the callories of your choices
        System.out.println("your calories for this meal are " + cal);//outputs the total number of calories fot the meal you chose
    }
}
