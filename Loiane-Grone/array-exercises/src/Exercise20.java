import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many reais is a dollar worth? ");
        double reais = sc.nextDouble();

        double[] a = new double[20];

        for (int i = 1; i <= a.length; i++) {
            a[i - 1] = reais * i;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Position " + (i + 1) + ": " + a[i]);
        }

        sc.close();
    }
}
