package exercise11;

public class Bulb {
    
    private boolean on;

    public Bulb() {}

    public void changeState() {
        if (on) {
            setOn(false);
        } else {
            setOn(true);
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
