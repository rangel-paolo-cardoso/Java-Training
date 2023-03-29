package exercise8;

public class Microwave {
    private boolean on;
    private boolean lockedDoor;

    public Microwave() {}

    public Microwave(boolean on, boolean lockedDoor) {
        this.on = on;
        this.lockedDoor = lockedDoor;
    }

    public void turnOn() {
        if (this.lockedDoor) {
            this.on = true;
        } else {
            System.out.println("You cannot turn on the microwave with an open door!");
        }
    }

    public void turnOff() {
        this.on = false;
    }

    public void openDoor() {
        this.lockedDoor = false;
    }

    public void closeDoor() {
        this.lockedDoor = true;
    }

    @Override
    public String toString() {
        return "----- Microwave -----"
                + "\nOn: " + on
                + "\nLocked door: " + on
                + "\n";
    }
}
