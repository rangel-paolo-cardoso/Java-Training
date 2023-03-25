package exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the square side size: ");
        double size = sc.nextDouble();

        Square square = new Square();

        square.calculateArea();
        square.calculatePerimeter();

        System.out.println(square.printInfo());

        sc.close();
    }
}
