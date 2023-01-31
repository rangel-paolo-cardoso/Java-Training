import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int largestNumber = Integer.MIN_VALUE;
        int largestNumberPosition = 0;

        for (int pos = 0; pos < numbers.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "° value: ");
            int value = sc.nextInt();
            numbers[pos] = value;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
                largestNumberPosition = i;
            }
        }

        System.out.println("The largest number is " + largestNumber);
        System.out.println("Its position in the array is " + largestNumberPosition);

        sc.close();
    }
}
