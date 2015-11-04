
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        //create scanner
        Scanner input = new Scanner(System.in);
        //assign total calorie count to variable "totalCal"
        int totalCal = 0;
        
        //ask user to choose a burger
        System.out.println("Choose a Burger:");        
        //assign burger choice to variable "burger
        int burger = input.nextInt();        
        //check what type of burger user selected, then add the appropriate calorie count to "totalCal"
        if(burger == 1){
            totalCal = 461;
        }else if(burger == 2){
            totalCal = 431;
        }else if(burger == 3){
            totalCal = 420;
        }else if(burger == 4){
            totalCal = 0;
        }
        
        System.out.println("Choose a Side: ");
        
        int side = input.nextInt();
        
        if(side == 1){
            totalCal = totalCal + 100;
        }else if(side == 2){
            totalCal = totalCal + 57;
        }else if(side == 3){
            totalCal = totalCal + 70;
        }else if(side == 4){
            totalCal = totalCal + 0;
        }
        
        System.out.println("Choose a Drink: ");
        
        int drink = input.nextInt();
        
        if(drink == 1){
            totalCal = totalCal + 130;
        }else if(drink == 2){
            totalCal = totalCal + 160;
        }else if(drink == 3){
            totalCal = totalCal + 118;
        }else if(drink == 4){
            totalCal = totalCal + 0;
        }
        
        System.out.println("Choose a Dessert: ");
        
        int dessert = input.nextInt();
        
        if(dessert == 1){
            totalCal = totalCal + 167;
        }else if(dessert == 2){
            totalCal = totalCal + 266;
        }else if(dessert == 3){
            totalCal = totalCal + 75;
        }else if(dessert == 4){
            totalCal = totalCal + 0;
        }
        //display total calorie count
        System.out.println("Total calorie count for this meal: " + totalCal);
        
        
    }
}
