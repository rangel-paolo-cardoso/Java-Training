import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        double averageOfOddNumber = 0.0;
        int count = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "º element: ");
            int number = sc.nextInt();
            a[pos] = number;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count += 1;
                averageOfOddNumber += a[i];
            }
        }

        averageOfOddNumber /= count;

        System.out.println("The average of all the odd numbers is: " + averageOfOddNumber);

        sc.close();
    }
}
