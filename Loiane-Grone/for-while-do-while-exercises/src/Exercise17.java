import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calcule factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        String expression = "!" + n + " = ";

        while (true) {
            factorial *= n;
            expression += (n != 1) ?  n + " * " : n + " = ";
            n -= 1;
            if (n == 0) {
                break;
            }
        }

        System.out.println(expression + factorial);

        sc.close();
    }
}
