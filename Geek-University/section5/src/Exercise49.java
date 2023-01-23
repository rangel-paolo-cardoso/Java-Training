import java.util.Locale;
import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter João's salary: ");
        double joaoSalary = sc.nextDouble();

        System.out.print("Enter João's savings income rate (%): ");
        double joaoSavingIncomeRate = sc.nextDouble() / 100.0;

        double carlosSalary = joaoSalary * 3.0;

        System.out.print("Enter Carlos's savings income rate (%): ");
        double carlosSavingIncomeRate = sc.nextDouble() / 100.0;

        int months = 0;

        do {
            joaoSalary += joaoSalary * joaoSavingIncomeRate;
            carlosSalary += carlosSalary * carlosSavingIncomeRate;
            months += 1;
        }
        while (joaoSalary <= carlosSalary);

        System.out.println("How many months it took to get the income: " + months);
        System.out.printf("Final savings for João: %.2f\n", joaoSalary);
        System.out.printf("Final savings for Carlos: %.2f\n", carlosSalary);

        sc.close();
    }
}
