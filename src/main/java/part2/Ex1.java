/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2;

/**
 *
 * @author Usuario
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 1.
        Write a program to print the integer numbers from 1 to 100.
        Write a program to print the integer numbers from 1 to 100 counting two by two.
        Write a program to print the integer numbers from 100 to 1.*/
        
        System.out.println("Numbers from 1 to 100");
        
        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
        
        System.out.println("Numbers from 1 to 100 counting two by two");
        
        for(int j=1;j<=100;j+=2){
            System.out.println(j);
        }
        
        System.out.println("Numbers from 100 to 1");
        
        for(int k=100;k>=1;k--){
            System.out.println(k);
        }
    }
    
}
