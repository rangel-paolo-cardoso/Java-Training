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
        System.out.println("Welcome " + c1.name);

        Clothing item1 = new Clothing();
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        Clothing item2 = new Clothing();
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size =  "S";

        System.out.println(
            item1.description + "," + item1.price + "," + item1.size
        );
        System.out.println(
            item2.description + "," + item2.price + "," + item2.size
        );

        total = (item1.price + item2.price + tax) * (1 + tax);
        System.out.println("Total = " + total);
    }
}
