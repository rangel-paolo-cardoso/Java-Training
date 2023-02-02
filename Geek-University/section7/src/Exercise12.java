import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int largestValue = Integer.MIN_VALUE;
        int smallestValue = Integer.MAX_VALUE;
        double average = 0.0;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestValue) {
                largestValue = numbers[i];
            }
            if (numbers[i] < smallestValue) {
                smallestValue = numbers[i];
            }
            average += numbers[i];
        }

        average /= numbers.length;

        System.out.println("Largest value: " + largestValue);
        System.out.println("Smallest value: " + smallestValue);
        System.out.println("Average value: " + average);

        sc.close();
    }
}
