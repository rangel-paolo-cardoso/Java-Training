package exercise27;

public class Circle extends Figure2D {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(String name, String color, double radius) {
        this.setName(name);
        this.setColor(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nRadius: " + this.radius;
    }
}
