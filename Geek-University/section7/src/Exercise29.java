import java.util.Locale;
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];
        int sumOfEvens = 0;
        int numberOfOddNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + "° number to the array: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Even numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                sumOfEvens += numbers[i];
            }
        }
        System.out.println();
        System.out.println("The sum of even numbers is " + sumOfEvens);

        System.out.println("Odd numbers");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
                numberOfOddNumbers += 1;
            }
        }
        System.out.println();
        System.out.println("The amount of odd numbers is " + numberOfOddNumbers);

        sc.close();
    }
}
