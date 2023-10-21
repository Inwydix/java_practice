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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Exercise 5. Repeat exercise 4, but reading the values from the 
        keyboard until the user introduces a 0 –i.e., the number of values 
        is not fixed.*/
                Scanner keyboard = new Scanner(System.in);
        
        int [] num;
        num = new int [999];
        
        int count = 0, number, maxpos = 0, minpos = 0, sum = 0;
        
        do{
            System.out.println("Introduce a positive number: ");
            number = keyboard.nextInt();
            if(number > 0){
                num[count] = number;
                count++;
            }
        }while(number >= 0);
        
        for(int k=0;k<count;k++){
            sum+=num[k];
        }
        
        System.out.println("Sum: "+sum);
        System.out.println("Average: " + (sum/count));
        
        for(int i = 0;i<count;i++){
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
