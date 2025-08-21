//4. Area of a Circle
//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.


import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
