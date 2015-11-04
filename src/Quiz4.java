
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make a new scanner
        Scanner in = new Scanner(System.in);
        
        //welcome the user to the restaruant
        System.out.println("Hello, welcome to Chip's Fast Food Emporium");
        
        //ask user what dessert they would like to order
        System.out.println("Please enter the burger you would like to order:");
        
        //enter in the burger you wish to order
        int burger = in.nextInt();
        
        //ask user what they would like as a side order
        System.out.println("Please enter the side you would like to order:");
        
        //enter in the side you wish to order
        int side = in.nextInt();
        
        //ask user what they would like as a drink
        System.out.println("Please enter the side you would like to order:");
        
        //enter in the side you wish to order
        int drink = in.nextInt();
        
        //ask user what they would like for dessert
        System.out.println("Please enter the dessert you would like to order:");
        
        //enter in the dessert you wish to order
        int dessert = in.nextInt();
        
        //set the int burgerCal to 0
        int burgerCal = 0;
        //give the int burgerCal a value depending on what burger was ordered
        if(burger == 1){
            burgerCal = 461; //Cheeseburger
        }else if(burger == 2){
            burgerCal = 431; //Fish burger
        }else if(burger == 3){
            burgerCal = 420; //Veggie burger
        }else if(burger == 4){
            burgerCal = 0;   //No burger
        }
                
        //set the int sideCal to 0
        int sideCal = 0;
        //give the int sideCal a value depending on what side was ordered
        if(side == 1){
            sideCal = 100; //Fries
        }else if(side == 2){
            sideCal = 57;  //Bakes potato
        }else if(side == 3){
            sideCal = 70;  //Chef salad
        }else if(side == 4){
            sideCal = 0;   //No side
        }
        
        
        //set the int drinkCal to 0
        int drinkCal = 0;
        //give the int drinkCal a value depending on what drink was ordered
        if(drink == 1){
            drinkCal = 130; //Softdrink
        }else if(drink == 2){
            drinkCal = 160; //Orange juice
        }else if(drink == 3){
            drinkCal = 118; //Milk
        }else if(drink == 4){
            drinkCal = 0;   //No drink
        }
        
        //set the int desserCal to 0
        int dessertCal = 0;
        //give the int dessertCal a value depending on what dessert was ordered
        if(dessert == 1){
            dessertCal = 167; //Apple pie
        }else if(dessert == 2){
            dessertCal = 266; //Sundae
        }else if(dessert == 3){
            dessertCal = 75; //Fruit cup
        }else if(dessert == 4){
            dessertCal = 0;   //No dessert
        }
        
        //add up all of the calories
        int totalCal = burgerCal + sideCal + drinkCal + dessertCal;
        
        //output users total calorie count
        System.out.println("Your total calorie count for this meal is " + totalCal);
        
    }
}
