
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Chip's Fast Food Emporium");
       
         //User enters which burger they want
        System.out.println("Please enter a burger choice:");
        int burger = input.nextInt();
       //burger 1
        if(burger == 1){
           burger = 461;
       //burger 2
        }else if(burger == 2){
            burger = 431;
        //burger 3
        }else if(burger == 3){
            burger = 420;
       //burger 4
        }else{
            burger = 0;
        }
        
        //User enters which side order they want
        System.out.println("Please enter a side order choice:");
        int side = input.nextInt();
        //side 1
        if(side == 1){
            side = 100;
       //side 2
        }else if(side == 2){
            side = 57;
        //side 3
        }else if(side == 3){
            side = 70;
        //side 4
        }else{
            side = 0;
        }
        //User enters which drink choice they want
        System.out.println("Please enter a drink choice:");
        int drink = input.nextInt();
        //drink 1
        if (drink == 1){
            drink = 130;
       //drink  2
        }else if(drink == 2){
            drink = 160;
        //drink 3
        }else if(drink == 3){
            drink = 118;
        //drink 4
        }else{
            drink = 0;
        }
        
      
        //User enters which dessert choice they want
        System.out.println("Please enter a dessert choice:");
        int dessert = input.nextInt();
        //dessert 1
        if (dessert == 1){
            dessert = 167;
        //dessert 2
        }else if(dessert == 2){
            dessert = 266;
        //dessert 3
        }else if(dessert == 3){
            dessert = 75;
        //dessert 4
        }else{
            dessert = 0;
        }
        
        //Calculating total amount of calories
         int calorie = burger+side+drink+dessert;
         System.out.println("Your total Calorie count is "+calorie+".");
         
    }
}
