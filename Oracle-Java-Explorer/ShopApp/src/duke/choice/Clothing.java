package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size = "M";

    final private double MIN_PRICE = 10.0;
    final private double MIN_TAX = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        setSize(size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * MIN_TAX);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
