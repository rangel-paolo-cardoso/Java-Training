import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        int number;

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter the" + (i + 1) + "º number for the array A: ");
            number = sc.nextInt();
            a[i] = number;

            System.out.print("Enter the" + (i + 1) + "º number for the array B: ");
            number = sc.nextInt();
            b[i] = number;
        }

        int[] c = new int[a.length + b.length];
        for (int posC = 0, posA = 0; posC < c.length; posC++) {
            if (posC % 2 == 0) {
                c[posC] = a[posA];
                posA += 1;
            }
        }
        for (int posC = 0, posB = 0; posC < c.length; posC++) {
            if (posC % 2 != 0) {
                c[posC] = b[posB];
                posB += 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
