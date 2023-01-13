package duke.choice;

import java.util.Locale;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", 3);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");

        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing item3 = new Clothing("Green Scarf", 5, "S");

        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = new Clothing[4];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;

        int measurement = 3;
        c1.setSize(measurement);
        c1.addItems(items);

        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize() + ", " + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item " + item.getDescription());
        }
    }
}
