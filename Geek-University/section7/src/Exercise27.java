import java.util.Locale;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array: ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            boolean isPrime = true;
            if (numbers[i] == 1 || numbers[i] < 1) {
                isPrime = false;
            }
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime: " + numbers[i]);
                System.out.println("Its position in the array: " + i);
            }
            isPrime = true;
        }

        sc.close();
    }
}
