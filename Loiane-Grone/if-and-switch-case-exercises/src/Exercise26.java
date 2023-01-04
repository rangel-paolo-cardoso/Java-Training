import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double ALCOHOL_PRICE = 1.90;
        final double GAS_PRICE = 2.50;

        System.out.print("Which fuel would you like to fill the tank with (G, A)? ");
        char fuel = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter how many liters you would like: ");
        int litters = sc.nextInt();

        double unitPriceWithDiscount = 0.0;
        double total = 0.0;

        switch (fuel) {
            case 'A':
                if (litters < 21) {
                    unitPriceWithDiscount = ALCOHOL_PRICE - (ALCOHOL_PRICE * (3 / 100.00));
                } else {
                    unitPriceWithDiscount = ALCOHOL_PRICE - (ALCOHOL_PRICE * (5 / 100.00));
                }
                break;
            case 'G':
                if (litters < 21) {
                    unitPriceWithDiscount = GAS_PRICE - (GAS_PRICE * (4 / 100.00));
                } else {
                    unitPriceWithDiscount = GAS_PRICE - (GAS_PRICE * (6 / 100.00));
                }
                break;
            default:
                break;
        }

        total = unitPriceWithDiscount * litters;
        System.out.printf("Total bill to pay: R$ %.2f\n", total);

        sc.close();
    }
}
