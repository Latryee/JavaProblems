package labquestions;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Celsius");
        int celsius = s.nextInt();
        int kelvin = celsius + 273;
        System.out.println(celsius+" Celsius degrees is "+kelvin+" Kelvin degrees");
    }
}
