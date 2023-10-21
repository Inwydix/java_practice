/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 6. Write a program to read an integer number, calculate its 
        factorial, and print the result on the screen.
        NOTE: The factorial of an integer n is the product of the integer 
        values from 0 to n: n! = 1 * 2 * 3 * … * (n-1) * n*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce a number: ");
        int num = keyboard.nextInt();
        int fact = 1;
        
        for(int i = 2; i <= num; i++){
            fact*=i;
        }
        
        System.out.println("Factorial: "+ fact);
    }
    
}
