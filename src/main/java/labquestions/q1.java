package labquestions;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner comp = new Scanner(System.in);
        
        System.out.println("Enter the us dollars");
        int dollars = comp.nextInt();
        double euros = dollars * 0.9103;
        System.out.println("Euro amount is: " + euros);

    }

}
