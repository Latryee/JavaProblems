package labquestions;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height and radius");
        double h = s.nextDouble();
        double r = s.nextDouble();
        double volume = 1 / 3.0 * h * r * r * 3.14;
        System.out.println("Volume of the cone is: "+volume);
    }
}
