//Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___


import java.util.Scanner;
public class Level1Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        double areaInInches = 0.5 * base * height;

        double areaInCm = areaInInches * Math.pow(2.54, 2);

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " +
                areaInCm + " square centimeters.");

    }
}
