package eighteenofAugustHomework;

import java.util.Scanner;

public class eighteenofaugusthw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 5; // Number of elements

        // Create an array to store the numbers
        double[] numbers = new double[n];

        // Input loop to enter the numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate sum
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = sum / n;

        // Print sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

