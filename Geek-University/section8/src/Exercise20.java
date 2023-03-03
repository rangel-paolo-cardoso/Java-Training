import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to calculate its factorial: ");
        int n = sc.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n +  " is " + factorial);

        sc.close();
    }

    static int calculateFactorial(int n) {
        return (n > 1) ? n * calculateFactorial(n - 1) : 1;
    }
}
