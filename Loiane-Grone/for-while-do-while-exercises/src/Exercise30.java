import java.util.Locale;
import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe the bread price: ");
        double breadPrice = sc.nextDouble();
        double aggregatedSum = 0.0;
        int count = 1;

        System.out.printf("Bread price: R$ %.2f \n", breadPrice);
        do {
            aggregatedSum += breadPrice;
            System.out.printf("%d - R$ %.2f \n", count, aggregatedSum);
            count += 1;
        } while (count < 51);

        sc.close();
    }
}
