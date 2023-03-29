package exercise25;

public class TaxPayer {
    
    private String name;

    public TaxPayer() {}

    public TaxPayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName();
    }
}
