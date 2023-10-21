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
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 8. Write a program that reads five integer values on the 
        keyboard and shows the smallest of them.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Exercise 8");
        
        int num[];
        num = new int [5];
        int minPos = 0;
        
        System.out.println("Introduce a number: ");
        num[0] = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        num[1] = keyboard.nextInt();
        System.out.println("Introduce a third number: ");
        num[2] = keyboard.nextInt();
        System.out.println("Introduce another number: ");
        num[3] = keyboard.nextInt();
        System.out.println("Introduce a final number: ");
        num[4] = keyboard.nextInt();
        
        for(int i = 0; i < 5; i++){
            minPos = i;
            for(int j = 0; j <= i; j++){
                if(num[j]<num[minPos])
                    minPos=j;
            }
        }
        System.out.println(num[minPos] + " is the smallest number.");
        
         
    }
    
}
