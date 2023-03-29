package exercise8;

import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Microwave microwave = new Microwave(false, false);

        System.out.println(microwave);

        microwave.turnOn();

        System.out.println(microwave);

        microwave.closeDoor();

        microwave.turnOn();

        System.out.println(microwave);

        microwave.turnOff();

        System.out.println(microwave);

        sc.close();
    }
}
