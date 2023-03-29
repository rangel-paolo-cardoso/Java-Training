import java.util.Locale;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value: ");
            int value = sc.nextInt();
            a[pos] = value;
            b[b.length - 1 - pos] = value;
        }

        System.out.print("A: ");
        for (int pos = 0; pos < b.length; pos++) {
            System.out.print(a[pos] + " ");
        }
        System.out.println();
        System.out.print("B: ");
        for (int pos = 0; pos < b.length; pos++) {
            System.out.print(b[pos] + " ");
        }
        System.out.println();

        sc.close();
    }
}
