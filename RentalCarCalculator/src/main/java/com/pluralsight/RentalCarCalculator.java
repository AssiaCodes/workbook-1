package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        System.out.println("pickup date");
        String pickupDate = sc.nextLine();

        System.out.println("number of rental date");
        int days = sc.nextInt();

        System.out.println("Dp you want a GPS? (Y/N)");
        String TollTag = sc.nextLine();

        System.out.print("Do you want roadside assistance? (Y/N): ");
        String wantsRoadside = sc.next();

        System.out.print("age: ");
        int age = sc.nextInt();

        //prices
        double PerDayPrice = 29.99;
        double TollTagPrice = 3.95;
        double GpsPrice= 2.95;
        double RoadsidePrice= 3.95;

        //Calculate total cost
        double TotalCost = PerDayPrice * days;

        if (TollTag.equalsIgnoreCase("yes")) {

        }
        }




    }

