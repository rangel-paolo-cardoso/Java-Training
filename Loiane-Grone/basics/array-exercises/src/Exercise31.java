import java.util.Locale;
import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º number of A: ");
            int number = sc.nextInt();
            a[i] = number;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
            System.out.println();
        }

        sc.close();
    }
}
