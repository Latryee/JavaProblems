package javaproblem;
import java.util.Scanner;

public class FahrenheitToCelsius {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        //Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit: " + fahrenheit + "is " + celsius + " in Celsius");
    }
}
