/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 5. Write a program that reads three integer values on the 
        keyboard and prints them in decreasing order.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 5");
        
        System.out.println("Introduce a number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        int num2 = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        int num3 = keyboard.nextInt();
        
        if(num1 > num2 && num1 > num3)
            System.out.print(num1 + " ");
        else{
            if(num1 < num2 && num2 > num3)
                System.out.print(num2 + " ");
            else
                System.out.print(num3 + " ");
        }
        if((num1 < num2 && num1 > num3) || (num1 > num2 && num1 < num3))
            System.out.print(num1 + " ");
        else{
            if((num2 < num1 && num2 > num3) || (num2 > num1 && num2 < num3))
                System.out.print(num2 + " ");
            else
                System.out.print(num3 + " ");
        }
        if(num1 < num2 && num1 < num3)
            System.out.print(num1 + "\n");
        else{
            if(num2 < num1 && num2 < num3)
                System.out.print(num2 + "\n");
            else
                System.out.print(num3 + "\n");
        }
        
    }
    
}
