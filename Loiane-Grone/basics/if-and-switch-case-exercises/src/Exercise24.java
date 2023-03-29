import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter another number: ");
        double number2 = sc.nextDouble();

        System.out.print("Which mathematical operation do you want? ( + - * / ): ");
        char operation = sc.next().charAt(0);

        double result = 0.0;

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("The division " + number1 + "/" + number2 + " is not possible");
                }
                break;
            default:
                System.out.println("Invalid command!");
                break;
        }

        System.out.println("The result is " + result);
        System.out.println(result + " is " + ((result > 0) ? "positive": "negative"));
        System.out.println(result + " is " + ((result == Math.floor(result)) ? "an integer" : "a decimal"));

        sc.close();
    }
}
