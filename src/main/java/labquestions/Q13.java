/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Q13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day you want to translate: ");
       String day = input.nextLine();
       
        
       switch(day){
           case "Monday": 
               System.out.println("Pazartesi");
               break;
           case "Tuesday":
               System.out.println("Salı");
               break;
           case "Wednesday":
               System.out.println("Çarşamba");
               break;
           case "Thursday":
               System.out.println("Perşembe");
               break;
           case "Friday":
               System.out.println("Cuma");
               break;
           case "Saturday":
               System.out.println("Cumartesi");
               break;
           case "Sunday":
               System.out.println("Pazar");
               break;
           default:
               System.out.println("İnvalid İnput");
               break;
               
            
       }
         
        
        
        
        
    }
}
