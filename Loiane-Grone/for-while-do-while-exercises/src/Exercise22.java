import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();
        int count = 1;
        boolean isPrimeNumber = true;
        String divisors = "";

        do {
            if (number == 1) {
                isPrimeNumber = false;
                break;
            }
            if (number % count == 0 && count != 1 && count != number) {
                isPrimeNumber = false;
            }
            divisors += (number % count == 0) ? count + ", " : "";
            count += 1;
        } while (count <= number);

        System.out.println("Is " + number + " a prime number? " + isPrimeNumber);

        if (!isPrimeNumber) {
            System.out.println("The divisors of " + number);
            System.out.println(divisors);
        }

        sc.close();
    }
}
