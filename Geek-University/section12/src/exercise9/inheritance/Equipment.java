package exercise9.inheritance;

public class Equipment {
    private String code;
    private double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showData() {
        return "Code: " + code
                + "\nPrice: " + price;
    }
}
