package exercise27;

public class Triangle extends Figure2D implements SurfaceDimension {

    private double height;
    private double base;

    public Triangle() {
        super();
    }

    public Triangle(String name, String color, double height, double base) {
        super(name, color);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nBase: " + this.base
        + "\nHeight: " + this.height;
    }
}
