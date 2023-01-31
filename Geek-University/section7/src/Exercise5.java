import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int amountOsEvens = 0;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                amountOsEvens += 1;
            }
        }

        System.out.println("The array holds " + amountOsEvens + " even numbers.");

        sc.close();
    }
}
