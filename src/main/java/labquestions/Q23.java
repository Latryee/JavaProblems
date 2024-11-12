package labquestions;
import java.util.Scanner;
public class Q23 {
  public static void main(String[]args)  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a integer value : ");
      int a = input.nextInt();
      System.out.println("Enter a integer value : ");
      int b = input.nextInt();
      
      int aFact = 1;
      int bFact = 1;
      int abFact = 1;
      for (int i = 1; i<=a; i++) {
          aFact*=i;
          
      }
      for (int i=1; i<=b; i++){
          bFact*=i;
      }
      for (int i=1; i<= (a-b); i++){
          abFact*=i;
      }
      System.out.println("C("+ a +","+b+") = " + (aFact/bFact*abFact));
  }
}
