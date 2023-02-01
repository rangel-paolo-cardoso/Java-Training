import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        for (int i = numbers.length- 1; i > -1; i--) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
