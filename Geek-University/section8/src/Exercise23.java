import java.util.Locale;
import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a whole number to generate a triangle: ");
        int number = sc.nextInt();

        generateTriangle(number);

        sc.close();
    }

    static void generateTriangle(int n) {
        int height = 2 * n - 1;
        int middle = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= middle) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = middle; j > 0; j--) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
            System.out.println();
        }
    }
}
