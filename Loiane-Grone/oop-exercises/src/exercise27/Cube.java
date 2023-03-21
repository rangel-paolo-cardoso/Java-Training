package exercise27;

public class Cube extends Figure3D {

    private double side;

    public Cube() {
        super();
    }

    public Cube(String name, String color, double side) {
        this.setName(name);
        this.setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side * 6;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nSide: " + this.side;
    }
}
