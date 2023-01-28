import java.util.Locale;
import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[11];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
