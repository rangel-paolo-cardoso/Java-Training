package duke.choice;

import java.util.Locale;

public class ShopApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("Welcome " + c1.name);

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        Clothing item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        Clothing item3 = new Clothing();
        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";

        Clothing item4 = new Clothing();
        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";

        Clothing[] items = new Clothing[4];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        items[3] = item4;

        for (Clothing item : items) {
            System.out.println(item.description + "," + item.price + "," + item.size);
        }

        int measurement = 3;

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                c1.size = "S";
                break;
            case 4:
            case 5:
            case 6:
                c1.size = "M";
                break;
            case 7:
            case 8:
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        for (Clothing item : items) {
            if (c1.size.equals(item.size)) {
                total += item.price;
                System.out.println(item.description + "," + item.price + "," + item.size);
                if (total > 15) {break;}
            }
        }
        total += tax;
        total *= (1 + tax);
        System.out.println("Total = " + total);
    }
}
