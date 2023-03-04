import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to calculate a series: ");
        int n = sc.nextInt();

        double summation = calculateSummations(n);
        System.out.println("The summation is " + summation);

        sc.close();
    }

    static double calculateSummations(int n) {
        int summmation = 0;
        for (int i = 1; i <= n; i++) {
            summmation += i;
        }
        return summmation;
    }
}
