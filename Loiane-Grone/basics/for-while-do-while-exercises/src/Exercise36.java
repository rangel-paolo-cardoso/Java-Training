import java.util.Locale;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Build the table of: ");
        int number = sc.nextInt();

        System.out.print("Begin with: ");
        int initialPoint = sc.nextInt();

        System.out.print("End with: ");
        int finalPoint = sc.nextInt();

        System.out.println(
            "I'm gonna build the table beginning with "
            + initialPoint + " and ending with "
            + finalPoint + ": "
        );

        while (finalPoint <= initialPoint) {
            System.out.println("Invalid entry! The end of the table must be bigger than the beginning.");
            System.out.print("Reenter the start point: ");
            initialPoint = sc.nextInt();

            System.out.print("Reenter the finishing point: ");
            finalPoint = sc.nextInt();
        }

        for (int count = initialPoint; count <= finalPoint; count += 1) {
            System.out.println(number + " X " + count + " = " + (number * count));
        }

        sc.close();
    }
}
