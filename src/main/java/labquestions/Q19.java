package labquestions;
import java.util.Scanner;
public class Q19 { 
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value:");
        int n1 = input.nextInt();
        int total =0;
        while (n1>0){
           total+= Math.pow(n1,2);
           
            n1=n1-1;
            
          
        }
        System.out.println("Total is: "+total);
        
        
        
    }
}
