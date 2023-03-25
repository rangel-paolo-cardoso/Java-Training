package interfaces.eletronic;

public class Computer implements Eletronic {

    @Override
    public int getElectricityUse() {
        return 1_000;
    }
}
