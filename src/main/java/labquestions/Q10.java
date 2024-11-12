/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author ps5be
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            System.out.println("Enter a value between 0-999: ");
            int number = scn.nextInt();
            
           int digit1 = number % 10;
                   int digit2 = (number / 10) % 10;
                    int digit3 = number / 100;
        
        if (number > 0 && number < 10){
            System.out.println("The number has 1 digits. The digit: " + number);
        }
        else if ( number > 9 && number < 100){
            System.out.println("The number has 2 digits. The digits: " + digit1 + " , " + digit2);
        }
        else if (number > 99 && number < 1000){
            System.out.println("The number has 3 digits. The digits: " + digit1 + " , " + digit2 + " , " + digit3);
        }
        else { 
            System.out.println("İnvalid Number");
        }
    }
}
