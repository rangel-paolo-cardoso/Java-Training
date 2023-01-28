import java.util.Locale;
import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        boolean isPrime = true;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º number of A: ");
            int number = sc.nextInt();
            a[i] = number;

            if (number == 1) {
                isPrime = false;
                System.out.println(number + " is not a prime number.");
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    System.out.println(number + " is not a prime number.");
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            }
            isPrime = true;
        }

        sc.close();
    }
}
