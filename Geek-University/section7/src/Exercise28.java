import java.util.Locale;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] v = new int[10];
        int[] v1 = new int[10];
        int[] v2 = new int[10];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array: ");
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                v2[i] = v[i];
            } else {
                v1[i] = v[i];
            }
        }

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != 0) {
                System.out.print(v1[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < v2.length; i++) {
            if (v2[i] != 0) {
                System.out.print(v2[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
