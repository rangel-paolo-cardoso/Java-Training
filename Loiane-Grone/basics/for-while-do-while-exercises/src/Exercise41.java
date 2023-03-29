import java.util.Locale;
import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of installments \t interest % over the value of the initial debit");
        System.out.println("1  \t\t\t 0");
        System.out.println("3  \t\t\t 10");
        System.out.println("6  \t\t\t 15");
        System.out.println("9  \t\t\t 20");
        System.out.println("12 \t\t\t 25\n");

        System.out.print("Enter the value of the debit: ");
        double debit = sc.nextDouble();

        System.out.print("Enter the number of installments: ");
        int numberOfinstallments = sc.nextInt();
        double interestTax = 0.0;
        double total = 0.0;
        double installmentValue = 0.0;

        if (numberOfinstallments < 3) {
            interestTax = 0.0;
        } else if (numberOfinstallments < 6) {
            interestTax = 10 / 100.0;
        } else if (numberOfinstallments < 9) {
            interestTax = 15 / 100.0;
        } else if (numberOfinstallments < 12) {
            interestTax = 20 / 100.0;
        } else {
            interestTax = 25 / 100.0;
        }

        total = debit * (1 + interestTax);
        installmentValue = total / numberOfinstallments;

        System.out.println("Debit value\tInterest value\tNumber of installments\tInstallment value");
        System.out.printf("%.2f \t %.2f \t\t %d \t\t\t %.2f\n", total, interestTax, numberOfinstallments, installmentValue);

        sc.close();
    }
}
