import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int largestValue = Integer.MIN_VALUE;
        int smallestValue = Integer.MAX_VALUE;
        int positionOfLargestValue = 0;
        int positionOfSmallestValue = 0;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the" + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestValue) {
                largestValue = numbers[i];
                positionOfLargestValue = i;
            }
            if (numbers[i] < smallestValue) {
                smallestValue = numbers[i];
                positionOfSmallestValue = i;
            }
        }

        System.out.println("Position of the largest value: " + positionOfLargestValue);
        System.out.println("Position of the smallest value: " + positionOfSmallestValue);

        sc.close();
    }
}
