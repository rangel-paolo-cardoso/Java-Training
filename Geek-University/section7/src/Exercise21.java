import java.util.Locale;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[a.length];
        int[] c = new int[a.length];
        int number;

        // while (count < 10) {
        //     System.out.print("Enter a number between 0 and 50 (including both): ");
        //     number = sc.nextInt();

        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter the" + (i + 1) + "º number for the array A: ");
            number = sc.nextInt();
            a[i] = number;

            System.out.print("Enter the" + (i + 1) + "º number for the array B: ");
            number = sc.nextInt();
            b[i] = number;
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("C: " + c[i]);
        }

        sc.close();
    }
}
