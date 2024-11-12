package labquestions;

import java.util.Scanner;
public class Q22 {
    public static void main(String[]args) {
        System.out.println("Enter an integer value : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result=1;
        for (int i= 1; i<=n ; i++){
            result*=i;
        }
        
        
        System.out.println(n+"! = " + result);
        
        
    }
}
  