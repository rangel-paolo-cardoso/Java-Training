import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calcule factorial: ");
        int n = sc.nextInt();
        int factorial = 1;
        String expression = "!";

        do {
            if (n < 1 || n > 15) {
                System.out.println("Invalid number! It must be positive and less than 16.");
                System.out.print("Reenter the number to calculate factorial: ");
                n = sc.nextInt();
            } else {
                expression += n + " = ";
                while (true) {
                    factorial *= n;
                    expression += (n != 1) ?  n + " * " : n + " = ";
                    n -= 1;
                    if (n == 0) {
                        break;
                    }
                }
                System.out.println(expression + factorial);
                factorial = 1;

                System.out.print("Do you want to calculate another factorial (y/n)? ");
                String answer = sc.next().toLowerCase();
                if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") ) {
                    expression = "!";
                    System.out.print("Enter the new number: ");
                    n = sc.nextInt();
                } else {
                    break;
                }
            }
        } while(true);

        System.out.println("End of the algorithm!");

        sc.close();
    }
}
