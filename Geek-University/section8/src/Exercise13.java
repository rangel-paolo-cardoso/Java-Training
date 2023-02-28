import java.util.Locale;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter another whole number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter a symbol (+ - * /): ");
        char symbol = sc.next().toLowerCase().charAt(0);

        double result = calculateOperation(number1, number2, symbol);
        System.out.printf("%d %c %d = %.2f\n", number1, symbol, number2, result);

        sc.close();
    }

    static double calculateOperation(int number1, int number2, char symbol) {
        switch (symbol) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    System.out.println("Invalid division!");
                }
                break;
            default:
                System.out.println("Invalid symbol!");
        }

        return 0.0;
    }
}
