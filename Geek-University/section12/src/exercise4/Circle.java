package exercise4;

public class Circle {
    private double radius;
    private double area;
    private double perimeter;

    final private double PI = 3.141516;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double area, double perimeter) {
        this.radius = radius;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void calculateArea() {
        this.area = PI * radius * radius;
    }

    public void calculatePerimeter() {
        this.area = 2 * PI * radius;
    }

    public String printInfo() {
        return "\nRadius: " + radius
                + ",\nArea: " + area
                + ",\nPerimeter: " + perimeter
                + "\n";
    }
}
