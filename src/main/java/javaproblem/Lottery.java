package javaproblem;

import java.util.Scanner;
public class Lottery {
    public static void main(String[] args)  {
        int lottery = (int)(Math.random()*90+10);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your lottery pick: ");
        int pick = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = pick / 10;
        int guessDigit2 = pick % 10;

        System.out.println("The lottery number is: " + lottery);

        if (pick == lottery){
            System.out.println("Exact match: you win $10.000");
        }
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits : you win $5.000");
        }
        else if ( guessDigit2 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit2 || guessDigit1 == lotteryDigit1) {
            System.out.println("Match one digit : you win $2.500");

        }
       else {
           System.out.println("Sorry, no match");

        }





    }
}
