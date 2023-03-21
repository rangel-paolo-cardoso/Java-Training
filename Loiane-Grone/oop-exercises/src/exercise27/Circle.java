package exercise27;

public class Circle extends Figure2D implements SurfaceDimension {

    private int radius;

    public Circle() {
        super();
    }

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
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
