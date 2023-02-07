import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] a = new double[5];
        double[] b = new double[a.length];
        double scalarProduct = 0.0;

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º floating number for the array A: ");
            a[i] = sc.nextDouble();

            System.out.print("Enter the " + (i + 1) + "º floating number for the array B: ");
            b[i] = sc.nextDouble();
        }

        for (int i = 0; i < a.length; i++) {
            scalarProduct += a[i] * b[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Dot Product: " + scalarProduct);

        sc.close();
    }
}
