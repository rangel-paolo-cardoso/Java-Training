import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee's salary: ");
        double currentSalary = sc.nextDouble();
        double readjustedSalary = 0.0;
        double readjustmentPercentage = 0.0;
        String format = "%.2f\n";

        if (currentSalary <= 280.00) {
            readjustmentPercentage = 20 / 100.0;
        } else if (currentSalary <= 700.00) {
            readjustmentPercentage = 15 / 100.0;
        } else if (currentSalary <= 1500.00) {
            readjustmentPercentage = 10 / 100.0;
        } else {
            readjustmentPercentage = 5 / 100.0;
        }

        readjustedSalary = currentSalary * (1 + readjustmentPercentage);
        System.out.printf("Current salaray: R$" + format, currentSalary);
        System.out.printf("Raise percentage: %%" + format, readjustmentPercentage);
        System.out.printf("Raise amount: R$" + format, (readjustedSalary - currentSalary));
        System.out.printf("New salary: R$" + format, readjustedSalary);

        sc.close();
    }
}
