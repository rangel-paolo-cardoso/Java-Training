import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        int amountOfNegatives = 0;
        int sumOfPositives = 0;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° floating point number: ");
            double grade = sc.nextDouble();
            numbers[pos] = grade;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                amountOfNegatives += 1;
                System.out.println("Negative: " + numbers[i]);
            } else {
                sumOfPositives += numbers[i];
            }
        }

        System.out.println("Amount of negative numbers: " + amountOfNegatives);
        System.out.println("Sum of positive numbers: " + sumOfPositives);

        sc.close();
    }
}
