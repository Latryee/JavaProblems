package labquestions;
import java.util.Scanner;
public class Q18 {
    public static void main(String[]args){
        
  Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a integer values");
                        int n = input.nextInt();
                       int max=-1;
            while (n>=0){
                if (n>max){
                    max=n;
                   
                }
                System.out.println("Your max value is: " + max + " now.");
                System.out.println("Give another integer (Enter a negative value to stop): ");
                n = input.nextInt();
            }
         System.out.println("Your max value is:" + max);
            
            
            
}
}