import java.util.Locale;
import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary of the employee: ");
        double initialSalary = sc.nextDouble();
        double finalSalary = initialSalary;
        int year = 1995;
        int finalYear = 2002;
        double raiseTax = 1.5 / 100.00;

        do {
            year += 1;
            finalSalary = finalSalary + finalSalary * raiseTax;
            raiseTax *= 2;
        } while (year <= finalYear);

        System.out.println("Current year: " + finalYear);
        System.out.printf("Salary in %d was %.2f\n", year, initialSalary);
        System.out.printf("Current salary in %d is %.2f\n", year, finalSalary);

        sc.close();
    }
}
