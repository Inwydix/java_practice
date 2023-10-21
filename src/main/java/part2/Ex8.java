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
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 8. Repeat Exercise 7, but only printing the border of the 
        asterisk square. For instance, if the number is 4, the program must 
        print:
        ****
        *  *
        *  *
        **** */
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Introduce a number: ");
        int num = keyboard.nextInt();
        
        for(int k = 1; k <= num; k++){
            if(k == 1 || k == num){
                for(int i = 1; i <= num; i++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else{
                System.out.print("*");
                for(int j = 2; j < num; j++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
        
    }
    
}
