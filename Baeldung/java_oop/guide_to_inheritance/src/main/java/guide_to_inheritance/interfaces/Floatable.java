package guide_to_inheritance.interfaces;

public interface Floatable {
    int durantion = 10;

    void FloatOnWater();

    default void repair() {
        System.out.println("Repairing Floatable object...");
    }
}
