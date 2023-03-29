import java.util.Locale;
import java.util.Scanner;

public class Exercise40 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cityCodeHighestNumberOfAccidents = 0;
        int cityCodeLowestNumberOfAccidents = 0;
        int highestNumberOfAccidents = Integer.MIN_VALUE;
        int lowestNumberOfAccidents = Integer.MAX_VALUE;

        double averageOfVehicles = 0.0;
        double averageAccidentsforCitysUpTo2000Vehicles = 0.0;
        double countCitiesWithLessThan2000Vehicles = 0.0;

        for (double count = 1.0; count <= 5; count++) {
            System.out.print("Enter the city code: ");
            int cityCode = sc.nextInt();

            System.out.print("Enter the number of passenger vehicles: ");
            int passgengerVihecles = sc.nextInt();

            System.out.print("Enter the number of accidents: ");
            int numberOfAccidents = sc.nextInt();

            if (passgengerVihecles < 2_000) {
                countCitiesWithLessThan2000Vehicles += 1;
                averageAccidentsforCitysUpTo2000Vehicles += numberOfAccidents;
            }

            if (numberOfAccidents > highestNumberOfAccidents) {
                cityCodeHighestNumberOfAccidents = cityCode;
                highestNumberOfAccidents = numberOfAccidents;
            }
            if (numberOfAccidents < lowestNumberOfAccidents) {
                cityCodeLowestNumberOfAccidents = cityCode;
                lowestNumberOfAccidents = numberOfAccidents;
            }
            averageOfVehicles += passgengerVihecles;
            if (count == 5) {
                averageOfVehicles /= count;
                averageAccidentsforCitysUpTo2000Vehicles /= countCitiesWithLessThan2000Vehicles;
            }
        }

        System.out.println("\nCity with the highest index of traffic accidents: " + cityCodeHighestNumberOfAccidents);
        System.out.println("Number of accidents: " + highestNumberOfAccidents);

        System.out.println("\nCity with the lowest index of traffic accidents: " + cityCodeLowestNumberOfAccidents);
        System.out.println("Number of accidents: " + lowestNumberOfAccidents);

        System.out.println("\nVehicle average: " + averageOfVehicles);
        System.out.println(
                "\nVehicle average for the cities where the number of passenger vehicles were lower than 2000: "
                        + averageAccidentsforCitysUpTo2000Vehicles);

        sc.close();
    }
}
