package duke.choice;

import java.util.Locale;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        Clothing item1 = new Clothing();
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        Clothing item2 = new Clothing();
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        Clothing item3 = new Clothing();
        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        Clothing item4 = new Clothing();
        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

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
