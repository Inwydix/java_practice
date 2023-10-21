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
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 4.
        Write a program to read 10 positive numbers on the keyboard and print 
        the following values:
        1. Addition of the numbers
        2. Arithmetic mean of the numbers
        3. Largest number
        4. Smaller number*/
        
        Scanner keyboard = new Scanner(System.in);
        
        int num [];
        num = new int[10];
        int count = 0, number, maxpos = 0, minpos = 0;
        
        do{
            System.out.println("Introduce a positive number: ");
            number = keyboard.nextInt();
            if(number > 0){
                num[count] = number;
                count++;
            }
            else
                System.out.println("Introduce a positive number!");
        }while(count != 10);
        
        int sum = num[0]+num[1]+num[2]+num[3]+num[4]+num[5]+num[6]+num[7]+num[8]+num[9];
        System.out.println("Sum: "+sum);
        System.out.println("Average: " + (sum/10));
        
        for(int i = 0;i<10;i++){
            maxpos = i;
            minpos = i;
            for(int j = 0;j<=i;j++){
                if(num[j]<num[minpos])
                    minpos = j;
                else{
                    if(num[j]>num[maxpos])
                        maxpos = j;
                }
            }
        }
        
        System.out.println("Max number: " + num[maxpos]);
        System.out.println("Min number: " + num[minpos]);
    }
    
}
