import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // An interval of numbers.
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int number2 = sc.nextInt();

        for (int start = number1; start < number2 + 1; start += 1) {
            System.out.println(start);
        }

        sc.close();
    }
}
