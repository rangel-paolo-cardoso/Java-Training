import java.util.Locale;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String expression1 = "";
        int exp1 = 0;
        String expression2 = "";
        int exp2 = 0;
        String expression3 = "";
        int exp3 = 0;

        for (int i = 1; i <= n; i += 1) {
            exp1 += 1;
            expression1 += (i < n) ? i + " + " : i + " = ";
        }

        for (int i = 1; i <= (2 * n - 1); i += 1) {
            if (i % 2 == 0) {
                exp2 += 1;
                expression2 += (i != (2 * n - 1)) ? i + " - " : i + " = ";
            } else {
                exp2 += 1;
                expression2 += (i != (2 * n - 1)) ? i + " + " : i + " = ";
            }
        }

        for (int i = 1; i <= (2 * n - 1); i += 2) {
            exp3 += 1;
            expression3 += (i != (2 * n - 1)) ? i + " + " : i + " = ";
        }

        System.out.println(expression1 + exp1);
        System.out.println(expression2 + exp2);
        System.out.println(expression3 + exp3);

        sc.close();
    }
}
