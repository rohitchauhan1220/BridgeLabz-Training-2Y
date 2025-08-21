//5. Convert Kilometers to Miles
//Write a program that takes the distance in kilometers as input from the user
//and converts it into miles using the formula:
//Miles = Kilometers * 0.621371.

import java.util.Scanner;
public class Q5_SelfProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.printf("%.2f kilometers is equal to %.2f miles.%n", kilometers, miles);
    }
}
