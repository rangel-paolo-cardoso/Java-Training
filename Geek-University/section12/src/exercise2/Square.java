package exercise2;

public class Square {
    private double side;
    private double area;
    private double perimeter;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double area, double perimeter) {
        this.side = side;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void calculateArea() {
        this.area = this.side * this.side;
    }

    public void calculatePerimeter() {
        this.perimeter = this.side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String printInfo() {
        return "\n"
                + "Side: " + this.side
                + ",\nArea: " + this.area
                + ",\nPerimeter: " + this.perimeter
                + "\n";
    }
}
