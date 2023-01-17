import java.util.Locale;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Prime number");
        System.out.print("Inform a number to verify if it is a prime one: ");
        int number = sc.nextInt();
        boolean isPrime = true;

        for (int count = 2; count < number; count += 1) {
            if (number % 2 == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + ((isPrime) ? " is a prime." :" is not a prime."));

        sc.close();
    }
}
