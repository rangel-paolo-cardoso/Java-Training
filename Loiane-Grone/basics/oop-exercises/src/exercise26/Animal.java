package exercise26;

public class Animal {

    private String name;
    private double length;
    private int paws;
    private String color;
    private String envorinment;
    private double speed;

    public Animal() {
        this.paws = 4;
    }    

    public Animal(String name, double length, int paws, String color, String envorinment, double speed) {
        this.name = name;
        this.length = length;
        this.paws = paws;
        this.color = color;
        this.envorinment = envorinment;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnvorinment() {
        return envorinment;
    }

    public void setEnvorinment(String envorinment) {
        this.envorinment = envorinment;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String toString() {
        return "Animal: " + this.getName()
                + "\nLength: " + this.getLength() + " cm"
                + "\nPaws: " + this.getPaws()
                + "\nColor: " + this.getColor()
                + "\nEnvironment: " + this.getEnvorinment()
                + "\nSpeed: " + this.getSpeed() + " m/s";
    }
}
