import java.util.Locale;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Range of prime numbers ---");
        System.out.print("Inform a number to be the limit: ");
        int number = sc.nextInt();
        String primes = "2, 3, ";

        for (int count = 4; count <= number; count += 1) {
            int aux = 2;
            boolean isPrime = true;
            while (aux < count) {
                if (count % aux == 0) {
                    isPrime = false;
                }
                aux += 1;
            }
            aux = 2;
            primes += (isPrime) ? count + ", " : "";
        }

        System.out.println(primes);

        sc.close();
    }
}
