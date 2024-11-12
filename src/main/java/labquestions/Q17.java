
package labquestions;
import java.util.Scanner;
public class Q17 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        int num = input.nextInt();
        int sum=0;
        while(0<num && num<99999) {
         sum =sum+ (num%10);
         num = num/10;
         
        }
        System.out.println("The sum is: "+ sum);
        
        
        
    }
}
