import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the inhabitants of the population A: ");
        double populationA = sc.nextDouble();
        System.out.print("Enter the poplation A annual's growth rate (%): ");
        double annualGrowthRateA = sc.nextDouble() / 100.00;

        System.out.print("Enter the inhabitants of the population B: ");
        double populationB = sc.nextDouble();
        System.out.print("Enter the poplation B annual's growth rate (%): ");
        double annualGrowthRateB = sc.nextDouble() / 100.00;

        int years = 0;

        while (true) {
            if (
                populationA <= 0
                || populationB <= 0
                || annualGrowthRateA <= 0
                || annualGrowthRateB <= 0
            ) {
                System.out.println("Invalid information! Reenter the values...");
                System.out.print("Population A inhabitants: ");
                populationA = sc.nextDouble();
                System.out.print("Population A annual's growth rate (%): ");
                annualGrowthRateA = sc.nextDouble() / 100.00;

                System.out.print("Population B inhabitants: ");
                populationB = sc.nextDouble();
                System.out.print("Population B annual's growth rate (%): ");
                annualGrowthRateB = sc.nextDouble() / 100.00;
            } else {
                break;
            }
        }

        while (populationA < populationB) {
            populationA += populationA * annualGrowthRateA;
            populationB += populationB * annualGrowthRateB;
            years += 1;
        }

        System.out.println(
            "It will take "
            + years
            + " years for population A to become larger than population B"
        );

        sc.close();
    }
}
