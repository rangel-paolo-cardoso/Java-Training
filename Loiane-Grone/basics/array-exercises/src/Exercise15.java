import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        double percentageOfOddNumbers = 0.0;
        double percentageOfEvenNumbers = 0.0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "º element: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                percentageOfEvenNumbers += 1;
            } else {
                percentageOfOddNumbers += 1;
            }
            a[pos] = number;
        }

        percentageOfOddNumbers = percentageOfOddNumbers / a.length * 100.0;
        percentageOfEvenNumbers = percentageOfEvenNumbers / a.length * 100.0;

        System.out.println(percentageOfOddNumbers + "% of odd numbers.");
        System.out.println(percentageOfEvenNumbers + "% of even numbers.");

        sc.close();
    }
}
