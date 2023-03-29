import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double BASE_PRICE = 1.99;
        double aggregatedSum = 0.0;
        int count = 1;

        System.out.println("Lojas Quase Dois - Tabela de preços");
        do {
            aggregatedSum += BASE_PRICE;
            System.out.printf("%d - R$ %.2f\n", count, aggregatedSum);
            count += 1;
        } while (count < 51);

        sc.close();
    }
}
