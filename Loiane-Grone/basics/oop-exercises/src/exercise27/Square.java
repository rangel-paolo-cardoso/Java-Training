package exercise27;

public class Square extends Figure2D {

    private double side;

    public Square() {
        super();
    }

    public Square(String name, String color, double side) {
        this.setName(name);
        this.setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return super.toString()
        + "\nSide: " + this.side;
    }
}
