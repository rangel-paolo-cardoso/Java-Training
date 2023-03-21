package exercise27;

public class Cylinder extends Figure3D implements SurfaceDimension, VolumetricDimension {

    private int radius;
    private int height;

    public Cylinder() {
        super();
    }

    public Cylinder(String name, String color, int radius, int height) {
        super(name, color);
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
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
