//Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
//I/P => base, height
//O/P => The Area of the triangle in sq in is ___ and sq cm is ___


import  java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = scanner.nextDouble();

        double areaCm = 0.5 * base * height;

        double areaIn = areaCm / 6.4516;

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaIn, areaCm);

    }
}
