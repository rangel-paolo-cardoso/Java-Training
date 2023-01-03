import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("----Second Degree Equation----");
        System.out.print("Enter the A term of the equation: ");
        double a = sc.nextDouble();

        if (a != 0) {
            System.out.print("Enter the B term of the equation: ");
            double b = sc.nextDouble();

            System.out.print("Enter the C term of the equation: ");
            double c = sc.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("There are no real roots!");
            } else if (delta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("There is a unique root...");
                System.out.println("x: " + x);
            } else {
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("There are two real roots...");
                System.out.println("x': " + x1);
                System.out.println("x'': " + x2);
            }
        } else {
            System.out.println("This is not a second degree equation!");
        }

        sc.close();
    }
}
