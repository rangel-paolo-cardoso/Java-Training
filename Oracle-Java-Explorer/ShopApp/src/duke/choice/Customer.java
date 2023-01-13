package duke.choice;

public class Customer {
    private String name;
    private String size;

    private Clothing items[];

    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double sum = 0.0;
        for (Clothing item : items) {
            // if (getSize().equals(item.getSize())) {
            sum += item.getPrice();
            // System.out.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            // if (sum > 15) {
            //     break;
            // }

        }
        return sum;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
