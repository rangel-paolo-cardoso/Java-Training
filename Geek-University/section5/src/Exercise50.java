import java.util.Locale;
import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double chicosHeight = 1.50;
        double chicosYearlyGrowthRate = 0.02;

        double zesHeight = 1.10;
        double zesYearlyGrowthRate = 0.03;
        int years = 0;

        do {
            chicosHeight += chicosYearlyGrowthRate;
            zesHeight += zesYearlyGrowthRate;
            years += 1;
        } while (zesHeight < chicosHeight);

        System.out.println("It'll take " + years + " years for Zé to be taller than Chico");
        System.out.println("Chico's height: " + chicosHeight);
        System.out.println("Zé's height: " + zesHeight);

        sc.close();
    }
}
