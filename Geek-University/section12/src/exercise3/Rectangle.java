package exercise3;

public class Rectangle {
    private double width;
    private double legth;
    private double area;
    private double perimeter;

    public Rectangle() {
    }

    public Rectangle(double width, double legth) {
        this.width = width;
        this.legth = legth;
    }

    public Rectangle(double width, double legth, double area, double perimeter) {
        this.width = width;
        this.legth = legth;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void calculateArea() {
        this.area = this.width * this.legth;
    }

    public void calculatePerimeter() {
        this.perimeter = 2 * (this.width + this.legth);
    }

    public String printInfo() {
        return "\n"
                + "Width: " + this.width
                + ",\nLength: " + this.legth
                + ",\nArea: " + this.area
                + ",\nPerimeter: " + this.perimeter
                + "\n";
    }
}
