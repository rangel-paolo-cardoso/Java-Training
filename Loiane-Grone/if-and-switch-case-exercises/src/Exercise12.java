import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly wage for the employee: ");
        double wage = sc.nextDouble();

        System.out.print("Enter hours worked by the employee: ");
        int workedHours = sc.nextInt();
        double grossSalary = workedHours * wage;
        double taxPercentage = 0.0;
        double taxValue = 0.0;
        double inssDiscount = 0.0;
        double inssPercentage = 0.0;
        double netSalary = 0.0;

        if (grossSalary <= 900) {
            System.out.println("Income tax exemption");
        } else if (grossSalary <= 1500) {
            taxPercentage = (5 / 100.00);
            taxValue = (grossSalary * taxPercentage);
        } else if (grossSalary <= 2500) {
            taxPercentage = (10 / 100.00);
            taxValue = (grossSalary * taxPercentage);
        } else {
            taxPercentage = (20 / 100.00);
            taxValue = (grossSalary * taxPercentage);
        }

        inssPercentage = (10 / 100.00);
        inssDiscount = (grossSalary * inssPercentage);

        netSalary = grossSalary - (taxValue + inssDiscount);

        System.out.printf("Gross salary: (%.0f * %d)\t\t: R$ %.2f\n", wage, workedHours, grossSalary);
        System.out.printf("( - ) IR (%.0f%%)\t\t\t: R$ %.2f\n", (taxPercentage * 100), taxValue);
        System.out.printf("( - ) INSS (%.0f%%)\t\t: R$ %.2f\n", (inssPercentage * 100), inssDiscount);
        System.out.printf("Total discounts\t\t\t: R$ %.2f\n", (taxValue + inssDiscount));
        System.out.printf("Net salary\t\t\t: R$ %.2f\n", netSalary);

        sc.close();
    }
}
