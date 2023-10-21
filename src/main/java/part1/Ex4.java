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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /*Exercise 4. Write a program that prints on the screen the price of a 
        cinema ticket according to the age of the customer. The program must 
        read the user’s age and calculate the price as follows: 
        (a) Normal ticket: 7 euros; 
        (b) Children under 5: 60% discount; 
        (c) People over 60: 55% discount.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 4");
        
        System.out.println("Introduce your age: ");
        int age = keyboard.nextInt();
        float price = 7f;
        
        if(age < 5)
            price *= 0.40;
        else
            if(age > 60)
                price *= 0.45;
        
        System.out.println("Your ticket price is: " + price + " euros");
        
    }
    
}
