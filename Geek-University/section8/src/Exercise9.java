import java.util.Locale;
import java.util.Scanner;

public class Exercise9 {

    private static final double PI = 3.141592;
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of a cylinder: ");
        double height = sc.nextDouble();
        
        double volume = calculateCylinderVolume(radius, height);
        System.out.printf("Volume: %.6f \n", volume);

        sc.close();
    }

    static double calculateCylinderVolume(double radius, double height) {
        return PI * radius * radius * height;
    }
}
