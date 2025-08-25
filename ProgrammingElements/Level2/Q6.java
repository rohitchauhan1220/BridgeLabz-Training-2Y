//Write a program to take 2 numbers and print their quotient and reminder
//Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//I/P => number1, number2
//O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___


import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int number2 = scanner.nextInt();

        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Output the result
            System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n",
                    quotient, remainder, number1, number2);
        }

    }
}
