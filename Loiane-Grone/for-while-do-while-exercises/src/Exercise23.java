import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int limit = sc.nextInt();
        int number = 2;
        int iterationsToFindPrime = 0;
        String primeNumbers = "";

        while (number <= limit) {
            int aux = 1;
            boolean isNumberPrime = true;
            int amountOfDivisors = 0;
            while (aux <= number) {
                amountOfDivisors += (number % aux == 0) ? 1 : 0;
                if (amountOfDivisors > 2) {
                    isNumberPrime = false;
                    break;
                }
                
                iterationsToFindPrime += 1;
                aux += 1;
            }

            if (isNumberPrime) {
                primeNumbers += number + ", ";
            }
            number += 1;
        }

        System.out.println(primeNumbers);
        System.out.println("Number of iterations to find the prime numbers: " + iterationsToFindPrime);

        sc.close();
    }
}
