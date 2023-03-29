import java.util.Locale;
import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        sc.close();
    }
}
