/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package part1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        /*Exercise 1: Write a program that reads two integer numbers on the 
        keyboard and prints the largest of them.*/
        
        System.out.println("Exercise 1");
        
        System.out.println("Introduce a number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        int num2 = keyboard.nextInt();
        
        if (num1 > num2)
            System.out.println(num1 + " is bigger");
        else {
            if(num1 == num2)
                System.out.println(num1 + " and " + num2 + " are equal!");
            else
                System.out.println(num2 + " is bigger");
        }
        
    }
}
