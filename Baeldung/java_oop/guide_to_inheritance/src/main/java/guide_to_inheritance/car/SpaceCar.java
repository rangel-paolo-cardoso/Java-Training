package guide_to_inheritance.car;

import guide_to_inheritance.interfaces.SpaceTraveller;

public class SpaceCar extends Car implements SpaceTraveller {

    public void setModel(String model) {
        this.model = model;
    }

    public String registerModel() {
        return model;
    }

    @Override
    public void remoteControl() {
        System.out.println("Starting remotely from outer space...");
    }
}
