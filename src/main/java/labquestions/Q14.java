package labquestions;

import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer: ");
            int n1 = input.nextInt();
        System.out.println("Enter integer: ");
        int n2 = input.nextInt();
        System.out.println("Enter a operator: ");
        String op = input.next();
        
        
        int sum = n1 + n2;
        int böl = n1 / n2;
        int cık = n1 - n2;
        int carp = n1 * n2;
        int ust = (int) Math.pow(n1,n2);
        int kalan = n1 % n2;
         
        switch(op) {
            case "+":
                System.out.println("The answer is: " + sum);
                break;
            case "/":
                System.out.println("The answer is: " + böl);
            break;
            case "-":
                System.out.println("The answer is: " + cık);
            break;
            case "x":
                System.out.println("The answer is: " + carp);
            break;
            case "^":
                System.out.println("The answer is: " + ust);
            break;
            case "%":
                System.out.println("The answer is: " + kalan);
                break;
            default: 
                System.out.println("Invalid operator"); 
            
            
            
        }
        
        
        
        
    }
}
