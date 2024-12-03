package javaproblem;
import java.util.Scanner;
public class MiniProje1 {

public static boolean isPrime(int n) {
    if(n <= 1){
        return false;
    }
    if (n == 2) {
        return true;
    }
  if (n % 2 == 0) {
      return false;
  }
  if (n % 3 == 0) {
      return false;
  }
  if (n % 6 == 0) {
      return false;
  }
  else{
      return true;
  }
}

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
                int n = sc.nextInt();
        System.out.println("The number you entered is Prime? : " + isPrime(n));
    }
}
