import java.util.Locale;
import java.util.Scanner;

public class Exercise39 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double height = -1;
        double base = -1;
        double area = 0.0;
        do {
            System.out.println("Values cannot be zero or less");
            System.out.print("Enter the height of the triangle: ");
            height = sc.nextDouble();

            System.out.print("Enter the base of the triangle: ");
            base = sc.nextDouble();
        } while (height < 0.0 || base < 0.0);

        area = base * height / 2.0;

        System.out.println("Area of the triangle: " + area);

        sc.close();
    }
}
