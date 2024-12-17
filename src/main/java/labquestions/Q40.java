package labquestions;

import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int[] asal = new int[50];
        int sayi = 0;
        while (number % 2 == 0) {
            asal[sayi++] = 2;
            number /= 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                asal[sayi++] = i;
                number /= i;
            }
        }
        if (number > 2) {
            asal[sayi++] = number;
        }
        System.out.print("Prime factors are: ");
        for (int i = 0; i < sayi; i++) {
            System.out.print(asal[i] + " ");
        }
    }
}
