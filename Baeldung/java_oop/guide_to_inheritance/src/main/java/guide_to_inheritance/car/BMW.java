package guide_to_inheritance.car;

public class BMW extends Car {
    
    public void setModel(String model) {
        this.model = model;
    }

    public String registerModel() {
        return model;
    }
}
