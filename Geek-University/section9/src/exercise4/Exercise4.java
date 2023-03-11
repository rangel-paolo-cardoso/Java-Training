package exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Television tv = new Television();
        RemoteControl remote = new RemoteControl(tv);

        System.out.println("Is the TV on? " + tv.isOn());
        remote.turnTVOnOff();
        System.out.println("Is the TV on? " + tv.isOn());
        remote.decreaseVolume();
        for (int i = 0; i <= 100; i += 1) {
            remote.increaseVolume();
        }
        remote.getVolume();
        for (int i = 0; i <= 100; i += 1) {
            remote.increaseChannel();
        }
        remote.getCurrentChannel();

        for (int i = 0; i <= 100; i += 1) {
            remote.decreaseChannel();
        }
        remote.getCurrentChannel();

        System.out.print("Enter the number of a channel: ");
        remote.setChannel(sc.nextInt());

        remote.getCurrentChannel();

        sc.close();
    }
}
