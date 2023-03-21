package exercise27;

public abstract class GeometricFigure {

    private String name;
    private String color;

    public GeometricFigure() {
    }

    public GeometricFigure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
        + "\nColor=" + this.color;
    }
}
