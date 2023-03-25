package interfaces;

import java.util.ArrayList;
import java.util.List;

import interfaces.geometry.Circle;
import interfaces.geometry.Shape;
import interfaces.geometry.Square;

public class App {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape circleShape = new Circle();
        Shape squareShape = new Square();

        shapes.add(circleShape);
        shapes.add(squareShape);

        for (Shape shape : shapes) {
            System.out.println(shape.name());
        }
    }
}
