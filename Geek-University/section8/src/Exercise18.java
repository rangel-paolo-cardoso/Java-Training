import java.util.Locale;
import java.util.Scanner;

public class Exercise18 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number X: ");
        double x = sc.nextDouble();

        System.out.print("Enter a number Z: ");
        double z = sc.nextDouble();

        double exponentiation = calculateExponentiation(x, z);
        System.out.println("The exponentiation is " + exponentiation);

        sc.close();
    }

    static double calculateExponentiation(double x, double z) {
        double exponentiation = 1;
        for (int i = 0; i < z; i += 1) {
            exponentiation *= x;
        }
        return exponentiation;
    }
}
