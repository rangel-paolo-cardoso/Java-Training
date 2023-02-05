import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            numbers[pos] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
