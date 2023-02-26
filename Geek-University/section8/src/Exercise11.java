import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter a second grade: ");
        double grade2 = sc.nextDouble();

        System.out.print("Enter a third grade: ");
        double grade3 = sc.nextDouble();

        System.out.print("Enter a letter (A for arithmetic, W for Weighted average): ");
        char averageType = sc.next().toUpperCase().charAt(0);

        double average = calculateAverage(grade1, grade2, grade3, averageType);
        System.out.printf("The average is %.2f\n", average);

        sc.close();
    }

    static double calculateAverage(double grade1, double grade2, double grade3, char type) {
        if (type == 'A') {
            return (grade1 + grade2 + grade3) / 3.0;
        }
        return (grade1 * 5 + grade2 * 3 + grade3 * 2) / (5 + 3 + 2);
    }
}
