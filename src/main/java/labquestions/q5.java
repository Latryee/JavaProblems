package labquestions;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 1000");
        int number = input.nextInt();
        // 654%10=4
        // 654/10=65%10=5
        // 654/100=6
        int digit1 = number % 10;// 123%10-->3
        int digit2 = (number / 10) % 10;//123/10=12%10=2
        int digit3 = number / 100;//123/100=1
        int sum = digit1 + digit2 + digit3;
        System.out.println(sum);
    }
}
