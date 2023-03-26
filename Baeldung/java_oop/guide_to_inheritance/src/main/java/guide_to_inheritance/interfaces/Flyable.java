package guide_to_inheritance.interfaces;

public interface Flyable {
    int durantion = 20;

    void fly();

    default void repair() {
        System.out.println("Repairing Flyable object...");
    }
}
