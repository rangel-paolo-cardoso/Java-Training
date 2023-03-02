import java.util.Locale;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double side1;
        double side2;
        double side3;

        do {
            System.out.print("Enter the first side of a triangle: ");
            side1 = sc.nextDouble();

            System.out.print("Enter the second side of a triangle: ");
            side2 = sc.nextDouble();

            System.out.print("Enter the third side of a triangle: ");
            side3 = sc.nextDouble();

            if (side1 > 0 && side2 > 0 && side3 > 0) {
                break;
            } else {
                System.out.println("Invalid values! They must be greater than zero.");
            }
        } while (true);

        if (validateTriangleSides(side1, side2, side3)) {
            String triangleType = determineTriangleType(side1, side2, side3);
            System.out.printf("The triangle type is %s\n", triangleType);
        } else {
            System.out.println("This is not a triangle!");
        }

        sc.close();
    }

    static boolean validateTriangleSides(double side1, double side2, double side3) {
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            return true;
        }
        return false;
    }

    static String determineTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side1 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else
        return "Scalene";
    }
}
