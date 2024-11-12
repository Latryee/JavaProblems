package labquestions;
import java.util.Scanner;

public class Q21 {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
        
        int sumEven = 0;
        int sumOdd = 0;
        
        while (true) {
            System.out.print("Enter an integer (0 to stop): ");
            int num = input.nextInt();
            
           
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        
        // Print the results
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);
        

    }
    
}
