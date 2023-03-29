import java.util.Locale;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º number of A: ");
            int number = sc.nextInt();
            a[i] = number;

            for (int j = 0; j <= number; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " is an even number.");
                }
            }
        }

        sc.close();
    }
}
