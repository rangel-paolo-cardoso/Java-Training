import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of catet A: ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of catet B: ");
        double b = sc.nextDouble();
        
        double hypotenuse = calculateHypotenuse(a, b);
        System.out.printf("Hypotenuse: %.2f \n", hypotenuse);

        sc.close();
    }

    static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
