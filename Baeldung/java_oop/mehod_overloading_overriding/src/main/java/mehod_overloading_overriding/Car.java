package mehod_overloading_overriding;

public class Car extends Vehicle {

    @Override
    public String accelerate(long mph) {
        return "The car accelerates at : " + mph + " MPH.";
    }
}
