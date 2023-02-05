import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int[] otherNumbers = new int[numbers.length];
        int count = 0;
        int number;

        while (count < 10) {
            System.out.print("Enter a number between 0 and 50 (including both): ");
            number = sc.nextInt();
            if (number < 0 || number > 50) {
                System.out.println("Invalid!");
                System.out.print("Reenter a number between 0 and 50 (including both): ");
                number = sc.nextInt();
            } else {
                numbers[count] = number;
                count += 1;
            }
        }

        // for (int i = 0; i < numbers.length; i++) {
        //     if (numbers[i] % 2 != 0) {
        //         count += 1;
        //     }
        // }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                otherNumbers[i] = numbers[i];
            }
        }

        for (int i = 0; i < otherNumbers.length; i++) {
            System.out.println(numbers[i] + " " + otherNumbers[i]);
        }

        sc.close();
    }
}
