import java.util.Locale;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform the amount of CDs: ");
        int amountOfCDs = sc.nextInt();
        int count = 1;
        double invested = 0.0;
        double cdAverageCost = 0.0;

        do {
            System.out.print("Enter the value of the " + count + "º CD: ");
            double cdValue = sc.nextDouble();
            invested += cdValue;
            count += 1;
        } while (count <= amountOfCDs);

        cdAverageCost = invested / amountOfCDs;

        System.out.printf("Total invested on CDs: $ %.2f \n", invested);
        System.out.printf("Average cost per CD: $ %.2f \n", cdAverageCost);

        sc.close();
    }
}
