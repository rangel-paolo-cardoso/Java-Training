package exercise26;

public class Fish extends Animal {

    private String caracteristics;

    public Fish() {
    }

    public Fish(
            String name,
            double length,
            String color,
            String envorinment,
            double speed,
            String caracteristics) {
        super(name, length, 0, color, envorinment, speed);
        this.caracteristics = caracteristics;
    }

    public String getCaracteristics() {
        return caracteristics;
    }

    public void setCaracteristics(String caracteristics) {
        this.caracteristics = caracteristics;
    }

    public String toString() {
        return super.toString()
                + "\nCaracteristics: " + this.getCaracteristics();
    }
}
