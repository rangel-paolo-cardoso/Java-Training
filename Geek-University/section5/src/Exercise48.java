import java.util.Locale;
import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a positive number: ");
        // int number = 4_000_000;
        int previous = 0;
        int actual = 0;
        int next = 0;
        // String sequence = "";
        int sumOfEvenNumbers = 0;

        while (true) {
            // sequence += next + " ";
            actual = next;
            next = actual + previous;
            if (next == 0) {
                next = 1;
            }
            previous = actual;
            if (next % 2 == 0 && sumOfEvenNumbers + next <= 4_000_000) {
                sumOfEvenNumbers += next;
            } else if (sumOfEvenNumbers + next > 4_000_000) {
                break;
            }
        }

        System.out.println(sumOfEvenNumbers);

        sc.close();
    }
}
