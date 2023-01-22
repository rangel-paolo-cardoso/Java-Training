import java.util.Locale;
import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a zero or negativo number to exit.");
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number < 1) {
                System.out.println();
                break;
            }
            int numberSquared = number * number;
            int numberCubed = number * number * number;
            double numberSquareRoot = Math.sqrt(number);
            System.out.println("To the power of 2: " + numberSquared);
            System.out.println("To the power of 2: " + numberCubed);
            System.out.println("Square root of " + number + ": " + numberSquareRoot);
        } while (true);

        sc.close();
    }
}
