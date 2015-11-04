
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner
        
        Scanner input = new Scanner(System.in);
        
        //make a variable for total calories
        
        int calories = 0;
        
        //tell user to chose a burger
        
        System.out.println("Please enter a burger choice.");
        
        //store burger choice in a variable
        
        int burger = input.nextInt();
        
        //determine which choice user selected and add the calories
        
        if (burger == 1){
            calories = calories + 461;
            
        }if (burger == 2){
            calories = calories + 431;  
            
        }if (burger == 3){
            calories = calories + 420;
            
        }else{ calories = calories + 0;
        
        }
        
        
        
        //tell user to choose a side order
        
        System.out.println("Please enter a side order choice.");
        
        //store the side oder choice in a variable
        
        int sideChoice = input.nextInt();
        
        //determine which choice user selected and add the calories
        
        if (sideChoice == 1){
            calories = calories + 100;
            
        }if (sideChoice == 2){
            calories = calories + 57;
        
        }if (sideChoice == 3){
            calories = calories + 70;
            
        }else{ calories = calories + 0;
        
        }
        
        
        //tell user to choose a drink
        
        System.out.println("Please enter a drink choice.");
        
        //store the drink choice in a variable
        
        int drink = input.nextInt();
        
        //determine which choice user selected and add the calories
        
        if (drink == 1){
            calories = calories + 130;
            
        }else if (drink == 2){
            calories = calories + 160;
            
        }if (drink == 3){
            calories = calories + 118;
            
        }else{
            calories = calories + 0; 
        }
        
       
        
        //tell user to choose a dessert
        
        System.out.println("Please enter a dessert choice.");
        
        //store the dessert choice in a variable
        
        int dessert = input.nextInt();
        
        //determine which choice user selected and add the calories
        
        if (dessert == 1){
            calories = calories + 167;
            
        }if (dessert == 2){
            calories = calories + 266;
            
        }if (dessert == 3){
            calories = calories + 75;
            
        }else{ calories = calories + 0;
        
        }
        
        
        //tell user their total calorie count
        
        System.out.println("Your calorie count is " + calories);
        
        
        //close scanner
        
        input.close();
        }}
        

