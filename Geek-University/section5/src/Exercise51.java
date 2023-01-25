import java.util.Locale;
import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int year = 1995;
        double currentSalary = 2_000.00;
        double incomeTaxRate = 1.5 / 100.00;
        double salaryRaise = 0.0;

        for (int i = 1; i < 28; i++) {
            if (i > 1) {
                salaryRaise *= 2;
                currentSalary += salaryRaise;
            } else {
                salaryRaise = currentSalary * incomeTaxRate;
                currentSalary += salaryRaise;
            }
            year += 1;
        }

        System.out.printf("Current salary: %.2f\n", currentSalary);

        sc.close();
    }
}
