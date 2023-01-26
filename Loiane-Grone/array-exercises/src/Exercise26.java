import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];

        for (int pos = 0; pos < a.length; pos++) {
            System.out.print("Enter the " + (pos + 1) + "º value of A: ");
            int value = sc.nextInt();
            a[pos] = value;            
            if (value < 7) {
                b[pos] = 'a';
            } else if (value == 7) {
                b[pos] = 'b';
            } else if (value > 7 && value < 10) {
                b[pos] = 'c';
            } else if (value == 10) {
                b[pos] = 'd';
            } else {
                b[pos] = 'e';
            }
        }

        System.out.print("A: ");
        for (int pos = 0; pos < b.length; pos++) {
            System.out.print(a[pos] + " ");
        }
        System.out.println();
        System.out.print("B: ");
        for (int pos = 0; pos < b.length; pos++) {
            System.out.print(b[pos] + " ");
        }
        System.out.println();

        sc.close();
    }
}
