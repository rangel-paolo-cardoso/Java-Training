import java.util.Locale;
import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double average = 0.0;
        double sum = 0.0;
        double standardDeviation = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array: ");
            numbers[i] = sc.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average /= numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i] - average, 2);
        }

        standardDeviation = Math.sqrt((1.0 / (numbers.length - 1.0)) * sum);

        System.out.println("Standard deviation: " + standardDeviation);

        sc.close();
    }
}
