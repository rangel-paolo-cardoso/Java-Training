package exercise5;

public class Motorcycle {
    private String brand;
    private String color;
    private int gear;
    private int minimumGear;
    private int maximumGear;
    private boolean on;

    public Motorcycle() {
        this.minimumGear = 0;
        this.maximumGear = 9;
    }

    public Motorcycle(String brand, String color, int gear, boolean on) {
        this.brand = brand;
        this.color = color;
        this.gear = gear;
        this.minimumGear = 0;
        this.maximumGear = 9;
        this.on = on;
    }

    public Motorcycle(String brand, String color, int gear, int minimumGear, int maximumGear, boolean on) {
        this.brand = brand;
        this.color = color;
        this.gear = gear;
        this.minimumGear = minimumGear;
        this.maximumGear = maximumGear;
        this.on = on;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGear() {
        return gear;
    }

    public void increaseGear() {
        if (gear < maximumGear) {
            this.gear = this.gear + 1;
        } else {
            System.err.println("Maximum gear level!");
        }
    }

    public void decreaseGear() {
        if (gear > minimumGear) {
            this.gear = this.gear - 1;
        } else {
            System.err.println("Minimum gear level!");
        }
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    @Override
    public String toString() {
        return "----- Motorcycle -----"
                + "\nBrand: " + brand
                + ",\nColor: " + color
                + ",\nGear: " + gear
                + ",\nMinimum Gear: " + minimumGear
                + ",\nMaximum Gear: " + maximumGear
                + ",\nOn: " + on
                + "\n";
    }
}
