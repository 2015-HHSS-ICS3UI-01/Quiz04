
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxia2242
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaring Variables or Asking for them
        int CT = 0;
        String BO = " ";
        String DO = " ";
        String SO = " ";
        String UO = " ";
        Scanner FOM = new Scanner(System.in);
        System.out.println("Please enter a burger choice:");
        int BC = FOM.nextInt();
        System.out.println("Please enter a side order choice:");
        int SC = FOM.nextInt();
        System.out.println("Please enter a drink choice:");
        int DC = FOM.nextInt();
        System.out.println("Please enter a dessert choice:");
        int UC = FOM.nextInt();
        
        //processing the given numbers 
        if(BC == 1){
            CT = CT + 461;
            BO = " Cheeseburger";
        }else if(BC == 2){
            CT = CT + 431;
            BO = " Fish Burger";
        }else if(BC == 3){
            CT = CT + 420;
            BO = " Veggie Burger";
        }else if (BC ==4){
            CT = CT + 0;
            BO = " No Burger";
        }
        
        if(SC == 1){
            CT = CT +100;
            SO = "Fries";
        }else if(SC ==2 ){
            CT = CT + 57;
            SO = "Baked Potato";
        }else if(SC ==3){
            CT = CT +70;
            SO = "Chef Salad";
        }else if(SC ==4){
            CT = CT+0;
            SO = "No Side Order";
        }else {
            
        }
        
        if(DC == 1){
            CT =CT+130;
            DO = "Soft Drink";
        }else if(DC == 2){
            CT = CT + 160;
            DO = "Orange Juice";
        }else if(DC ==3){
            CT =CT +118;
            DO = "Milk";
        }else if(DC ==4){
            CT = CT + 0;
            DO = "no Drink";
        }
        
        if(UC == 1){
            CT = CT + 167;
            UO = "Apple Pie";
        }else if(UC ==2){
            CT = CT + 266;
            UO = "Sundae";
        }else if(UC == 3){
            CT = CT+75;
            UO = "Fruit Cup";
        }else if(UC ==4){
            CT = CT+0;
            UO = "No Dessert";
        }
        
        // Outputing processed numbers 
        System.out.println("Your Burger order was " + BO);
        System.out.println("Your Side order was " + SO);
        System.out.println("Your Dessert order was " + UO);
        System.out.println("Your Drink order was " + DO);
        System.out.println("Your total Calorie count is " + CT); 
        
        
            
        
            
            
        
       
}
}
