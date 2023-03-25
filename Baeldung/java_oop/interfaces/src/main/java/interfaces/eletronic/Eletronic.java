package interfaces.eletronic;

public interface Eletronic {

    // Constant
    String LED = "LED";

    // Abstract method
    int getElectricityUse();

    // Static melhot
    static boolean isEnergyEfficient(String eletronicType) {
        if (eletronicType.equals(LED)) {
            return true;
        }
        return false;
    }

    // default method
    default void printDescription() {
        System.out.println();
    }
}
