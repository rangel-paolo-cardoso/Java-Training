import java.util.Locale;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double AN_HOUR_AS_SECONDS = 60.0 * 60.0;
        final double A_SECOND_AS_AN_HOUR = 1 / AN_HOUR_AS_SECONDS;

        whileLoop: {
            do {
                System.out.println("Option 1: convert from km/h to m/s.");
                System.out.println("Option 2: convert from m/s to km/h.");
                System.out.println("Option 3: exit.");

                System.out.print("Informe the option: ");
                int option = sc.nextInt();
    
                switch (option) {
                    case 1:
                        System.out.print("Informe the velocity in km/h: ");
                        double velocity = sc.nextDouble();
                        double meters = velocity * 1000.0;
                        double meterPerSecond = meters / AN_HOUR_AS_SECONDS;
                        System.out.printf("%.2f km/h = %.2f m/s\n", velocity, meterPerSecond);
                        break;
                    case 2:
                        System.out.print("Informe the velocity in m/s: ");
                        velocity = sc.nextDouble();
                        double kilometers = velocity / 1000.0;
                        double kilometerPerHour = kilometers / A_SECOND_AS_AN_HOUR;
                        System.out.printf("%.2f m/s = %.2f km/h\n", velocity, kilometerPerHour);
                        break;
                    case 3:
                        break whileLoop;
                }
            } while (true);
        }

        sc.close();
    }
}
