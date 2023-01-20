import java.util.Locale;
import java.util.Scanner;

public class Exercise36 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int difference = 0;

        int sumOfSquaredNumbers = 0;
        for (int count = 1; count <= 100; count += 1) {
            sumOfSquaredNumbers += count * count;
        }

        int theSquaredSumOfNumbers = 0;
        for (int count = 1; count <= 100; count += 1) {
            theSquaredSumOfNumbers += count;
        }
        theSquaredSumOfNumbers *= theSquaredSumOfNumbers;

        difference =  theSquaredSumOfNumbers - sumOfSquaredNumbers;

        System.out.println(theSquaredSumOfNumbers + " - " + sumOfSquaredNumbers + " = " + difference);

        sc.close();   
    }
}
