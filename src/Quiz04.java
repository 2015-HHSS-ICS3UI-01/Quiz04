
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class Quiz04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//create new sanner
    Scanner input = new Scanner(System.in);
//welcome message
    System.out.println("Welcome to Chip’s Fast Food Emporium");
//ask user what buger they woukd like
    System.out.println("what burger would you like");
//allow user to enter burger choice
    int burger = input.nextInt();
//ask user what side they would like
    System.out.println("What side would you like ");
//allow user to enter side
    int side = input.nextInt();
//ask the user what drink they would like
    System.out.println("Whats drink would you like");
//allow user to enter there drink choice
    int drink = input.nextInt();
//ask user what dessert they would like
    System.out.println(" what desert would you like ");
//allow user to enter a choice of drink and store it in a variable
    int dessert = input.nextInt();
//if buger choice is number 1
//burger calories varaible
     int  burgerCal = 0;
    if (burger == 1) {
// set burger calories to 462
          burgerCal = 462;
//if burger choice is 2,set calories to 431
        } else if (burger == 2) {
          burgerCal = 431;
//if burger choice is option 3,set calories to 420
       } else if (burger == 3) {
          burgerCal = 420;
//if burger choice is option 4 ,set calories to 0
       } else if (burger == 4) {
          burgerCal = 0;
       }
// if side is choice one ,set calories too 100
      int sidecal = 0;
      if (side == 1) {
          sidecal = 100;
//if side is choice 2 ,set calories to 57
       } else if (side == 2) {
           sidecal = 57;
           // if side is choice 3 ,set calories to 70
       } else if (side == 3) {
           sidecal = 70;
           // if side is choice 4 ,set calories to 0
       } else if (side == 4) {
           sidecal = 0;
       }
         int drinkcal = 0;
       //if drink choice is option 1 then,set calories to 130
       if (drink == 1) {
           drinkcal = 130;
           //if drink choice is option 2 then,set calories to 160
       } else if (drink == 2) {
           drinkcal = 160;
           //if drink choice is option 3 then,set calories 118
       } else if (drink == 3) {
           drinkcal = 118;
//if drink choice is option 4 then,set calories to 0
       } else if (drink == 4) {
           drinkcal = 0;
       }
         int dessertcal = 0;
// if desert is choice one then ,set calories to 167
       if (dessert == 1) {
           dessertcal = 167;
           // if desert is choice one then ,set calories to 266
       } else if (dessert == 2) {
           dessertcal = 266;
           // if desert is choice one then ,set calories to 75
       } else if (dessert == 3) {
           dessertcal = 75;
           // if desert is choice one then ,set calories to 0
       } else if (dessert == 4) {
           dessertcal = 0;
       }
 //caluclate total amount of calories and store it in a variable called "totalcal"
        int totalcal= burgerCal+sidecal+drinkcal+dessertcal;

// let user know how many calories they consumed
        System.out.println(" Your total Calorie count is " + totalcal);
 
    
    
    
    
    
    
    
    
    
    
   }
}
