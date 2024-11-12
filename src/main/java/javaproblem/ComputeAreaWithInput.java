package javaproblem;
import java.util.Scanner;
public class ComputeAreaWithInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a double value:");
        double radius = scn.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("The area is " + area);
    }
}
