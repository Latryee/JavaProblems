package javaproblem;
import java.util.Scanner;
public class ComputeAvg {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();
        double n3 = scn.nextDouble();

        double avg = (n1 + n2 + n3) / 3;

        System.out.println("Avarage = " + avg);
    }
}
