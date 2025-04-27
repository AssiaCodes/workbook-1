package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Prompt user for the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Display possible calculations
        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        // Ask user to select an option
        System.out.print("Please select an option: ");
        String choice = scanner.next();

        // Always multiply for this exercise
        double result = firstNumber * secondNumber;

        // Display the result
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);

        // Close the scanner
        scanner.close();
    }
}

