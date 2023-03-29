import java.util.Locale;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length + b.length];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value of A: ");
            int value1 = sc.nextInt();

            System.out.print("Enter the " + (pos + 1) + "º value of B: ");
            int value2 = sc.nextInt();

            a[pos] = value1;
            b[pos] = value2;
        }

        int i = 0;
        for (int pos = 0; pos < a.length; pos++) {
            c[i] = a[pos];
            i += 1;
        }

        for (int pos = 0; pos < b.length; pos++) {
            c[i] = b[pos];
            i += 1;
        }

        System.out.print("A: ");
        for (int pos = 0; pos < a.length; pos++) {
            System.out.print(a[pos] + " ");
        }
        System.out.println();

        System.out.print("B: ");
        for (int pos = 0; pos < b.length; pos++) {
            System.out.print(b[pos] + " ");
        }
        System.out.println();

        System.out.print("C: ");
        for (int pos = 0; pos < c.length; pos++) {
            System.out.print(c[pos] + " ");
        }
        System.out.println();

        sc.close();
    }
}
