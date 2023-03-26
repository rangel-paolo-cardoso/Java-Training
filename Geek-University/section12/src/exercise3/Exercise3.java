package exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rectangle width: ");
        double width = sc.nextDouble();

        System.out.print("Enter the rectangle length: ");
        double length = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println(rectangle.printInfo());

        sc.close();
    }
}
