package javaproblem;

import java.util.Scanner;

public class ProcessingArrays {
    public static void main(String[] args) {
        double[] myList = new double[10];
        Scanner input = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }

        System.out.println("The array content is as follows: ");
        DefaultValueInArray.printArray(myList);

        // Initializing arrays with random values
        System.out.println("Initializing arrays with random values...");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) ((Math.random() * 100) / 100.0);
        }
        System.out.println("The array content is as follows: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        System.out.println();

        // Sum all elements in the array
        double sumAll = 0;
        for (int i = 0; i < myList.length; i++) {
            sumAll += myList[i];
        }
        System.out.println("Sum of all elements: " + sumAll);

        // Finding the largest element
        double largest = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (largest < myList[i]) {
                largest = myList[i];
            }
        }
        System.out.println("The largest value in the array: " + largest);

        // Finding the smallest index of the largest element
        double biggest = myList[0];
        int indexOfBiggest = 0;
        for (int i = 1; i < myList.length; i++) {
            if (biggest < myList[i]) {
                biggest = myList[i];
                indexOfBiggest = i;
            }
        }
        System.out.println("The largest value is stored at index: " + indexOfBiggest);

        // Random shuffling
        for (int i = 0; i < myList.length; i++) {
            int randomIndex = (int) (Math.random() * myList.length);
            double temp = myList[i];
            myList[i] = myList[randomIndex];
            myList[randomIndex] = temp;
        }
        System.out.println("After shuffling...");
        DefaultValueInArray.printArray(myList);
    }
}

