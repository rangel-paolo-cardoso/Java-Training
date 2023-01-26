import java.util.Locale;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value of A: ");
            int value1 = sc.nextInt();

            System.out.print("Enter the " + (pos + 1) + "º value of B: ");
            int value2 = sc.nextInt();

            a[pos] = value1;
            b[pos] = value2;
            if (a[pos] > b[pos]) {
                c[pos] = 1;
            } else if (a[pos] == b[pos]) {
                c[pos] = 0;
            } else {
                c[pos] = -1;
            }
        }

        for (int pos = 0; pos < b.length; pos++) {
            System.out.println("A: " + a[pos]);
            System.out.println("B: " + b[pos]);
            System.out.println("C: " + c[pos] + "\n");
        }

        sc.close();
    }
}
