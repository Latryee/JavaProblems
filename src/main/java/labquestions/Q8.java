/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ps5be
 */
public class Q8 {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the price of your product: ");
        int p = scn.nextInt();
        System.out.println("Enter type of your product: ");
    int t = scn.nextInt();
    double total;
    
    if (t == 172){
        total = p + p * 0.18;
        System.out.println("Your total price is: " + total);
    }
    else if (t == 188) {
        total = p + p * 0.08;
        System.out.println("Your total price is: " + total);
        
    }
    else if (t == 196) {
        total = p;
        System.out.println("Your total price is: " + total);
    }
    else {
        System.out.println("invalid product type");
    }
    
       
        
        
        
        
        
    }
    
}
