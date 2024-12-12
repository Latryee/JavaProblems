package labquestions;
import java.util.Scanner;
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer N: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
            return;
        }

        int[] fibo = new int[n + 1];
        if (n >= 0) fibo[0] = 0;
        if (n >= 1) fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("Fibonacci numbers between 0 and " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo[i] + (i < n ? ", " : "\n"));
        }
    }
}
