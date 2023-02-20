import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of a sphere: ");
        double radius = sc.nextDouble();
        System.out.println("The volume is " + calculateSphereVolume(radius));

        sc.close();
    }

    static double calculateSphereVolume(double radius) {
        return (4 / 3) * Math.PI * (radius * radius * radius);
    }
}
