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
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 9. Write a program that reads a single character on the 
        keyboard and, by using the switch instruction, prints on the screen if 
        it is a number or not. Repeat the exercise by using the if instruction*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce a character: ");
        char character = keyboard.next().charAt(0);
        
        switch(Character.getNumericValue(character)){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: System.out.println("It's a number"); break;
            default: System.out.println("It's not a number"); break;
        }
        
        System.out.println("Introduce another character: ");
        character = keyboard.next().charAt(0);
        
        if(Character.isDigit(character))
            System.out.println("It's a number");
        else
            System.out.println("It's not a number");
        
        
    }
    
}
