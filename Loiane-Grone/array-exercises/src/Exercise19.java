import java.util.Locale;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] grades1 = new double[10];
        double[] grades2 = new double[grades1.length];
        double[] result = new double[grades1.length];

        for (int pos = 0; pos < 2; pos++) {
            System.out.print("Enter the 1º grade for the " + (pos + 1) + "º student: ");
            double grade1 = sc.nextDouble();
            grades1[pos] = grade1;

            System.out.print("Enter the 2º grade for the " + (pos + 1) + "º student: ");
            double grade2 = sc.nextDouble();
            grades2[pos] = grade2;

            result[pos] = (grade1 + grade2) / 2.0;
            System.out.println();
        }

        for (int pos = 0; pos < result.length; pos++) {
            System.out.printf("%d º student's average: %.2f\n", (pos + 1), result[pos]);
            if (result[pos] >= 7) {
                System.err.println("Result: Passed!");
            } else {
                System.err.println("Result: Failed!");
            }
        }

        sc.close();
    }
}
