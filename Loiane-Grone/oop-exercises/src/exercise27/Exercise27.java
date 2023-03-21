package exercise27;

import java.util.Locale;

public class Exercise27 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Circle circle = new Circle("Circle1", "Red", 5.7);
        Square square = new Square("Square1", "Blue", 8.1);
        Triangle triangle = new Triangle("Triangle1", "Yellow", 5.2, 2.1);

        Cylinder cylinder = new Cylinder("Cylinder1", "Green", 4.2, 20.0);
        Cube cube = new Cube("Cube1", "Orange", 15.5);
        Pyramid pyramid = new Pyramid("Pyramid1", "Gray", 25.0, 10.5, 12.5);

        GeometricFigure[] geometricFigures = {circle, square, triangle, cylinder, cube, pyramid};

        for (GeometricFigure figure : geometricFigures) {
            System.out.println("--------------------");
            System.out.println(figure.getName());
            if (figure instanceof Figure2D) {
                // Figure2D figure2d = (Figure2D) figure;
                // System.out.println("Total area: " + figure2d.calculateArea() + "\n");
                System.out.println("Total area: " + ((Figure2D) figure).calculateArea());
            } 
            if (figure instanceof Figure3D) {
                System.out.println("Total area: " + ((Figure3D) figure).calculateArea());
                System.out.println("Total volume: " + ((Figure3D) figure).calculateVolume());
            }
        }
    }
}
