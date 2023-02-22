package exercise7;

import java.util.Locale;

public class Exercise7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Bulb bulb = new Bulb();

        System.out.println("Is the bulb on? " + bulb.on);

        bulb.turnOnTheBulb();

        System.out.println("Is the bulb on? " + bulb.on);

        bulb.turnOffTheBulb();

        System.out.println("Is the bulb on? " + bulb.on);
    }
}
