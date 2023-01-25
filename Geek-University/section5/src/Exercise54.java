import java.util.Locale;
import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive whole number greater than 1: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < n; i += 1) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("Is " + n + " a prime number? " + isPrime);

        sc.close();
    }
}
