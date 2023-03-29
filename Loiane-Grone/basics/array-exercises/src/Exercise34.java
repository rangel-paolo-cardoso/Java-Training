import java.util.Locale;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º number of A: ");
            int number = sc.nextInt();
            a[i] = number;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.println(a[i] + " is divisible by " + j);
                }
            }
        }

        sc.close();
    }
}
