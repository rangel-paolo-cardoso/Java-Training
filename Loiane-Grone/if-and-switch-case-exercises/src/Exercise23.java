import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        if (number == Math.floor(number)) {
            System.out.println(number + " is an integer");
        } else {
            System.out.println(number + " is a decimal");
        }

        sc.close();
    }
}
