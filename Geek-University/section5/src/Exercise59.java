import java.util.Locale;
import java.util.Scanner;

public class Exercise59 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Inform the number of inhabitants of a city: ");
        int inhabitants = sc.nextInt();
        String[] consumers = new String[inhabitants];

        double highestConsumption = Double.MIN_VALUE;
        double lowestConsumption = Double.MAX_VALUE;
        double averageConsumption = 0.0;

        for (int pos = 0; pos < consumers.length; pos++) {
            System.out.print("Monthly consumption (KWH) of the " + (pos + 1) + "º consumer: ");
            double consumption = sc.nextDouble();

            System.out.print("Enter the consumer code: ");
            int consumerCode = sc.nextInt();

            averageConsumption += consumption;
            consumers[pos] = consumption + "," + consumerCode;
            if (consumption > highestConsumption) {
                highestConsumption = consumption;
            }
            if (consumption < lowestConsumption) {
                lowestConsumption = consumption;
            }
        }

        averageConsumption /= inhabitants;
        System.out.println("\nThe highest consumtion was " + highestConsumption);
        System.out.println("The lowest consumtion was " + lowestConsumption);
        System.out.println("The average consumtion was " + averageConsumption);

        for (int pos = 0; pos < consumers.length; pos++) {
            String[] consumerData = consumers[pos].split(",");
            double consumption = Double.parseDouble(consumerData[0]);
            int consumerType = Integer.parseInt(consumerData[1]);
            System.out.println(
                    "\nTotal comsumption of the "
                            + (pos + 1)
                            + "º consumer: "
                            + String.format("%.2f", consumption));

            System.out.print("Consumer code: ");
            switch (consumerType) {
                case 1:
                    System.out.print("Residential\n");
                    break;
                case 2:
                    System.out.print("Commercial\n");
                    break;
                case 3:
                    System.out.print("Industrial\n");
                    break;
            }
        }

        sc.close();
    }
}
