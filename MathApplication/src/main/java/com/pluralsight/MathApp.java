package com.pluralsight;

public class MathApp {

    //this is the main method and where any code will rum from
    //all code I am typing for this exercise will be in this method
    public static void main(String[] agrs) {

        /*

        Create two variables to represent the salary for Bob and Gary, name them
        bobSalary and garySalary. Create a new variable named
        highestSalary. Determine whose salary is greater using Math.max() and
        store the answer in highestSalary. Set the initial salary  variables to any value
        you want. Print the answer (i.e "The highest salary is ...") */


    double bobSalary = 55000;
    double garySalary = 100000;

    double highestSalary = Math.max(bobSalary, garySalary);

    System.out.println("The highest salary is " + highestSalary);

    System.out.println("---------------------");

       /*
       Find and display the smallest of two variables named carPrice and
       truckPrice. Set the variables to any value you want.
         */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest salary is " + Math.min(carPrice, truckPrice));

        System.out.println("The lowest  salary is " + lowestSalary);

        /*
        Find and display the area of a circle whose radius is 7.25
         */
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle with radius 7.25 is " + circleArea);

        /* Find and display the square root a variable after it is set to 5.0 */

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        
        System.out.println("The square root of 5.0 is " + squareRoot);

        /* Find and display the distance between the points (5, 10) and (85, 50)
         */
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between (5,10) and (85,50) is " + distance);

        /* Find and display the absolute (positive) value of a variable after it is set to -3.8
*/
           double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of -3.8 is " + absoluteValue);

        /* Find and display a random number between 0 and 1 */

        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1: " + randomNumber);


}
