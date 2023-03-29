import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        String format = "%d, %d, %d\n";

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.printf(format, number1, number2, number3);
            } else {
                System.out.printf(format, number1, number3, number2);
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.printf(format, number2, number1, number3);
            } else {
                System.out.printf(format, number2, number3, number1);
            }
        } else {
            if (number2 > number1) {
                System.out.printf(format, number3, number2, number1);
            } else {
                System.out.printf(format, number3, number1, number2);
            }
        }

        sc.close();
    }
}
