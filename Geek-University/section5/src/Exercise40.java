import java.util.Locale;
import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int highestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        System.out.println("Enter a negative number to stop.");
        do {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }
            if (number > highestNumber) {
                highestNumber = number;
            }
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        } while (true);

        System.out.println("The highest number is " + highestNumber);
        System.out.println("The lowest number is " + lowestNumber);

        sc.close();
    }
}
