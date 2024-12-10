package javaproblem;
public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt user for the number of items
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        // Create an array to hold the numbers
        double[] numbers = new double[n];
        double sum = 0;

        // Get the numbers from the user
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        // Calculate the average
        double average = sum / n;

        // Count how many numbers are above the average
        int count = 0; // The number of elements above average
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        // Display the results
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
