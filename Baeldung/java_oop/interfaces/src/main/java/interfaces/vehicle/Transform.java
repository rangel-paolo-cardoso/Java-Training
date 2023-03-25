package interfaces.vehicle;

public interface Transform {
    void transform();

    default void printSpaces() {
        System.out.println("Transform Specification");
    }
}
