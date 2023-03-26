package guide_to_inheritance.car;

import guide_to_inheritance.interfaces.Floatable;
import guide_to_inheritance.interfaces.Flyable;

public class ArmoredCar extends Car implements Floatable, Flyable {
    int bulletProofWindows;

    void remoteStartCar() {
        System.out.println("Starting remotely...");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String registerModel() {
        return model;
    }

    public static String msg() {
        return "ArmoredCar";
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    @Override
    public void FloatOnWater() {
        System.out.println("I can float!");
    }

    @Override
    public void repair() {
        Floatable.super.repair();
    }

    public void aMethod() {
        System.out.println(Floatable.durantion);
        System.out.println(Flyable.durantion);
    }
}
