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
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 7. Write a program to read an integer value on the keyboard 
        and print an asterisk square of this size. For instance, if the number 
        is 4, the program must print:
        ****
        ****
        ****
        **** */
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce a number: ");
        int num = keyboard.nextInt();
        int counter = 0;
        
        do{
            for(int i = 1; i <= num; i++){
                System.out.print("*");
            }
            System.out.print("\n");
            counter++;
        }while (counter != num);
        
    }
    
}
