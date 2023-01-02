import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of a triangle: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of a triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of a triangle: ");
        double side3 = sc.nextDouble();

        boolean isTriangle = (side1 < side2 + side3) || (side2 < side1 + side3) || (side3 < side1 + side2);

        if (isTriangle) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral triangle");
            } else if (side1 == side2 || side1 == side3) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Those aren't measurements of a triangle!");
        }

        sc.close();
    }
}
