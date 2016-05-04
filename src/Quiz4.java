/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhila4674
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int burger1 = 461;
        int burger2 = 431;
        int burger3 = 420;
        int burger4 = 0;
        
        int side1 = 100;
        int side2 = 57;        
        int side3 = 70;
        int side4 = 0;
        
        int drink1 = 130;
        int drink2 = 160;
        int drink3 = 118;
        int drink4 = 0;   
        
        int dessert1 = 167;
        int dessert2 = 266;
        int dessert3 = 75;
        int dessert4 = 0;
        
        System.out.println("enter burger choice");
        int word1 = input.nextInt();
        if (word1 == 1){
        word1 = burger1;
    }    else if (word1 == 2){
        word1 = burger2;
    } else if (word1 == 3){
        word1 = burger3;
    } else if (word1 == 4){
        word1 = burger4;
    }      
        System.out.println("enter side choice");
        int word2 = input.nextInt();
        if (word2 == 1){
        word2 = side1;
    }    else if (word2 == 2){
        word2 = side2;
    } else if (word2 == 3){
        word2 = side3;
    } else if (word2 == 4){
        word2 = side4;
    }   
        System.out.println("enter drink choice");
        int word3 = input.nextInt();
        if (word3 == 1){
        word3 = drink1;
    }    else if (word3 == 2){
        word3 = drink2;
    } else if (word3 == 3){
        word3 = drink3;
    } else if (word3 == 4){
        word3 = drink4;
    }   
        System.out.println("enter dessert choice");
        int word4 = input.nextInt();
        if (word4 == 1){
        word4 = dessert1;
    }    else if (word4 == 2){
        word4 = dessert4;
    } else if (word4 == 3){
        word4 = dessert3;
    } else if (word4 == 4){
        word4 = dessert4;
    }   
        System.out.println("the number of calories are " + (word1 + word2 + word3 + word4));
        }
    }

