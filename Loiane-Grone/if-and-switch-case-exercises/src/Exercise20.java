import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3.0;
        String result = "";

        if (average < 7) {
            result = "Failed";
        } else if (average < 10) {
            result = "Approved";
        } else {
            result = "Approved with distinction";
        }

        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Result: " + result);

        sc.close();
    }
}
