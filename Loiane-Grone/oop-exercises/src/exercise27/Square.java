package exercise27;

public class Square extends Figure2D implements SurfaceDimension {

    private int side;

    public Square() {
        super();
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
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
