package javaproblem;

import java.util.Scanner;

public class TempArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double[] tempList = new double[10];

        System.out.println("tempList: " + tempList);
        System.out.println("tempList[0]: " + tempList[0]);
        System.out.println("tempList[9]: " + tempList[9]);
        // System.out.println("tempList[10]: " + tempList[10]); // This would cause an error

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter temperature for day " + i + ": ");
            double temp = input.nextDouble();
            tempList[i] = temp;
            sum += temp;
        }

        double average = sum / tempList.length;
        System.out.println("Average temperature is " + average);

        int count = 0;
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] > average)
                count++;
        }

        System.out.println(count + " days have a higher temperature than the average temperature.");
    }
}
