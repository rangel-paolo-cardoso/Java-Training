package exercise3;

public class Elevator {
    
    private int currentFloor;
    private int totalFloors;
    private int capacity;
    private int peopleInside;

    public Elevator() {
        initializeCurrentFloor();
    }

    private void initializeCurrentFloor() {
        this.currentFloor = 0;
    }

    public void initilizeElevator(int capacity, int totalFloors) {
        setCapacity(capacity);
        setTotalFloors(totalFloors);
    }

    public void enterElevator() {
        if (this.peopleInside < this.capacity) {
            setPeopleInside(this.peopleInside + 1);
        } else {
            System.out.println("The elevator is totally crowded!");
        }
    }

    public void leaveElevator() {
        if (this.peopleInside > 0) {
            setPeopleInside(this.peopleInside - 1);
        } else {
            System.out.println("The elevator is already empty!");
        }
    }

    public void goUp() {
        if (this.currentFloor < this.totalFloors) {
            setCurrentFloor(this.currentFloor + 1);
        } else {
            System.out.println("The elevator is on the top floor!");
        }
    }

    public void goDown() {
        if (this.currentFloor > 0) {
            setCurrentFloor(this.currentFloor - 1);
        } else {
            System.out.println("The elevator is on the ground floor!");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    private void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    private void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPeopleInside() {
        return peopleInside;
    }

    private void setPeopleInside(int peopleInside) {
        this.peopleInside = peopleInside;
    }
}
