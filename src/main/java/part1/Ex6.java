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
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Exercise 6: Write a program to calculate the value of the function 
        below for a value of x introduced on the keyboard:
        f(x){x+3      if x <= 0
             x^2 + 2x if x > 0*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 6");
        
        System.out.println("Introduce the value of x: ");
        float x = keyboard.nextFloat();
        
        if(x <= 0)
            x += 3;
        else
            x = (x*x) + (2*x);
        
        System.out.println("Result: " + x);
        
        
    }
    
}
