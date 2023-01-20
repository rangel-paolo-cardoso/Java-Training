import java.util.Locale;
import java.util.Scanner;

public class Exercise42 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int countZeroToTwentyFiveRange = 0;
        int countTwentySixToFifityRange = 0;
        int countFiftyOneToSeventyFiveRange = 0;
        int countSeventySixToOneHundredRange = 0;

        int number = 0;
        do {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if (number >= 0 && number <= 25) {
                countZeroToTwentyFiveRange++;
            }
            if (number >= 26 && number <= 50) {
                countTwentySixToFifityRange++;
            }
            if (number >= 51 && number <= 75) {
                countFiftyOneToSeventyFiveRange++;
            }
            if (number >= 76 && number <= 100) {
                countSeventySixToOneHundredRange++;
            }
        } while (number > 0);

        System.out.println("[0-25]: " + countZeroToTwentyFiveRange);
        System.out.println("[26-50]: " + countTwentySixToFifityRange);
        System.out.println("[51-75]: " + countFiftyOneToSeventyFiveRange);
        System.out.println("[76-100]: " + countSeventySixToOneHundredRange);

        sc.close();
    }
}
