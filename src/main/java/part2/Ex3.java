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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 3. Write a program to print the series: 5, 10, 15, 20, 25, 
        30… The program must read on the keyboard the number of terms of the 
        series to print.*/
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce a number: ");
        int num = keyboard.nextInt();
        int serie = 0;
        
        for(int i=0;i<=num;i++){
            serie +=5;
            System.out.print(serie + ", ");
        }
    }
    
}
