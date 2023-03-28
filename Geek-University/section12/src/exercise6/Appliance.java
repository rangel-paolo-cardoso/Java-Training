package exercise6;

public class Appliance {
    private boolean on;

    public Appliance() {
    }

    public Appliance(boolean on) {
        this.on = on;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    @Override
    public String toString() {
        return "----- Appliance -----"
                + "\nOn: " + on
                + "\n";
    }
}
