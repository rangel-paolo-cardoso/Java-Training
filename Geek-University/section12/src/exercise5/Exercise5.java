package exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the motorcycle's brand: ");
        String brand = sc.next();

        System.out.print("Enter the motorcycle's color: ");
        String color = sc.next();

        System.out.print("Enter the motorcycle's gear: ");
        int gear = sc.nextInt();

        Motorcycle motorcycle = new Motorcycle(brand, color, gear, true);

        System.out.println(motorcycle);

        for (int i = gear; i < 10; i += 1) {
            motorcycle.increaseGear();
        }

        System.out.println(motorcycle);

        for (int i = motorcycle.getGear(); i >= 0; i -= 1) {
            motorcycle.decreaseGear();
        }

        System.out.println(motorcycle);

        for (int i = 0; i < gear; i++) {
            motorcycle.increaseGear();
        }

        System.out.println(motorcycle);

        sc.close();
    }
}
