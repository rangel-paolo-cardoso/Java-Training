import java.util.Locale;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[15];
        double overallAverage = 0.0;

        for (int pos = 0; pos < grades.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° student's grade: ");
            double grade = sc.nextDouble();
            grades[pos] = grade;
        }

        for (int i = 0; i < grades.length; i++) {
            overallAverage += grades[i];
        }

        overallAverage /= grades.length;

        System.out.printf("Overall average is %.2f\n", overallAverage);

        sc.close();
    }
}
