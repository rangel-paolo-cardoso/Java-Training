import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Gym survey ---\n");
        List<String> customerList = new ArrayList<>();
        int theTallestCode = 0;
        double theTallestHeight = Double.MIN_VALUE;
        double theTallestWeight = 0.0;

        int theShortestCode = 0;
        double theShortestHeight = Double.MAX_VALUE;
        double theShortestWeight = 0.0;

        int theFattestCode = 0;
        double theFattestHeight = 0.0;
        double theFattestWeight = Double.MIN_VALUE;

        int theThinnestCode = 0;
        double theThinnestHeight = 0.0;
        double theThinnestWeight = Double.MAX_VALUE;

        double averageHeight = 0.0;
        double averageWeight = 0.0;

        int count = 1;

        System.out.println("Enter 0 as the code to exit.");
        do {
            String customerData = "";
            System.out.print("Enter your code: ");
            int code = sc.nextInt();
            if (code == 0) {
                break;
            }
            System.out.print("Enter your height: ");
            double height = sc.nextDouble();
            System.out.print("Enter your weight: ");
            double weight = sc.nextDouble();
            customerData += code + "," + height + "," + weight;
            customerList.add(customerData);

            averageHeight += height;
            averageWeight += weight;
            count += 1;
        } while (true);

        for (int pos = 0; pos < customerList.size(); pos++) {
            String[] data = customerList.get(pos).split(",");
            if (Double.parseDouble(data[1]) > theTallestHeight) {
                theTallestCode = Integer.parseInt(data[0]);
                theTallestHeight = Double.parseDouble(data[1]);
                theTallestWeight = Double.parseDouble(data[2]);
            }
        }

        for (int pos = 0; pos < customerList.size(); pos++) {
            String[] data = customerList.get(pos).split(",");
            if (Double.parseDouble(data[1]) < theShortestHeight) {
                theShortestCode = Integer.parseInt(data[0]);
                theShortestHeight = Double.parseDouble(data[1]);
                theShortestWeight = Double.parseDouble(data[2]);
            }
        }

        for (int pos = 0; pos < customerList.size(); pos++) {
            String[] data = customerList.get(pos).split(",");
            if (Double.parseDouble(data[2]) > theFattestWeight) {
                theFattestCode = Integer.parseInt(data[0]);
                theFattestHeight = Double.parseDouble(data[1]);
                theFattestWeight = Double.parseDouble(data[2]);
            }
        }

        for (int pos = 0; pos < customerList.size(); pos++) {
            String[] data = customerList.get(pos).split(",");
            if (Double.parseDouble(data[2]) < theThinnestWeight) {
                theThinnestCode = Integer.parseInt(data[0]);
                theThinnestHeight = Double.parseDouble(data[1]);
                theThinnestWeight = Double.parseDouble(data[2]);
            }
        }

        averageHeight /= count;
        averageWeight /= count;

        System.out.println("\nData of the tallest");
        System.out.println("Code: " + theTallestCode);
        System.out.println("Heigh: " + theTallestHeight);
        System.out.println("Weight: " + theTallestWeight);

        System.out.println("\nData of the shortest");
        System.out.println("Code: " + theShortestCode);
        System.out.println("Heigh: " + theShortestHeight);
        System.out.println("Weight: " + theShortestWeight);

        System.out.println("\nData of the fattest");
        System.out.println("Code: " + theFattestCode);
        System.out.println("Heigh: " + theFattestHeight);
        System.out.println("Weight: " + theFattestWeight);

        System.out.println("\nData of the thinnest");
        System.out.println("Code: " + theThinnestCode);
        System.out.println("Heigh: " + theThinnestHeight);
        System.out.println("Weight: " + theThinnestWeight);

        System.out.println("\nAverage height: " + averageHeight);
        System.out.println("Average weight: " + averageWeight);

        sc.close();
    }
}
