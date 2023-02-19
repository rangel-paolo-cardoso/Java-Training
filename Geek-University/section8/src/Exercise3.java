import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        int evaluation = evaluateNumberSign(number);
        if (evaluation < 0) {
            System.out.println("Negative");
        } else if (evaluation == 0) {
            System.out.println("Neuter");
        } else {
            System.out.println("Positive");
        }
        sc.close();
    }

    static int evaluateNumberSign(double number) {
        return (number < 0)
                ? -1
                : (number == 0) ? 0 : 1;
    }
}
