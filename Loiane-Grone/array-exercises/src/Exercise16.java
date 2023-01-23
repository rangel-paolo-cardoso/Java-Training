import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int sumOfNUmbersLowerThan15 = 0;
        int numbersEqualTo15 = 0;
        double averageOfNumbersGreaterThan15 = 0;
        int countForAverage = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "º element: ");
            int number = sc.nextInt();
            if (number < 15) {
                sumOfNUmbersLowerThan15 += number;
            } else if (number == 15) {
                numbersEqualTo15 += 1;
            } else {
                countForAverage += 1;
                averageOfNumbersGreaterThan15 += number;
            }
            a[pos] = number;
        }

        averageOfNumbersGreaterThan15 /= countForAverage;

        System.out.println("The sum of the numbers lower than 15 is: " + sumOfNUmbersLowerThan15);
        System.out.println("The amount of numbers equal to 15 is: " + numbersEqualTo15);
        System.out.println("The average of numbers greater than 15 is: " + averageOfNumbersGreaterThan15);

        sc.close();
    }
}
