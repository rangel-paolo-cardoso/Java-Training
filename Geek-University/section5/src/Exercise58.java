import java.util.Locale;
import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform a starting number: ");
        int start = sc.nextInt();

        System.out.print("Inform an ending number: ");
        int end = sc.nextInt();
        long sumOfPrimes = 0;

        boolean isPrime = true;
        for (int i = start; i <= end; i += 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i == 1) {
                isPrime = false;
            }
            if (isPrime) {
                sumOfPrimes += i;
            }
            isPrime = true;
        }

        System.out.printf("The sum of the prime numbers between %d and %d is: %d\n", start, end, sumOfPrimes);

        sc.close();
    }
}
