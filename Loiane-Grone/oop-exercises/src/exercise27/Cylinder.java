package exercise27;

public class Cylinder extends Figure3D {

    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(String name, String color, double radius, double height) {
        this.setName(name);
        this.setColor(color);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nRadius: " + this.radius
        + "\nHeight: " + this.height;
    }
}
