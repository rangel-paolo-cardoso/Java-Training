import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value: ");
            int value = sc.nextInt();
            if (a[pos] % 2 != 0) {
                break;
            }
            a[pos] = value;
            System.out.println("The number " + a[pos] + " is even.");
        }

        sc.close();
    }
}
