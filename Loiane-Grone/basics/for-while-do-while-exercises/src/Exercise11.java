import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // An interval of numbers with sum at end.
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter a second number: ");
        int number2 = sc.nextInt();

        int sum = 0;

        for (int start = number1; start < number2 + 1; start += 1) {
            System.out.println(start);
            sum += start;
        }

        System.out.println("The sum is " +  sum);
        
        sc.close();
    }
}
