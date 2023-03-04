import java.util.Locale;
import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to calculate a series: ");
        int number = sc.nextInt();

        double seriesResult = calculateSeries(number);
        System.out.println("The value of the series is " + seriesResult);

        sc.close();
    }

    static double calculateSeries(int n) {
        double series = 0.0;
        double finalNumerator = n * n + 1;
        int aux = 0;
        for (int i = 2, j = 4; i < finalNumerator; i += aux, j += 1) {
            if (i == 2) {
                aux = 3;
            } else {
                aux += 2;
            }
            System.out.println(i + " / " + j);
            series += (float) i / j;
        }
        return series;
    }
}
