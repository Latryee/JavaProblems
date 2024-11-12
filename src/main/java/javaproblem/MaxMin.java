package javaproblem;

import java.util.Scanner;
public class MaxMin{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int max = -1;
        do {
            System.out.println("Enter a POSİTİVE value to find the max among the numbers you entered (the input ends if it is 0): ");
            number = input.nextInt();
            if (number>max)
                max = number;
        }
        while (number > 0);
        System.out.println("The max value is " + max);
    }
}
