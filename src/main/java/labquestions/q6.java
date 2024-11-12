package labquestions;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the amount of 1 kurus you have: ");
        int k1 = scn.nextInt();
        System.out.println("Enter the amount of 5 kurus you have: ");
        int k5 = scn.nextInt();
        System.out.println("Enter the amount of 10 kurus you have: ");
        int k10 = scn.nextInt();
        System.out.println("Enter the amount of 25 kurus you have: ");
        int k25 = scn.nextInt();
        System.out.println("Enter the amount of 50 kurus you have: ");
        int k50 = scn.nextInt();
        double sum = (k1 * 0.01 + k5 * 0.05 + k10 * 0.1 + k25 * 0.25 + k50 * 0.5);
        System.out.println("You have "+sum+" Liras");

    }
}
