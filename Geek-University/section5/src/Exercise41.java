import java.util.Locale;
import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = 0.0;

        do {
            System.out.print("Enter the value for R1: ");
            double r1 = sc.nextDouble();

            System.out.print("Enter the value for R2: ");
            double r2 = sc.nextDouble();
            if (r1 == 0.0 || r2 == 0.0) {
                break;
            }
            r = (r1 * r2) / (r1 + r2);
            System.out.println("R = " + r);
        } while (true);

        sc.close();
    }
}
