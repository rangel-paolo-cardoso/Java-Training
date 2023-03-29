import java.util.Locale;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Population A has 80,000 inhabitants.");
        System.out.println("Its annual growth rate is 3%.");
        double populationA = 80_000.00;
        double annualGrowthRateA = 3 / 100.00;

        System.out.println("Population B has 200,000 inhabitants.");
        System.out.println("Its annual growth rate is 1.5%");
        double populationB = 200_000.00;
        double annualGrowthRateB = 1.5 / 100.00;

        int years = 0;

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
    }
}
