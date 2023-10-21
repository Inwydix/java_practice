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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 7: Write a program that reads an integer value on the 
        keyboard and, if the value has two digits, shows on the screen:
        (1) sum of the two digits;
        (2) number of even digits.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 7");
        
        System.out.println("Introduce a number: ");
        int number = keyboard.nextInt();
        int sum = 0;
        int even = 0;
        
        if(Integer.toString(number).length() == 2){
            for(int i = 0; i < Integer.toString(number).length();i++){
                sum += Character.getNumericValue(Integer.toString(number).charAt(i));
                if(Character.getNumericValue(Integer.toString(number).charAt(i))%2 == 0)
                    even++;
            }
            System.out.println("Number " + number + " has more than 2 digits. "
                    + "The sum of all its digits is " + sum 
                    + ". It has " + even + " even numbers inside it.");
        }
        else
            System.out.println("Number " + number + " has doesn't have 2 digits");
        
    }
    
}
