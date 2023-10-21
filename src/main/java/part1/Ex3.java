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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 3. Write a program that reads an integer value on the keyboard 
        and prints if it is an even or an odd number*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 3");
        
        System.out.println("Introduce a number: ");
        int num = keyboard.nextInt();
        
        if (num%2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        
    }
    
}
