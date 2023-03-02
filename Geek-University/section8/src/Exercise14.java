import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the travelled distance by a car in Km: ");
        double distance = sc.nextDouble();

        System.out.print("Enter the amount of gas consumed by the car in Liters: ");
        double gas = sc.nextDouble();

        double consumption = calculateConsumption(distance, gas);
        if (consumption < 8.0) {
            System.out.println("Sell this car!");
        } else if (consumption < 13) {
            System.out.println("Economic!");
        } else {
            System.out.println("Super economic!");
        }
        System.out.printf("The consumption is %.2f Km/L\n", consumption);

        sc.close();
    }

    static double calculateConsumption(double distance, double gas) {
        return distance / gas;
    }
}
