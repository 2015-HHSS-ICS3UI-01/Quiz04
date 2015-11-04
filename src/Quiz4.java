
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make Scanner
        Scanner input = new Scanner (System.in);
        
         //Ask Questions 
        System.out.print("Enter your burger choice: ");
        int FirstChoice = input.nextInt();
        
        System.out.print("Enter your drink choice: ");
        int drinkChoice = input.nextInt();
        
        System.out.print("Enter the side order choice: ");
        int sideChoice = input.nextInt();
        
        
        System.out.print("Enter your desert choice: ");
        int desertChoice = input.nextInt();
        
        //Burger Choice
      if (FirstChoice == 1 ){
          FirstChoice = 461;
      } else if (FirstChoice == 2 ){
          FirstChoice = 431;
      } else if (FirstChoice == 3){
          FirstChoice = 420;
      } else if (FirstChoice == 4){
          FirstChoice = 0;
      }
      //Drink Choice
      if (drinkChoice == 1 ){
          drinkChoice = 120;
      } else if (drinkChoice == 2 ){
          drinkChoice = 160;
      } else if (drinkChoice == 3){
          drinkChoice = 118;
      } else if (drinkChoice == 4){
          drinkChoice = 0;
      }
      
     //Side Choice
      if (sideChoice == 1 ){
          sideChoice = 100;
      } else if (sideChoice == 2 ){
          sideChoice = 57;
      } else if (sideChoice == 3){
          sideChoice = 70;
      } else if (sideChoice == 4){
          sideChoice = 0;
      }
        
      //Desert Choice
      if (desertChoice == 1 ){
          desertChoice = 167;
      } else if (desertChoice == 2 ){
          desertChoice = 266;
      } else if (desertChoice == 3){
          desertChoice = 75;
      } else if (desertChoice == 4){
          desertChoice = 0;
      }
     
     int TotalC = FirstChoice + sideChoice + drinkChoice + desertChoice; 
        System.out.println("Your total calaorie count is " + TotalC + ".");
        
    }
}
