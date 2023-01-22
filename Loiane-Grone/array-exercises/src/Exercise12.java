import java.util.Locale;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int sumOfTheElementsOfA = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "º element: ");
            int number = sc.nextInt();
            a[pos] = number;
        }

        for (int i = 0; i < a.length; i++) {
            sumOfTheElementsOfA += a[i];
        }

        System.out.println("The sum of all the array elements is: " + sumOfTheElementsOfA);

        sc.close();
    }
}
