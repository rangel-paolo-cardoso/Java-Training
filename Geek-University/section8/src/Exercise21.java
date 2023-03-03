import java.util.Locale;
import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number count its prime factors: ");
        int number = sc.nextInt();

        int cout = countPrimeFactors(number);
        System.out.println("The number of prime factors of " + number +  " is " + cout);

        sc.close();
    }

    static int countPrimeFactors(int number) {
        int count = 0;
        boolean isPrime = true;
        for (int i = 2; i < number; i += 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count += 1;
            }
            isPrime = true;
        }
        return count;
    }
}
