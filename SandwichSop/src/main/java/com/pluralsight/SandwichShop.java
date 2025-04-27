package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Sandwich size Choice
        System.out.println("Entre the size  of sandwich:");
        int sizeChoice = sc.nextInt();

        if (sizeChoice == 1) {
            double BasePrice = 5.45;
        } else if (sizeChoice == 2) {
            Double BasePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size choice.");
        }

        // if sandwich is loaded
        System.out.println("Would you like the sandwich loaded (yes/no)?");
        String loadedResponse = sc.nextLine().trim().toLowerCase();
        boolean isLoaded = loadedResponse.equals("yes");

        if (isLoaded) {
            if (sizeChoice == 1) {
                Double BasePrice = 1.00;
            } else {
                Double BasePrice = 1.75;
            }
        }

       // user's age
        if (age)
    }
}


