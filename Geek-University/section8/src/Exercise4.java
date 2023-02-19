import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();
        if (isPerfectSquareNumber(number)) {
            System.out.println("Perfect square number.");
        } else {
            System.out.println("It is not a perfect square number.");
        }

        sc.close();
    }

    static boolean isPerfectSquareNumber(int number) {
        double squareRoot = Math.sqrt(number);
        int integerPart = (int) squareRoot;
        if (number < 1 || (squareRoot - integerPart) != 0.0) {
            return false;
        }
        return true;
    }
}
