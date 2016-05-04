/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz4;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int burgerChoice;
        int burger1=1;
        int burger2=2;
        int burger3=3;
        int burger4=4;
        int burgerCal = 0;
        int sideChoice;
        int side1=1;
        int side2=2;
        int side3=3;
        int side4=4;
        int sideCal = 0;
        int drinkChoice;
        int drink1=1;
        int drink2=2;
        int drink3=3;
        int drink4=4;
        int drinkCal = 0;
        int dessertChoice;
        int dessert1=1;
        int dessert2=2;
        int dessert3=3;
        int dessert4=4;
        int dessertCal = 0;
        int totalCal;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Chip’s Fast Food Emporium");
        System.out.print("please enter a burger choice");
        burgerChoice=input.nextInt();
        if(burgerChoice==burger1){
            burgerCal=461;
        }else if(burgerChoice==burger2){
            burgerCal=431;
        }else if(burgerChoice==burger3){
            burgerCal=420;
        }else if(burgerChoice==burger4){
            burgerCal=0;
        }
        System.out.print("please enter a side choice");
        sideChoice=input.nextInt();
        if(sideChoice==side1){
            sideCal=100;
        }else if(sideChoice==side2){
            sideCal=57;
        }else if(sideChoice==side3){
            sideCal=70;
        }else if(sideChoice==side4){
            sideCal=0;
        }
        System.out.print("please enter a drink choice");
        drinkChoice=input.nextInt();
        if(drinkChoice==drink1){
            drinkCal=130;
        }else if(drinkChoice==drink2){
            drinkCal=160;
        }else if(drinkChoice==drink3){
            drinkCal=118;
        }else if(drinkChoice==drink4){
            drinkCal=0;
        }
        System.out.print("please enter a dessert choice");
        dessertChoice=input.nextInt();
        if(dessertChoice==dessert1){
            dessertCal=167;
        }else if(dessertChoice==dessert2){
            dessertCal=266;
        }else if(dessertChoice==dessert3){
            dessertCal=75;
        }else if(dessertChoice==dessert4){
            dessertCal=0;
        }
        totalCal=burgerCal+sideCal+drinkCal+dessertCal;
        System.out.println("Your total Calorie count is " + totalCal);
    }
}
