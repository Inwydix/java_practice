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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 2. Write a program that reads two integer numbers on the 
        keyboard and prints if the first of them is divisible by the second 
        one.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 2");
        
        System.out.println("Introduce a number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        int num2 = keyboard.nextInt();
        
        if (num1%num2 == 0)
            System.out.println(num1 + " is divisible by " + num2);
        else
            System.out.println(num1 + " is not divisible by " + num2);
        
    }
    
}
