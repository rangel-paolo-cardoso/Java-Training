package exercise27;

public class Pyramid extends Figure3D {

    private double height;
    private double baseWidth;
    private double baseLength;

    public Pyramid() {
        super();
    }    

    public Pyramid(String name, String color, double height, double baseWidth, double baseLength) {
        this.setName(name);
        this.setColor(color);
        this.height = height;
        this.baseWidth = baseWidth;
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    @Override
    public double calculateArea() {
        double squaredLeg1 = height * height;
        double squaredLeg2 = (baseWidth * baseWidth) / 4.0;
        double hypotenuse = Math.sqrt(squaredLeg1 + squaredLeg2);
        double triangleArea1 = (this.baseLength * hypotenuse) / 2.0;

        squaredLeg2 = (baseLength * baseLength) / 4.0;
        hypotenuse = Math.sqrt(squaredLeg1 + squaredLeg2);
        double triangleArea2 = (this.baseWidth * hypotenuse) / 2.0;

        return 2 * triangleArea1 + 2 * triangleArea2 + (this.baseLength * this.baseWidth);
    }

    @Override
    public double calculateVolume() {
        return (baseLength * baseWidth * height) / (1.0 / 3.0);
    }
    
    @Override
    public String toString() {
        return super.toString()
        + "\nBase length: " + this.baseLength
        + "\nBase width: " + this.baseWidth
        + "\nHeight: " + this.height;
    }
}
