import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Enter the seconds: ");
        int seconds = sc.nextInt();

        System.out.println("Seconds " + calculateSeconds(hours, minutes, seconds));

        sc.close();
    }

    static int calculateSeconds(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }
}
