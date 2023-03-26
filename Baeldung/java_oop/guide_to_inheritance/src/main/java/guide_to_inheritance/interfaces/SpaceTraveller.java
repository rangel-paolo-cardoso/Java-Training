package guide_to_inheritance.interfaces;

public interface SpaceTraveller extends Floatable, Flyable {
    void remoteControl();

    @Override
    default void FloatOnWater() {
        System.out.println("I can float!!!");
    }

    @Override
    default void fly() {
        System.out.println("I can fly!!!");
    }

    @Override
    default void repair() {
        System.out.println("Repairing SpaceTraveller object...");
    }
}
