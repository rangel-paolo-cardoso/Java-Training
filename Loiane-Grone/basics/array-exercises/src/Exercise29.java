import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[20];
        int[] b = new int[a.length / 2];
        int[] c = new int[a.length/ 2];
        int posB = 0;
        int posC = 0;

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value of A: ");
            int value = sc.nextInt();
            a[pos] = value;
            if (value % 2 == 0) {
                b[posB] = value;
                posB += 1;
            } else {
                c[posC] = value;
                posC += 1;
            }
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
