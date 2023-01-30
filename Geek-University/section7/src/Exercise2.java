import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for (int pos = 0; pos < a.length; pos +=1 ) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            a[pos] = value;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}
