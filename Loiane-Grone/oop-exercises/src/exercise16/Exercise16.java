package exercise16;

import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to sum: ");
        double a = sc.nextDouble();

        System.out.print("Enter another number to sum: ");
        double b = sc.nextDouble();
        double sum = Calculator.sum(a, b);

        System.out.print("Enter a number to subtract: ");
        a = sc.nextDouble();

        System.out.print("Enter another number to subtract: ");
        b = sc.nextDouble();
        double subtraction = Calculator.substract(a, b);

        System.out.print("Enter a number to multiply: ");
        a = sc.nextDouble();

        System.out.print("Enter another number to multiply: ");
        b = sc.nextDouble();
        double multiplications = Calculator.multiply(a, b);

        System.out.print("Enter a number to make division: ");
        a = sc.nextDouble();

        System.out.print("Enter another number to make division: ");
        b = sc.nextDouble();
        double division = Calculator.divide(a, b);

        System.out.print("Enter a number to be the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter another number to be the exponent: ");
        int exponent = sc.nextInt();
        double exponentiation = Calculator.raiseToThePowerOf(base, exponent);

        System.out.printf("Sum of %.1f %.1f = %.1f \n", a, b, sum);
        System.out.printf("Subtraction of %.1f %.1f = %.1f \n", a, b, subtraction);
        System.out.printf("Multiplication of %.1f %.1f = %.1f \n", a, b, multiplications);
        System.out.printf("Division of %.1f %.1f = %.1f \n", a, b, division);
        System.out.printf("%.1f to the power of %d = %.1f \n", base, exponent, exponentiation);

        sc.close();
    }
}
