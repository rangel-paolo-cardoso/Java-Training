import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        int previous = 0;
        int actual = 0;
        int next = 0;
        String sequence = "";

        while (true) {
            sequence += next + " ";
            actual = next;
            next = actual + previous;
            if (next == 0) {
                next = 1;
            }
            previous = actual;
            if (actual > number) {
                break;
            }
        }

        System.out.println(sequence);

        sc.close();
    }
}
