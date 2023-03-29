import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value: ");
            int value = sc.nextInt();
            a[pos] = value;
            if (a[pos] % 2 == 0) {
                b[pos] = 1;
            } else {
                b[pos] = 0;
            }
        }

        for (int pos = 0; pos < b.length; pos++) {
            System.out.println("A: " + a[pos]);
            System.out.println("B: " + b[pos] + "\n");
        }

        sc.close();
    }
}
