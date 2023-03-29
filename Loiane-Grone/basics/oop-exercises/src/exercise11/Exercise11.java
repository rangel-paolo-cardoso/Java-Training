package exercise11;

import java.util.Locale;

public class Exercise11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Bulb bulb = new Bulb();

        System.out.println("Is the bulb on? " + bulb.isOn());

        bulb.changeState();

        System.out.println("Is the bulb on? " + bulb.isOn());

        bulb.changeState();

        System.out.println("Is the bulb on? " + bulb.isOn());
    }
}
