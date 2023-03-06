package exercise16;

public class Calculator {
    
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        throw new ArithmeticException("Invalid division! a = " + a + ", b = " + b + "; b should not be zero.");
    }

    public static double raiseToThePowerOf(double base, int exponent) {
        double power = 1.0;
        if (exponent == 0) {
            return power;
        } else if (exponent > 0) {
            for (int i = 1; i <= exponent; i += 1) {
                power *= base;
            }
        } else {
            if (base != 0) {
                double denominator = 1.0;
                for (int i = 1; i <= exponent; i += 1) {
                    denominator *= base;
                }
                power = 1 / denominator;
            } else {
                throw new ArithmeticException("Invalid exponentiation! base = " + base +  ", the base should not be zero");
            }
        }
        return power;
    }

    public static int calculateFactorial(int n) {
        return (n > 1) ? n * calculateFactorial(n - 1) : 1;
    }
}
