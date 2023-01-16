package duke.choice;

import java.util.Arrays;
import java.util.Locale;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", 3);

        System.out.println("Minimum price: " + Clothing.MIN_PRICE);
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

        Arrays.sort(c1.getItems());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item " + item);
        }

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        if (count == 0) {
            System.out.println("Count is zero, so we can't proceed with the division");
        } else {
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
        }
    }
}
