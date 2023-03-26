package exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the circle's radius: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println(circle.printInfo());

        sc.close();
    }
}
