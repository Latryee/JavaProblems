package javaproblem;
import java.util.Scanner;
public class MatematikOyunu { public static void main(String[] args) {
    for (int health = 3; health > 0;) {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 150);

        int answer = (num1 * num2 + num3);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + num1 + " * " + num2 + " + " + num3 + " ?");
        System.out.println("Your health is = " + health);
        System.out.println("Enter your answer: ");
        int useranswer = input.nextInt();

        if (answer == useranswer) {
            System.out.println("Your answer is correct! " + "(" + num1 + " * " + num2 + ")" + " + " + num3 + " = " + answer);
        } else {
            System.out.println("Your answer is false! " + "(" + num1 + " * " + num2 + ")" + " + " + num3 + " = " + answer);
            health--;
            System.out.println("Your health is: " + health);
            System.out.println(" ");
        }
    }

    System.out.println("Game is Over");
}
}

