import java.util.Locale;
import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times the equals symbol must appear: ");
        int numberOfSymbols = sc.nextInt();
        drawLine(numberOfSymbols);

        sc.close();
    }

    static void drawLine(int numberOfSymbols) {
        for (int i = 0; i < numberOfSymbols; i += 1) {
            System.out.printf("%s", "=");
        }
        System.out.println();
    }
}
