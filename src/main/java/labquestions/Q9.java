/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give 4 integer values: ");
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int n4 = scn.nextInt();
        
        if (n1 > n2 && n1 > n3 && n1 > n4){
            System.out.println("Max: " + n1);
        }
        else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("Max: " + n2); 
        }
        else if (n3 > n1 && n3 > n2 && n3 > n4){
            System.out.println("Max: " + n3);
        }
        else if (n4 > n1 && n4 > n2 && n4>n3) {
            System.out.println("Max: " + n4);
        }
        
        if ( n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("Min: " + n1);
        }
        else if ( n2 < n1 && n2 < n3 && n2 < n4){
            System.out.println("Min: " + n2);
        }
        else if ( n3 < n1 && n3 < n2 && n3 < n4){ 
            System.out.println("Min: " + n3);
        }
        else if ( n4 < n1 && n4 < n2 && n4 < n3){
            System.out.println("Min: " + n4);
        }
        
    }
    
}
