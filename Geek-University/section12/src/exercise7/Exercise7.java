package exercise7;

import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Television tv = new Television(false, 1, 5, 4, 100);

        tv.turnOn();
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();

        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        System.out.println(tv.toString());

        tv.turnOff();
        System.out.println(tv.toString());

        sc.close();
    }
}
