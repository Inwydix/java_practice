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
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 10. Write a program that prints on the screen the menu below 
        and reads the option selected by the user. According to the option, the 
        program must read the corresponding data to perform the selected area 
        calculation. The resulting are must be printed on the screen.
        Calculate the area
        ------------------------
        1. Calculate the area of a triangle (base, height)
        2. Calculate the area of a trapezoid (edge a, edge b, height)
        Programming Control flow statements, Exercises
        3. Calculate the area of a rectangle (base, height)
        4. Exit the program*/
        
        Scanner keyboard = new Scanner(System.in);
        
        int num = 0;
        float base, height, edge1, edge2, area;
        
        while(num !=4){
            System.out.println("Calculate the area\n" +
            "------------------------\n" +
            "1. Calculate the area of a triangle (base, height)\n" +
            "2. Calculate the area of a trapezoid (edge a, edge b, height)\n" +
            "3. Calculate the area of a rectangle (base, height)\n" +
            "4. Exit the program");
            num = keyboard.nextInt();
            
            if(num == 1){
                System.out.println("Enter base: ");
                base = keyboard.nextFloat();
                System.out.println("Enter height: ");
                height = keyboard.nextFloat();

                area = (base*height)/2;
                System.out.println(area);
            }
            else{
                if(num == 2){
                    System.out.println("Enter first edge: ");
                    edge1 = keyboard.nextFloat();
                    System.out.println("Enter second edge: ");
                    edge2 = keyboard.nextFloat();
                    System.out.println("Enter height: ");
                    height = keyboard.nextFloat();
                    
                    area = 0.5f*(edge1 + edge2)*height;
                    System.out.println(area);
                }
                else{
                    if(num == 3){
                        System.out.println("Enter base: ");
                        base = keyboard. nextFloat();
                        System.out.println("Enter height: ");
                        height = keyboard.nextFloat();
                        
                        area = base*height;
                        System.out.println(area);
                    }
                    else{
                        if(num == 4)
                            break;
                        else
                            System.out.println("Choose a valid number!");
                    }
                }
            }
        }
    }
    
}
