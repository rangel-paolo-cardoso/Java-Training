import java.util.Locale;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[15];
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter the " + (i + 1) + "º number of A: ");
            int number = sc.nextInt();
            a[i] = number;
        }

        int fat = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                b[i] = a[i];
            } else {
                for (int j = a[i]; j > 1; j--) {
                    fat *= j;
                }
                b[i] = fat;
                fat = 1;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        sc.close();
    }
}
