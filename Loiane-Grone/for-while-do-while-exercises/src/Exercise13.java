import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Potentiation
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        double potentiation = 0.0;

        if (exponent == 0) {
            potentiation = 1.0;
        } else if (exponent > 0) {
            potentiation = 1.0;
            while (exponent > 0) {
                potentiation *= base;
                exponent -= 1;
            }
        } else {
            potentiation = 1.0;
            while (exponent < 0) {
                potentiation *= (1 / base);
                exponent += 1;
            }
        }

        System.out.println("Result: " + potentiation);
        
        sc.close();
    }
}
