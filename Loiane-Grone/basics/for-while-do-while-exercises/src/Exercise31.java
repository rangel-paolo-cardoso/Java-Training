import java.util.Locale;
import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("You need to enter the price of each product of the store.");
        System.out.println("Type 0 as a price to stop registring the price of the products.\n\n");
        int count = 1;
        double total = 0.0;

        System.out.println("Lojas Tabajara");
        do {
            System.out.print("Product " + count + ": R$ ");
            double productPrice = sc.nextDouble();
            total += productPrice;
            if (productPrice == 0) {
                break;
            }
            count += 1;
        } while (true);

        System.out.printf("Total: R$ %.2f\n", total);
        System.out.print("Cash: R$ ");
        double cash = sc.nextDouble();

        if (cash >= total) {
            double change = cash - total;
            System.out.printf("Change: R$ %.2f\n", change);
        } else {
            System.out.println("Insuffient amount of cash!");
        }
        System.out.println("...");

        sc.close();
    }
}
