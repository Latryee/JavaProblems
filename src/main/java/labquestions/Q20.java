package labquestions;

import java.util.Scanner;
public class Q20 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a x value: ");
        int x = input.nextInt();
        System.out.println("Enter a y value: ");
        int y = input.nextInt();
        int result=1;
        while (y>0){
            result = result * x;
            
                    y = y-1;
        }
        System.out.println("Result is: "+result);
    }
}
