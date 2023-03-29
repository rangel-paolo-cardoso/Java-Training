import java.util.Locale;
import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Pogoda ---");
        double highestTemperature = Double.MIN_VALUE;
        double lowestTemperature = Double.MAX_VALUE;
        double averageTemperature = 0.0;
        int count = 1;

        do {
            System.out.print("Enter the " + count + "º temperature °C: ");
            double temperature = sc.nextDouble();
            sc.nextLine();
            averageTemperature += temperature;

            if (temperature > highestTemperature) {
                highestTemperature = temperature;
            }
            if (temperature < lowestTemperature) {
                lowestTemperature = temperature;
            }
            System.out.println("Do you want to continue? ");
            System.out.print("Press enter to exit or anything to continue... ");
            String answer = sc.nextLine();
            if (answer.isEmpty()) {
                break;
            }
            count += 1;
        } while (true);

        averageTemperature /= count;

        System.out.println("Highest temperature: " + highestTemperature + "°C");
        System.out.println("Lowest temperature: " + lowestTemperature + "°C");
        System.out.println("Average temperature: " + averageTemperature + "°C");

        sc.close();
    }
}
