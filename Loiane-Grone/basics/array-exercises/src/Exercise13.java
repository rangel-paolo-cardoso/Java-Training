import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int sumOfMultiplesOfFive = 0;

        for (int pos = 0; pos < a.length; pos += 1) {
            System.out.print("Enter the " + (pos + 1) + "º element: ");
            int number = sc.nextInt();
            a[pos] = number;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                sumOfMultiplesOfFive += a[i];
            }
        }

        System.out.println("The sum of all the array elements is: " + sumOfMultiplesOfFive);

        sc.close();
    }
}
