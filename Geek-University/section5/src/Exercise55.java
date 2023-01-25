import java.util.Locale;
import java.util.Scanner;

public class Exercise55 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive whole number greater than 0: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i += 1) {
            if (i != 2) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Prime number: " + i);
                }
            } else {
                System.out.println("Prime number: " + i);
            }
        }

        // System.out.println("Is " + n + " a prime number? " + isPrime);

        sc.close();
    }
}
