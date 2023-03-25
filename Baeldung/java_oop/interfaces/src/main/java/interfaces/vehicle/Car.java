package interfaces.vehicle;

public class Car implements Fly, Transform {

    @Override
    public void transform() {
        System.out.println("I can Fly!");
    }

    @Override
    public void fly() {
        System.out.println("I can Transform!");
    }
    
}
