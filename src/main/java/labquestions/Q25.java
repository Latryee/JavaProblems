package labquestions;
import java.util.Scanner;
public class Q25 {
 public static void main(String[]args)   {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a N value : ");
     int N = input.nextInt();
     double e = 1.0;
     double faktoriyel = 1.0;
     for(int i=1; i<=N; i++){
         faktoriyel*=i;
         e+= (1.0 / faktoriyel);
     }
     System.out.println("e = " + e);
     
 }
}

