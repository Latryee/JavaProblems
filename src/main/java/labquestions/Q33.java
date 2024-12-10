package labquestions;

import java.util.Scanner;
public class Q33 {
    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        if (N % 2 == 0) {
            return false;
        }
        for (int i = 3; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer you want to check: ");
        int n = input.nextInt();
        System.out.println(n + " sayisi bir Asal sayi mi: " +isPrime(n));
    }
}

    
    
