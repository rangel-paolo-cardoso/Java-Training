import java.util.Locale;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many kilograms (Kg) of strawberries you wish: ");
        int strawberriesWeight = sc.nextInt();

        System.out.print("Enter how many kilograms (Kg) of apples you wish: ");
        int applesWeight = sc.nextInt();

        double unitPriceOfStrawberriesPerWeight = 0.0;
        double unitPriceOfApplesPerWeight = 0.0;
        double total = 0.0;

        if (strawberriesWeight < 6) {
            unitPriceOfStrawberriesPerWeight = 2.50;
        } else {
            unitPriceOfStrawberriesPerWeight = 2.20;
        }

        if (applesWeight < 6) {
            unitPriceOfApplesPerWeight = 1.80;
        } else {
            unitPriceOfApplesPerWeight = 1.50;
        }

        total = unitPriceOfStrawberriesPerWeight * strawberriesWeight + unitPriceOfApplesPerWeight * applesWeight;

        if (total > 25.00 || (applesWeight + strawberriesWeight) > 8) {
            total -= total * (10 / 100.00);
        }

        System.out.println("Amount of stawberries: " + strawberriesWeight + "Kg");
        System.out.println("Amount of apples: " + applesWeight + "Kg");
        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
