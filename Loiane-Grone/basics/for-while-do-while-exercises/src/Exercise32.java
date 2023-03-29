import java.util.Locale;
import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform a number to calculate the factorial: ");
        int n = sc.nextInt();
        int fat = 1;
        String expresion = n + "! = ";

        System.err.println("Factorial of: " + n);

        while (true) {
            fat *= n;
            if (n == 1) {
                expresion += n + " = " + fat;
                break;
            }
            expresion += n + " . ";
            n -= 1;
        }

        System.out.println(expresion);

        sc.close();
    }
}
