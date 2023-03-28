package exercise6;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Appliance appliance = new Appliance();

        appliance.turnOn();

        System.out.println(appliance.toString());

        appliance.turnOff();

        System.out.println(appliance.toString());

        sc.close();
    }
}
