package exercise9.inheritance;

public class Computer extends Equipment {
    private int hardDiskMemory;
    private int ramMemory;

    public int getHardDiskMemory() {
        return hardDiskMemory;
    }

    public void setHardDiskMemory(int hardDiskMemory) {
        this.hardDiskMemory = hardDiskMemory;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public String showData() {
        return super.showData()
                + "\nHD Memory: " + hardDiskMemory
                + "\nRAM Memory: " + ramMemory;
    }
}
