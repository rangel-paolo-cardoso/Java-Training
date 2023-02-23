import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a temperature in celcius °: ");
        double celcius = sc.nextDouble();
        
        double fahrenheit = convertToFahrenheit(celcius);
        System.out.printf("%.2f°C = %.2f°F \n", celcius, fahrenheit);

        sc.close();
    }

    static double convertToFahrenheit(double celcius) {
        return celcius * (9.0 / 5.0) + 32.0;
    }
}
