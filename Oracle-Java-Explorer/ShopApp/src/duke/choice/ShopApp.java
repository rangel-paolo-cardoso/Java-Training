package duke.choice;

import java.util.Locale;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        System.out.println("Customer is " + c1.getName());

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

        for (Clothing item : items) {
            System.out.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
        }

        int measurement = 3;
        c1.setSize(measurement);

        for (Clothing item : items) {
            if (c1.getSize().equals(item.getSize())) {
                total += item.getPrice();
                System.out.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("Total = " + total);
    }
}
