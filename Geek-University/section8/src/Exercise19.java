import java.util.Locale;
import java.util.Scanner;

public class Exercise19 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();

        int greatestPrimeFactor = calculateGreatesPrimeFactor(number);
        System.out.println("The greatest prime factor is " + greatestPrimeFactor);

        sc.close();
    }

    static int calculateGreatesPrimeFactor(int number) {
        int greatestPrimeFactor = 1;
        boolean isPrime = true;
        for (int i = 1; i < number; i += 1) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                greatestPrimeFactor = i;
            }
            isPrime = true;
        }
        return greatestPrimeFactor;
    }
}
