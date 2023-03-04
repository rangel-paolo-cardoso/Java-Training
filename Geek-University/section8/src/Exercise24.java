import java.util.Locale;
import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to generate an equilateral triangle: ");
        int number = sc.nextInt();

        generateTriangle(number);

        sc.close();
    }

    static void generateTriangle(int n) {
        int base = 2 * n - 1;
        int middleBase = base / 2;
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < base; j += 1) {
                if (j < middleBase - aux || j > middleBase + aux) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            aux += 1;
        }
    }
}
